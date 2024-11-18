package test;

import booking.Booking;
import booking.Time;
import client.Client;
import client.SiteUser;
import database.Database;
import management.ManagementTeam;
import management.Manager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parking.Car;
import parking.ParkingLot;
import parking.ParkingSpace;
import parking.Sensor;
import payment.CreditCard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class PaymentTest {

    ManagementTeam team1;

    Manager man1;
    Manager man2;
    Manager man3;

    ParkingLot lot1;
    ParkingLot lot2;
    ParkingLot lot3;

    SiteUser user1;
    SiteUser user2;

    @BeforeEach
    void setUp() throws Exception {
        /*
         * setting up the system
         * - create management team
         * - add manager
         * - add parking lot
         * - add all parking spaces
         */

        team1 = new ManagementTeam("Team 1");

        //managers are signed in by default when an instance is created
        man1 = new Manager("John", "Griffin", "jGriff@gmail.com", team1);
        man2 = new Manager("Jim", "Barten", "bartmen@gmail.com", team1);
        man3 = new Manager("Goob", "Inter", "intergoob@gmail.com", team1);

        lot1 = new ParkingLot(1, "William Small", "250 Centre Park");
        lot2 = new ParkingLot(2, "King Arboretum", "22 Arboretum ln");
        lot3 = new ParkingLot(3, "Window Sill", "22 Sill ln");

        user1 = new SiteUser();
        user2 = new SiteUser();
    }

    @AfterEach
    void tearDown() throws Exception {
        //clear information from the database so test methods do not interfere with one another
        Database.refreshInstance();
    }

    @Test
    void testDeposit() throws ParseException {
        /*
        test that deposit is returned/withheld at the end of booking
         */
        user1.register("user1@my.yorku.ca", "USER1@pwd", "User", "One", "Student");
        Client user1_client = (Client) user1.getState();

        CreditCard user1_card = new CreditCard("1000200030004000", 0124, 100);

        assertTrue(man1.validate(user1_client, user1_client.getEmailAddress()));

        ParkingSpace user1_space = user1.book(lot1, "ABCD1234", user1_card );

        Car c1 = new Car("c1","Black",user1_space.getId());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = dateFormat.parse("2019-04-15");
        Date d2 = dateFormat.parse("2019-04-15");

        Booking booking1 = new Booking(user1_client, new Time(11,10,22,14),
                d1, d2, user1_space, c1, user1_card);

        Sensor sensor1 = user1_space.getSensor();

        //client arrives at spot on time
        sensor1.setCar(c1);
        booking1.setArrival(true);

        //make client leave spot
        user1_client.pay(booking1);

        double expectedPay = (booking1.totalTime() - 1) * user1_client.getRate();
        //the amount paid by user should be accurate
        Assertions.assertEquals(expectedPay, user1_card.getRecentPayment(), 0.001);

        /*
        client does not arrive on time
         */
        ParkingSpace user1_space2 = user1.book(lot1, "ABCD1234", user1_card );
        Sensor sensor2 = user1_space2.getSensor();
        Booking booking2 = new Booking(user1_client, new Time(11,10,22,14),
                d1, d2, user1_space2, c1, user1_card);



        //client arrives at spot on time
        sensor2.setCar(c1);

        //make client leave spot
        user1_client.pay(booking2);

        double expectedPay2 = (booking2.totalTime()) * user1_client.getRate();
        //the amount paid by user should be accurate
        Assertions.assertEquals(expectedPay2, user1_card.getRecentPayment(), 0.001);

    }
}