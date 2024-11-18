package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        boolean boolean1 = database.Verifier.verifyPlate("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = database.Verifier.DUPE_EMAIL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Duplicate Email" + "'", str0, "Duplicate Email");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Class[] classArray0 = client.Client.subclasses;
        org.junit.Assert.assertNotNull(classArray0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        booking.Booking booking6 = null;
        payment.Payable payable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor5.pay(booking6, payable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.getSpace()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        management.AutoAccountGenerationSystem autoAccountGenerationSystem0 = new management.AutoAccountGenerationSystem();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        parking.ParkingSpace parkingSpace6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = visitor5.find(parkingSpace6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpace.getLocation()\" because \"space\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = visitor5.cancelBooking(booking6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        boolean boolean1 = database.Verifier.verifyPassword("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        parking.ParkingSpace parkingSpace0 = null;
        // The following exception was thrown during execution in test generation
        try {
            parking.Sensor sensor1 = new parking.Sensor(parkingSpace0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpace.getId()\" because \"space\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        boolean boolean1 = database.Verifier.verifyUsername("Duplicate Email");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        client.SiteUser siteUser0 = null;
        client.types.NonFacultyStaff nonFacultyStaff1 = new client.types.NonFacultyStaff(siteUser0);
        nonFacultyStaff1.setEmailAddress("");
        parking.ParkingSpace parkingSpace4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyStaff1.find(parkingSpace4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parking.ParkingSpace.getLocation()\" because \"space\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        boolean boolean1 = database.Verifier.verifyPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        booking.Booking booking6 = null;
        payment.DebitCard debitCard10 = new payment.DebitCard("Duplicate Email", 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor5.pay(booking6, (payment.Payable) debitCard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.getSpace()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        client.SiteUser siteUser0 = null;
        client.types.NonFacultyStaff nonFacultyStaff1 = new client.types.NonFacultyStaff(siteUser0);
        nonFacultyStaff1.setEmailAddress("");
        java.util.ArrayList<booking.Booking> bookingList4 = nonFacultyStaff1.getBookings();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyStaff1.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.SiteUser.setState(client.ClientState)\" because \"this.context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean1 = database.Verifier.verifyNonVisitorEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        client.SiteUser siteUser0 = null;
        client.types.NonFacultyStaff nonFacultyStaff5 = new client.types.NonFacultyStaff(siteUser0, "Duplicate Email", "hi!", "hi!", "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        java.lang.String str3 = managementTeam1.getTeamName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        client.SiteUser siteUser10 = null;
        client.types.Faculty faculty11 = new client.types.Faculty(siteUser10);
        faculty11.returnDeposit();
        database.Database database13 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList14 = database13.getSpaces();
        parking.ParkingLot[] parkingLotArray15 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList16 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList16, parkingLotArray15);
        database13.pLots = parkingLotList16;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList19 = database13.getSpaces();
        parking.ParkingLot parkingLot23 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot23.setEnabled(false);
        parking.ParkingSpace parkingSpace28 = new parking.ParkingSpace(parkingLot23, "hi!", "");
        database13.remove(parkingSpace28);
        database0.update((client.Client) faculty11, parkingSpace28);
        booking.Booking booking31 = null;
        booking.Time time36 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time37 = new booking.Time(time36);
        // The following exception was thrown during execution in test generation
        try {
            faculty11.changeBookingTime(booking31, time36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(parkingSpaceListList14);
        org.junit.Assert.assertNotNull(parkingLotArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList19);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        client.SiteUser siteUser0 = null;
        client.types.NonFacultyStaff nonFacultyStaff1 = new client.types.NonFacultyStaff(siteUser0);
        nonFacultyStaff1.setEmailAddress("");
        double double4 = nonFacultyStaff1.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        boolean boolean1 = database.Verifier.verifyPlate("Invalid Email");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str0 = database.Verifier.SUCCESSFUL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Successful" + "'", str0, "Successful");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        java.util.ArrayList<parking.ParkingSpace> parkingSpaceList4 = parkingLot3.getSpaces();
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty1 = new client.types.Faculty(siteUser0);
        faculty1.returnDeposit();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        client.SiteUser siteUser25 = null;
        client.types.Faculty faculty26 = new client.types.Faculty(siteUser25);
        parking.ParkingSpace parkingSpace28 = parkingLot6.getAvailableSpace((client.Client) faculty26, "hi!");
        payment.CreditCard creditCard33 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace34 = faculty1.book(parkingLot6, "Invalid Email", (payment.Payable) creditCard33);
        booking.Booking booking35 = null;
        booking.Time time40 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time41 = new booking.Time(time40);
        // The following exception was thrown during execution in test generation
        try {
            faculty1.changeBookingTime(booking35, time40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertNull(parkingSpace34);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        client.SiteUser siteUser10 = null;
        client.types.Faculty faculty11 = new client.types.Faculty(siteUser10);
        faculty11.returnDeposit();
        database.Database database13 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList14 = database13.getSpaces();
        parking.ParkingLot[] parkingLotArray15 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList16 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList16, parkingLotArray15);
        database13.pLots = parkingLotList16;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList19 = database13.getSpaces();
        parking.ParkingLot parkingLot23 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot23.setEnabled(false);
        parking.ParkingSpace parkingSpace28 = new parking.ParkingSpace(parkingLot23, "hi!", "");
        database13.remove(parkingSpace28);
        database0.update((client.Client) faculty11, parkingSpace28);
        booking.Booking booking31 = null;
        booking.Time time36 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int37 = time36.getStartMinute();
        time36.setEndMinute(1);
        // The following exception was thrown during execution in test generation
        try {
            faculty11.changeBookingTime(booking31, time36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(parkingSpaceListList14);
        org.junit.Assert.assertNotNull(parkingLotArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList19);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str0 = client.SiteUser.ALREADY_REGISTERED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Already Registered" + "'", str0, "Already Registered");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str0 = database.Verifier.WEAK_PW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Weak Password" + "'", str0, "Weak Password");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        java.lang.String str7 = siteVisitor1.register("Duplicate Email", "", "Duplicate Email", "Duplicate Email", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = siteVisitor1.login("Duplicate Email", "Already Registered");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.SiteUser.login(String, String)\" because \"this.context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Email" + "'", str7, "Invalid Email");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        parking.ParkingLot parkingLot26 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database27 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList28 = database27.getSpaces();
        parking.ParkingLot[] parkingLotArray29 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList30 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList30, parkingLotArray29);
        database27.pLots = parkingLotList30;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList33 = database27.getSpaces();
        parking.ParkingLot parkingLot37 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot37.setEnabled(false);
        parking.ParkingSpace parkingSpace42 = new parking.ParkingSpace(parkingLot37, "hi!", "");
        database27.remove(parkingSpace42);
        parkingLot26.remove(parkingSpace42);
        client.SiteUser siteUser45 = null;
        client.types.Faculty faculty46 = new client.types.Faculty(siteUser45);
        parking.ParkingSpace parkingSpace48 = parkingLot26.getAvailableSpace((client.Client) faculty46, "hi!");
        parking.ParkingLot parkingLot49 = parkingSpace48.getParkingLot();
        database0.add(parkingLot49);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(database27);
        org.junit.Assert.assertNotNull(parkingSpaceListList28);
        org.junit.Assert.assertNotNull(parkingLotArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList33);
        org.junit.Assert.assertNotNull(parkingSpace48);
        org.junit.Assert.assertNotNull(parkingLot49);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        management.Flag flag1 = new management.Flag("Weak Password");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        database.Database.refreshInstance();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        database.Verifier verifier0 = new database.Verifier();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty1 = new client.types.Faculty(siteUser0);
        faculty1.returnDeposit();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        client.SiteUser siteUser25 = null;
        client.types.Faculty faculty26 = new client.types.Faculty(siteUser25);
        parking.ParkingSpace parkingSpace28 = parkingLot6.getAvailableSpace((client.Client) faculty26, "hi!");
        payment.CreditCard creditCard33 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace34 = faculty1.book(parkingLot6, "Invalid Email", (payment.Payable) creditCard33);
        double double35 = creditCard33.getRecentPayment();
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertNull(parkingSpace34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        payment.CreditCard creditCard3 = new payment.CreditCard("Location:Duplicate Email ParkingSpace: -1", (int) (short) -1, 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        time5.setEndHour(1);
        int int8 = time5.getStartHour();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        parking.ParkingLot parkingLot29 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database30 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList31 = database30.getSpaces();
        parking.ParkingLot[] parkingLotArray32 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList33 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList33, parkingLotArray32);
        database30.pLots = parkingLotList33;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList36 = database30.getSpaces();
        parking.ParkingLot parkingLot40 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot40.setEnabled(false);
        parking.ParkingSpace parkingSpace45 = new parking.ParkingSpace(parkingLot40, "hi!", "");
        database30.remove(parkingSpace45);
        parkingLot29.remove(parkingSpace45);
        client.SiteUser siteUser48 = null;
        client.types.Faculty faculty49 = new client.types.Faculty(siteUser48);
        parking.ParkingSpace parkingSpace51 = parkingLot29.getAvailableSpace((client.Client) faculty49, "hi!");
        parking.ParkingLot parkingLot52 = parkingSpace51.getParkingLot();
        // The following exception was thrown during execution in test generation
        try {
            parkingLot6.add(parkingSpace51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(database30);
        org.junit.Assert.assertNotNull(parkingSpaceListList31);
        org.junit.Assert.assertNotNull(parkingLotArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList36);
        org.junit.Assert.assertNotNull(parkingSpace51);
        org.junit.Assert.assertNotNull(parkingLot52);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        visitor5.setPassword("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        management.ManagementTeam managementTeam24 = new management.ManagementTeam("");
        java.lang.String str25 = managementTeam24.getPassword();
        booking.Booking booking26 = null;
        managementTeam24.cancel(booking26);
        database0.add(managementTeam24);
        database0.printClientNames();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        parking.ParkingIterator parkingIterator26 = parkingSpace25.availableSpotsIterator();
        parkingSpace25.disable();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNull(parkingIterator26);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        parking.ParkingSpace parkingSpace8 = new parking.ParkingSpace(parkingLot3, "hi!", "");
        int int9 = parkingLot3.getId();
        parking.ParkingSpace parkingSpace12 = new parking.ParkingSpace(parkingLot3, "", "Duplicate Email");
        management.ManagementTeam managementTeam14 = new management.ManagementTeam("");
        managementTeam14.setTeamName("hi!");
        parking.ParkingLot parkingLot20 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database21 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList22 = database21.getSpaces();
        parking.ParkingLot[] parkingLotArray23 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList24 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList24, parkingLotArray23);
        database21.pLots = parkingLotList24;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList27 = database21.getSpaces();
        parking.ParkingLot parkingLot31 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot31.setEnabled(false);
        parking.ParkingSpace parkingSpace36 = new parking.ParkingSpace(parkingLot31, "hi!", "");
        database21.remove(parkingSpace36);
        parkingLot20.remove(parkingSpace36);
        client.SiteUser siteUser39 = null;
        client.types.Faculty faculty40 = new client.types.Faculty(siteUser39);
        parking.ParkingSpace parkingSpace42 = parkingLot20.getAvailableSpace((client.Client) faculty40, "hi!");
        parking.ParkingLot parkingLot43 = parkingSpace42.getParkingLot();
        boolean boolean44 = managementTeam14.disable((parking.Parking) parkingSpace42);
        client.SiteUser siteUser45 = null;
        client.types.NonFacultyStaff nonFacultyStaff46 = new client.types.NonFacultyStaff(siteUser45);
        nonFacultyStaff46.setEmailAddress("");
        nonFacultyStaff46.setRATE(0.0d);
        parkingSpace42.setOccupant((client.Client) nonFacultyStaff46);
        // The following exception was thrown during execution in test generation
        try {
            parkingLot3.add(parkingSpace42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 27");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(database21);
        org.junit.Assert.assertNotNull(parkingSpaceListList22);
        org.junit.Assert.assertNotNull(parkingLotArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList27);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertNotNull(parkingLot43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        int int6 = time5.getStartHour();
        int int7 = time5.getEndHour();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor1 = new client.types.Visitor(siteUser0);
        java.lang.String str2 = visitor1.getLastname();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lastname" + "'", str2, "lastname");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        java.lang.String str22 = parkingSpace19.toString();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        client.SiteUser siteUser0 = null;
        client.types.NonFacultyStaff nonFacultyStaff1 = new client.types.NonFacultyStaff(siteUser0);
        nonFacultyStaff1.setEmailAddress("");
        nonFacultyStaff1.setApproved(false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        parking.Parking parking3 = null;
        managementTeam1.enable(parking3);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap5 = managementTeam1.getParkingTodos();
        java.util.ArrayList<management.Manager> managerList6 = null;
        managementTeam1.setTeam(managerList6);
        parking.ParkingLot parkingLot11 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database12 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database12.getSpaces();
        parking.ParkingLot[] parkingLotArray14 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList15 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList15, parkingLotArray14);
        database12.pLots = parkingLotList15;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList18 = database12.getSpaces();
        parking.ParkingLot parkingLot22 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot22.setEnabled(false);
        parking.ParkingSpace parkingSpace27 = new parking.ParkingSpace(parkingLot22, "hi!", "");
        database12.remove(parkingSpace27);
        parkingLot11.remove(parkingSpace27);
        client.SiteUser siteUser30 = null;
        client.types.Faculty faculty31 = new client.types.Faculty(siteUser30);
        parking.ParkingSpace parkingSpace33 = parkingLot11.getAvailableSpace((client.Client) faculty31, "hi!");
        java.lang.String str34 = faculty31.getPassword();
        managementTeam1.verify((client.Client) faculty31);
        java.util.ArrayList<management.Manager> managerList36 = managementTeam1.getTeam();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parkingMap5);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingLotArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList18);
        org.junit.Assert.assertNotNull(parkingSpace33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "password" + "'", str34, "password");
        org.junit.Assert.assertNull(managerList36);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        parking.Car car3 = new parking.Car("", "Already Registered", "Unkown");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        java.lang.String str4 = parkingLot3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int5 = time4.getStartMinute();
        time4.setEndMinute(1);
        int int8 = time4.getStartHour();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<client.Client> clientList6 = database0.getClients();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(clientList6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        parking.Parking parking3 = null;
        managementTeam1.enable(parking3);
        booking.Booking booking5 = null;
        managementTeam1.cancel(booking5);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        parking.Parking parking3 = null;
        managementTeam1.enable(parking3);
        parking.ParkingLot parkingLot8 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database9 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database9.getSpaces();
        parking.ParkingLot[] parkingLotArray11 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList12 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList12, parkingLotArray11);
        database9.pLots = parkingLotList12;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList15 = database9.getSpaces();
        parking.ParkingLot parkingLot19 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot19.setEnabled(false);
        parking.ParkingSpace parkingSpace24 = new parking.ParkingSpace(parkingLot19, "hi!", "");
        database9.remove(parkingSpace24);
        parkingLot8.remove(parkingSpace24);
        client.SiteUser siteUser27 = null;
        client.types.Faculty faculty28 = new client.types.Faculty(siteUser27);
        parking.ParkingSpace parkingSpace30 = parkingLot8.getAvailableSpace((client.Client) faculty28, "hi!");
        parking.ParkingIterator parkingIterator31 = parkingSpace30.availableSpotsIterator();
        managementTeam1.enable((parking.Parking) parkingSpace30);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap33 = managementTeam1.getParkingTodos();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(database9);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingLotArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList15);
        org.junit.Assert.assertNotNull(parkingSpace30);
        org.junit.Assert.assertNull(parkingIterator31);
        org.junit.Assert.assertNotNull(parkingMap33);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int5 = time4.getEndHour();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        parking.ParkingLot parkingLot12 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot12.setEnabled(false);
        parking.ParkingSpace parkingSpace17 = new parking.ParkingSpace(parkingLot12, "hi!", "");
        int int18 = parkingLot12.getId();
        parkingLot12.disable();
        java.util.ArrayList<parking.ParkingSpace> parkingSpaceList20 = parkingLot12.getSpaces();
        boolean boolean21 = managementTeam4.disable((parking.Parking) parkingLot12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty5 = new client.types.Faculty(siteUser0, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean6 = faculty5.isApproved();
        payment.CreditCard creditCard10 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double11 = creditCard10.getRecentPayment();
        java.lang.String str12 = faculty5.deposit((payment.Payable) creditCard10);
        booking.Booking booking13 = null;
        booking.Time time18 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time19 = new booking.Time(time18);
        // The following exception was thrown during execution in test generation
        try {
            faculty5.changeBookingTime(booking13, time18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment Successful" + "'", str12, "Payment Successful");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty5 = new client.types.Faculty(siteUser0, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean6 = faculty5.isApproved();
        booking.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = faculty5.cancelBooking(booking7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("Invalid Email");
        java.lang.String str2 = managementTeam1.getTeamName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid Email" + "'", str2, "Invalid Email");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        management.Manager manager3 = null;
        managementTeam1.setSuper(manager3);
        booking.Booking booking5 = null;
        managementTeam1.cancel(booking5);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        client.SiteUser siteUser0 = null;
        client.types.Student student1 = new client.types.Student(siteUser0);
        java.lang.String str2 = student1.getEmailAddress();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "email" + "'", str2, "email");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "Invalid Email", "Weak Password", "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            visitor5.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.SiteUser.setState(client.ClientState)\" because \"this.context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        booking.Booking booking2 = null;
        boolean boolean3 = siteVisitor1.cancelBooking(booking2);
        parking.ParkingLot parkingLot7 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database8 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList9 = database8.getSpaces();
        parking.ParkingLot[] parkingLotArray10 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList11 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList11, parkingLotArray10);
        database8.pLots = parkingLotList11;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList14 = database8.getSpaces();
        parking.ParkingLot parkingLot18 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot18.setEnabled(false);
        parking.ParkingSpace parkingSpace23 = new parking.ParkingSpace(parkingLot18, "hi!", "");
        database8.remove(parkingSpace23);
        parkingLot7.remove(parkingSpace23);
        parkingLot7.enable();
        payment.CreditCard creditCard31 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace32 = siteVisitor1.book(parkingLot7, "Unkown", (payment.Payable) creditCard31);
        double double33 = creditCard31.getRecentPayment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(parkingSpaceListList9);
        org.junit.Assert.assertNotNull(parkingLotArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList14);
        org.junit.Assert.assertNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        database0.setPspace();
        database0.printClientNames();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        client.SiteUser siteUser9 = null;
        client.types.Faculty faculty14 = new client.types.Faculty(siteUser9, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean16 = manager8.validate((client.Client) faculty14, "Already Registered");
        booking.Booking booking17 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager8.cancel(booking17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.cancel()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        parking.ParkingLot parkingLot5 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database6 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList7 = database6.getSpaces();
        parking.ParkingLot[] parkingLotArray8 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList9 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList9, parkingLotArray8);
        database6.pLots = parkingLotList9;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList12 = database6.getSpaces();
        client.SiteUser siteUser13 = null;
        client.types.NonFacultyStaff nonFacultyStaff14 = new client.types.NonFacultyStaff(siteUser13);
        database6.add((client.Client) nonFacultyStaff14);
        client.SiteUser siteUser16 = null;
        client.types.Faculty faculty17 = new client.types.Faculty(siteUser16);
        faculty17.returnDeposit();
        database.Database database19 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList20 = database19.getSpaces();
        parking.ParkingLot[] parkingLotArray21 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList22 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList22, parkingLotArray21);
        database19.pLots = parkingLotList22;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList25 = database19.getSpaces();
        parking.ParkingLot parkingLot29 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot29.setEnabled(false);
        parking.ParkingSpace parkingSpace34 = new parking.ParkingSpace(parkingLot29, "hi!", "");
        database19.remove(parkingSpace34);
        database6.update((client.Client) faculty17, parkingSpace34);
        parkingLot5.disable(parkingSpace34);
        int int38 = parkingLot5.getId();
        client.SiteUser siteUser40 = null;
        client.types.NonFacultyStaff nonFacultyStaff41 = new client.types.NonFacultyStaff(siteUser40);
        nonFacultyStaff41.setEmailAddress("");
        client.SiteUser siteUser44 = null;
        client.types.Faculty faculty45 = new client.types.Faculty(siteUser44);
        faculty45.returnDeposit();
        parking.ParkingLot parkingLot50 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database51 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList52 = database51.getSpaces();
        parking.ParkingLot[] parkingLotArray53 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList54 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList54, parkingLotArray53);
        database51.pLots = parkingLotList54;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList57 = database51.getSpaces();
        parking.ParkingLot parkingLot61 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot61.setEnabled(false);
        parking.ParkingSpace parkingSpace66 = new parking.ParkingSpace(parkingLot61, "hi!", "");
        database51.remove(parkingSpace66);
        parkingLot50.remove(parkingSpace66);
        client.SiteUser siteUser69 = null;
        client.types.Faculty faculty70 = new client.types.Faculty(siteUser69);
        parking.ParkingSpace parkingSpace72 = parkingLot50.getAvailableSpace((client.Client) faculty70, "hi!");
        payment.CreditCard creditCard77 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace78 = faculty45.book(parkingLot50, "Invalid Email", (payment.Payable) creditCard77);
        payment.DebitCard debitCard83 = new payment.DebitCard("Duplicate Email", 100, (int) (byte) -1);
        parking.ParkingSpace parkingSpace84 = nonFacultyStaff41.book(parkingLot50, "", (payment.Payable) debitCard83);
        parking.ParkingSpace parkingSpace85 = siteVisitor1.book(parkingLot5, "Location:Duplicate Email ParkingSpace: -1", (payment.Payable) debitCard83);
        boolean boolean87 = debitCard83.makePayment((double) ' ');
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(parkingSpaceListList7);
        org.junit.Assert.assertNotNull(parkingLotArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList12);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(parkingSpaceListList20);
        org.junit.Assert.assertNotNull(parkingLotArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList25);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(database51);
        org.junit.Assert.assertNotNull(parkingSpaceListList52);
        org.junit.Assert.assertNotNull(parkingLotArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList57);
        org.junit.Assert.assertNotNull(parkingSpace72);
        org.junit.Assert.assertNull(parkingSpace78);
        org.junit.Assert.assertNull(parkingSpace84);
        org.junit.Assert.assertNull(parkingSpace85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        database0.printClientNames();
        java.util.ArrayList<management.ManagementTeam> managementTeamList7 = database0.getTeams();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database0.getSpaces();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(managementTeamList7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        parking.Sensor sensor22 = parkingSpace19.getSensor();
        boolean boolean23 = sensor22.getOccupied();
        boolean boolean24 = sensor22.getOccupied();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(sensor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        java.lang.String str6 = parkingLot3.getLocation();
        int int7 = parkingLot3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Duplicate Email" + "'", str6, "Duplicate Email");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        double double6 = time4.totalTime();
        double double7 = time4.totalTime();
        booking.Time time8 = new booking.Time(time4);
        int int9 = time8.getEndHour();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.0d + "'", double6 == 101.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        double double6 = time5.totalTime();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.0d + "'", double6 == 101.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        manager8.enableAllLots();
        management.ManagementTeam managementTeam12 = new management.ManagementTeam("");
        java.lang.String str13 = managementTeam12.getPassword();
        parking.Parking parking14 = null;
        managementTeam12.enable(parking14);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap16 = managementTeam12.getParkingTodos();
        java.util.ArrayList<management.Manager> managerList17 = null;
        managementTeam12.setTeam(managerList17);
        parking.ParkingLot parkingLot22 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database23 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList24 = database23.getSpaces();
        parking.ParkingLot[] parkingLotArray25 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList26 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList26, parkingLotArray25);
        database23.pLots = parkingLotList26;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList29 = database23.getSpaces();
        parking.ParkingLot parkingLot33 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot33.setEnabled(false);
        parking.ParkingSpace parkingSpace38 = new parking.ParkingSpace(parkingLot33, "hi!", "");
        database23.remove(parkingSpace38);
        parkingLot22.remove(parkingSpace38);
        client.SiteUser siteUser41 = null;
        client.types.Faculty faculty42 = new client.types.Faculty(siteUser41);
        parking.ParkingSpace parkingSpace44 = parkingLot22.getAvailableSpace((client.Client) faculty42, "hi!");
        java.lang.String str45 = faculty42.getPassword();
        managementTeam12.verify((client.Client) faculty42);
        java.util.HashMap<booking.Booking, management.Flag> bookingMap47 = managementTeam12.getBookingTodos();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = manager8.generateAccount("Successful", managementTeam12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Incorrect password");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(parkingMap16);
        org.junit.Assert.assertNotNull(database23);
        org.junit.Assert.assertNotNull(parkingSpaceListList24);
        org.junit.Assert.assertNotNull(parkingLotArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList29);
        org.junit.Assert.assertNotNull(parkingSpace44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "password" + "'", str45, "password");
        org.junit.Assert.assertNotNull(bookingMap47);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        java.lang.String str26 = faculty23.getPassword();
        booking.Booking booking27 = null;
        parking.ParkingLot parkingLot31 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database32 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList33 = database32.getSpaces();
        parking.ParkingLot[] parkingLotArray34 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList35 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList35, parkingLotArray34);
        database32.pLots = parkingLotList35;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList38 = database32.getSpaces();
        parking.ParkingLot parkingLot42 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot42.setEnabled(false);
        parking.ParkingSpace parkingSpace47 = new parking.ParkingSpace(parkingLot42, "hi!", "");
        database32.remove(parkingSpace47);
        parkingLot31.remove(parkingSpace47);
        client.SiteUser siteUser50 = null;
        client.types.Faculty faculty51 = new client.types.Faculty(siteUser50);
        parking.ParkingSpace parkingSpace53 = parkingLot31.getAvailableSpace((client.Client) faculty51, "hi!");
        java.lang.String str54 = faculty51.toString();
        parking.ParkingLot parkingLot58 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot58.setEnabled(false);
        parking.ParkingSpace parkingSpace63 = new parking.ParkingSpace(parkingLot58, "hi!", "");
        int int64 = parkingLot58.getId();
        parkingLot58.disable();
        client.SiteUser siteUser67 = null;
        client.types.Visitor visitor72 = new client.types.Visitor(siteUser67, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount73 = new payment.BankAccount((client.Client) visitor72);
        parking.ParkingSpace parkingSpace74 = faculty51.book(parkingLot58, "Weak Password", (payment.Payable) bankAccount73);
        double double75 = bankAccount73.getBalance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = faculty23.pay(booking27, (payment.Payable) bankAccount73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.getSpace()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "password" + "'", str26, "password");
        org.junit.Assert.assertNotNull(database32);
        org.junit.Assert.assertNotNull(parkingSpaceListList33);
        org.junit.Assert.assertNotNull(parkingLotArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList38);
        org.junit.Assert.assertNotNull(parkingSpace53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "client.types.Faculty" + "'", str54, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
        org.junit.Assert.assertNull(parkingSpace74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        parking.Car car3 = new parking.Car("Successful", "Invalid Email", "Duplicate Email");
        java.lang.String str4 = car3.getColor();
        java.lang.String str5 = car3.getModel();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Email" + "'", str4, "Invalid Email");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Successful" + "'", str5, "Successful");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        booking.Booking booking3 = null;
        managementTeam1.cancel(booking3);
        java.util.ArrayList<management.Manager> managerList5 = managementTeam1.getTeam();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(managerList5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        java.lang.String str26 = parkingLot6.toString();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = database0.getUsers();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        client.SiteUser siteUser0 = null;
        client.types.NonFacultyStaff nonFacultyStaff1 = new client.types.NonFacultyStaff(siteUser0);
        nonFacultyStaff1.setEmailAddress("");
        client.SiteUser siteUser4 = null;
        client.types.Faculty faculty5 = new client.types.Faculty(siteUser4);
        faculty5.returnDeposit();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database11 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList12 = database11.getSpaces();
        parking.ParkingLot[] parkingLotArray13 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList14 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList14, parkingLotArray13);
        database11.pLots = parkingLotList14;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList17 = database11.getSpaces();
        parking.ParkingLot parkingLot21 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot21.setEnabled(false);
        parking.ParkingSpace parkingSpace26 = new parking.ParkingSpace(parkingLot21, "hi!", "");
        database11.remove(parkingSpace26);
        parkingLot10.remove(parkingSpace26);
        client.SiteUser siteUser29 = null;
        client.types.Faculty faculty30 = new client.types.Faculty(siteUser29);
        parking.ParkingSpace parkingSpace32 = parkingLot10.getAvailableSpace((client.Client) faculty30, "hi!");
        payment.CreditCard creditCard37 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace38 = faculty5.book(parkingLot10, "Invalid Email", (payment.Payable) creditCard37);
        payment.DebitCard debitCard43 = new payment.DebitCard("Duplicate Email", 100, (int) (byte) -1);
        parking.ParkingSpace parkingSpace44 = nonFacultyStaff1.book(parkingLot10, "", (payment.Payable) debitCard43);
        java.lang.String str45 = parkingLot10.getLocation();
        parking.ParkingIterator parkingIterator46 = parkingLot10.availableSpotsIterator();
        org.junit.Assert.assertNotNull(database11);
        org.junit.Assert.assertNotNull(parkingSpaceListList12);
        org.junit.Assert.assertNotNull(parkingLotArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList17);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertNull(parkingSpace38);
        org.junit.Assert.assertNull(parkingSpace44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Duplicate Email" + "'", str45, "Duplicate Email");
        org.junit.Assert.assertNotNull(parkingIterator46);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        java.util.ArrayList<booking.Booking> bookingList10 = nonFacultyStaff8.getBookings();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        parking.Car car3 = new parking.Car("Successful", "Invalid Email", "Duplicate Email");
        java.lang.String str4 = car3.getModel();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Successful" + "'", str4, "Successful");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        parking.ParkingLot parkingLot26 = parkingSpace25.getParkingLot();
        java.lang.String str27 = parkingSpace25.getLocation();
        parking.Sensor sensor28 = parkingSpace25.getSensor();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNotNull(parkingLot26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Location:Duplicate Email ParkingSpace: -1" + "'", str27, "Location:Duplicate Email ParkingSpace: -1");
        org.junit.Assert.assertNotNull(sensor28);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) (short) 100, "Payment Successful", "Successful");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        parking.Car car3 = new parking.Car("Successful", "Invalid Email", "Duplicate Email");
        java.lang.String str4 = car3.getColor();
        java.lang.String str5 = car3.getPlateNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid Email" + "'", str4, "Invalid Email");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Duplicate Email" + "'", str5, "Duplicate Email");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        client.SiteUser siteUser0 = null;
        client.types.NonFacultyStaff nonFacultyStaff1 = new client.types.NonFacultyStaff(siteUser0);
        nonFacultyStaff1.setEmailAddress("");
        java.lang.String str4 = nonFacultyStaff1.getEmailAddress();
        payment.BankAccount bankAccount5 = new payment.BankAccount((client.Client) nonFacultyStaff1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        time5.setEndHour(1);
        int int8 = time5.getEndMinute();
        int int9 = time5.getEndHour();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        client.SiteUser siteUser11 = null;
        client.types.NonFacultyStaff nonFacultyStaff12 = new client.types.NonFacultyStaff(siteUser11);
        database4.add((client.Client) nonFacultyStaff12);
        client.SiteUser siteUser14 = null;
        client.types.Faculty faculty15 = new client.types.Faculty(siteUser14);
        faculty15.returnDeposit();
        database.Database database17 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList18 = database17.getSpaces();
        parking.ParkingLot[] parkingLotArray19 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList20 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList20, parkingLotArray19);
        database17.pLots = parkingLotList20;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList23 = database17.getSpaces();
        parking.ParkingLot parkingLot27 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot27.setEnabled(false);
        parking.ParkingSpace parkingSpace32 = new parking.ParkingSpace(parkingLot27, "hi!", "");
        database17.remove(parkingSpace32);
        database4.update((client.Client) faculty15, parkingSpace32);
        parkingLot3.disable(parkingSpace32);
        java.lang.String str36 = parkingSpace32.getLocation();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(parkingSpaceListList18);
        org.junit.Assert.assertNotNull(parkingLotArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList23);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        managementTeam1.setTeamName("hi!");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database8 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList9 = database8.getSpaces();
        parking.ParkingLot[] parkingLotArray10 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList11 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList11, parkingLotArray10);
        database8.pLots = parkingLotList11;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList14 = database8.getSpaces();
        parking.ParkingLot parkingLot18 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot18.setEnabled(false);
        parking.ParkingSpace parkingSpace23 = new parking.ParkingSpace(parkingLot18, "hi!", "");
        database8.remove(parkingSpace23);
        parkingLot7.remove(parkingSpace23);
        client.SiteUser siteUser26 = null;
        client.types.Faculty faculty27 = new client.types.Faculty(siteUser26);
        parking.ParkingSpace parkingSpace29 = parkingLot7.getAvailableSpace((client.Client) faculty27, "hi!");
        parking.ParkingLot parkingLot30 = parkingSpace29.getParkingLot();
        boolean boolean31 = managementTeam1.disable((parking.Parking) parkingSpace29);
        client.SiteUser siteUser32 = null;
        client.types.NonFacultyStaff nonFacultyStaff33 = new client.types.NonFacultyStaff(siteUser32);
        nonFacultyStaff33.setEmailAddress("");
        nonFacultyStaff33.setRATE(0.0d);
        parkingSpace29.setOccupant((client.Client) nonFacultyStaff33);
        booking.Booking booking39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = nonFacultyStaff33.cancelBooking(booking39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(parkingSpaceListList9);
        org.junit.Assert.assertNotNull(parkingLotArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList14);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertNotNull(parkingLot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount6 = new payment.BankAccount((client.Client) visitor5);
        client.Client client7 = bankAccount6.getOwner();
        org.junit.Assert.assertNotNull(client7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        boolean boolean1 = database.Verifier.verifyNonVisitorEmail("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        manager8.enableAllLots();
        management.ManagementTeam managementTeam11 = new management.ManagementTeam("");
        java.lang.String str12 = managementTeam11.getPassword();
        parking.Parking parking13 = null;
        managementTeam11.enable(parking13);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap15 = managementTeam11.getParkingTodos();
        java.util.ArrayList<management.Manager> managerList16 = null;
        managementTeam11.setTeam(managerList16);
        manager8.setSuper(managementTeam11, "hi!");
        managementTeam11.setTeamName("Successful");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(parkingMap15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<client.Client> clientList1 = database0.getUnverifiedClients();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(clientList1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        client.SiteUser siteUser0 = null;
        client.types.Student student5 = new client.types.Student(siteUser0, "Weak Password", "Unkown", "Duplicate Email", "client.types.Faculty");
        booking.Booking booking6 = null;
        client.SiteUser siteUser7 = null;
        client.SiteVisitor siteVisitor8 = new client.SiteVisitor(siteUser7);
        booking.Booking booking9 = null;
        boolean boolean10 = siteVisitor8.cancelBooking(booking9);
        booking.Booking booking11 = null;
        payment.CreditCard creditCard15 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double16 = creditCard15.getRecentPayment();
        java.lang.String str17 = siteVisitor8.pay(booking11, (payment.Payable) creditCard15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = student5.pay(booking6, (payment.Payable) creditCard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.getSpace()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        parking.Sensor sensor22 = parkingSpace19.getSensor();
        java.lang.String str23 = sensor22.update();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(sensor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "There is no car at this place" + "'", str23, "There is no car at this place");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        database0.printClientNames();
        client.Client client9 = database0.getClient("hi!", "");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        parking.ParkingIterator parkingIterator26 = parkingLot6.availableSpotsIterator();
        java.lang.String str27 = parkingLot6.getName();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingIterator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        boolean boolean12 = managementTeam4.validate("Already Registered", "email", "client.types.Faculty");
        managementTeam4.setUsername("Successful");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty5 = new client.types.Faculty(siteUser0, "hi!", "Location:Duplicate Email ParkingSpace: -1", "Payment Successful", "Payment Successful");
        java.lang.String str6 = faculty5.getEmailAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        boolean boolean12 = managementTeam4.validate("Already Registered", "email", "client.types.Faculty");
        management.ManagementTeam managementTeam17 = new management.ManagementTeam("");
        java.lang.String str18 = managementTeam17.getPassword();
        management.Manager manager19 = null;
        managementTeam17.setSuper(manager19);
        management.Manager manager21 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam17);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty27 = new client.types.Faculty(siteUser22, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean29 = manager21.validate((client.Client) faculty27, "Already Registered");
        managementTeam4.setSuper(manager21);
        management.ManagementTeam managementTeam32 = new management.ManagementTeam("");
        java.lang.String str33 = managementTeam32.getPassword();
        parking.Parking parking34 = null;
        managementTeam32.enable(parking34);
        parking.ParkingLot parkingLot39 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database40 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList41 = database40.getSpaces();
        parking.ParkingLot[] parkingLotArray42 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList43 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList43, parkingLotArray42);
        database40.pLots = parkingLotList43;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList46 = database40.getSpaces();
        parking.ParkingLot parkingLot50 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot50.setEnabled(false);
        parking.ParkingSpace parkingSpace55 = new parking.ParkingSpace(parkingLot50, "hi!", "");
        database40.remove(parkingSpace55);
        parkingLot39.remove(parkingSpace55);
        client.SiteUser siteUser58 = null;
        client.types.Faculty faculty59 = new client.types.Faculty(siteUser58);
        parking.ParkingSpace parkingSpace61 = parkingLot39.getAvailableSpace((client.Client) faculty59, "hi!");
        parking.ParkingIterator parkingIterator62 = parkingSpace61.availableSpotsIterator();
        managementTeam32.enable((parking.Parking) parkingSpace61);
        parkingSpace61.setOccupied(true);
        boolean boolean66 = managementTeam4.disable((parking.Parking) parkingSpace61);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(database40);
        org.junit.Assert.assertNotNull(parkingSpaceListList41);
        org.junit.Assert.assertNotNull(parkingLotArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList46);
        org.junit.Assert.assertNotNull(parkingSpace61);
        org.junit.Assert.assertNull(parkingIterator62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getUsername();
        managementTeam1.setUsername("Invalid Email");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        parking.ParkingIterator parkingIterator26 = parkingSpace25.availableSpotsIterator();
        parking.Car car27 = parkingSpace25.getCar();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNull(parkingIterator26);
        org.junit.Assert.assertNull(car27);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        java.lang.String str26 = faculty23.toString();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot30.setEnabled(false);
        parking.ParkingSpace parkingSpace35 = new parking.ParkingSpace(parkingLot30, "hi!", "");
        int int36 = parkingLot30.getId();
        parkingLot30.disable();
        client.SiteUser siteUser39 = null;
        client.types.Visitor visitor44 = new client.types.Visitor(siteUser39, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount45 = new payment.BankAccount((client.Client) visitor44);
        parking.ParkingSpace parkingSpace46 = faculty23.book(parkingLot30, "Weak Password", (payment.Payable) bankAccount45);
        double double47 = bankAccount45.getBalance();
        bankAccount45.deposit((-1.0d));
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "client.types.Faculty" + "'", str26, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNull(parkingSpace46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str0 = database.Verifier.VERIFIED_EMAIL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Verified Email" + "'", str0, "Verified Email");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        client.SiteUser siteUser9 = null;
        client.types.Faculty faculty14 = new client.types.Faculty(siteUser9, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean16 = manager8.validate((client.Client) faculty14, "Already Registered");
        // The following exception was thrown during execution in test generation
        try {
            faculty14.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.SiteUser.setState(client.ClientState)\" because \"this.context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int5 = time4.getStartMinute();
        int int6 = time4.getEndMinute();
        double double7 = time4.totalTime();
        int int8 = time4.getStartHour();
        int int9 = time4.getEndHour();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        java.lang.String str7 = siteVisitor1.register("Duplicate Email", "", "Duplicate Email", "Duplicate Email", "hi!");
        java.lang.String str13 = siteVisitor1.register("hi!", "Duplicate Email", "Already Registered", "Duplicate Email", "Already Registered");
        booking.Booking booking14 = null;
        booking.Time time19 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int20 = time19.getStartMinute();
        time19.setEndMinute(1);
        siteVisitor1.changeBookingTime(booking14, time19);
        parking.ParkingLot parkingLot27 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database28 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList29 = database28.getSpaces();
        parking.ParkingLot[] parkingLotArray30 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList31 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList31, parkingLotArray30);
        database28.pLots = parkingLotList31;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList34 = database28.getSpaces();
        parking.ParkingLot parkingLot38 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot38.setEnabled(false);
        parking.ParkingSpace parkingSpace43 = new parking.ParkingSpace(parkingLot38, "hi!", "");
        database28.remove(parkingSpace43);
        parkingLot27.remove(parkingSpace43);
        parkingLot27.enable();
        payment.CreditCard creditCard51 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace52 = siteVisitor1.book(parkingLot27, "Location:Duplicate Email ParkingSpace: -1", (payment.Payable) creditCard51);
        parking.ParkingLot parkingLot56 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot56.setEnabled(false);
        parking.ParkingSpace parkingSpace61 = new parking.ParkingSpace(parkingLot56, "hi!", "");
        int int62 = parkingLot56.getId();
        parking.ParkingSpace parkingSpace65 = new parking.ParkingSpace(parkingLot56, "", "Duplicate Email");
        parkingLot27.remove(parkingSpace65);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Email" + "'", str7, "Invalid Email");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Email" + "'", str13, "Invalid Email");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(database28);
        org.junit.Assert.assertNotNull(parkingSpaceListList29);
        org.junit.Assert.assertNotNull(parkingLotArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList34);
        org.junit.Assert.assertNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 52 + "'", int62 == 52);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        database.Database database26 = database.Database.getInstance();
        java.util.ArrayList<parking.ParkingLot> parkingLotList27 = database26.pLots;
        database0.pLots = parkingLotList27;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList29 = database0.getSpaces();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(database26);
        org.junit.Assert.assertNotNull(parkingLotList27);
        org.junit.Assert.assertNotNull(parkingSpaceListList29);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        parking.ParkingLot parkingLot26 = parkingSpace25.getParkingLot();
        boolean boolean27 = parkingSpace25.isEnabled();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNotNull(parkingLot26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        parking.ParkingSpace parkingSpace8 = new parking.ParkingSpace(parkingLot3, "hi!", "");
        int int9 = parkingLot3.getId();
        java.lang.String str10 = parkingLot3.getLocation();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Duplicate Email" + "'", str10, "Duplicate Email");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        java.lang.String str26 = faculty23.toString();
        faculty23.setPassword("");
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "client.types.Faculty" + "'", str26, "client.types.Faculty");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        management.ManagementTeam managementTeam10 = new management.ManagementTeam("");
        java.lang.String str11 = managementTeam10.getPassword();
        management.Manager manager12 = null;
        managementTeam10.setSuper(manager12);
        manager8.setSuper(managementTeam10, "lastname");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        boolean boolean6 = visitor5.isApproved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        management.ManagementTeam managementTeam24 = new management.ManagementTeam("");
        java.lang.String str25 = managementTeam24.getPassword();
        booking.Booking booking26 = null;
        managementTeam24.cancel(booking26);
        database0.add(managementTeam24);
        management.ManagementTeam managementTeam33 = new management.ManagementTeam("");
        java.lang.String str34 = managementTeam33.getPassword();
        management.Manager manager35 = null;
        managementTeam33.setSuper(manager35);
        management.Manager manager37 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam33);
        manager37.enableAllLots();
        managementTeam24.add(manager37);
        manager37.disableAllLots();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int5 = time4.getStartMinute();
        int int6 = time4.getStartHour();
        int int7 = time4.getStartHour();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str0 = database.Verifier.STRONG_PW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Strong Password" + "'", str0, "Strong Password");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        parking.ParkingLot parkingLot5 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database6 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList7 = database6.getSpaces();
        parking.ParkingLot[] parkingLotArray8 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList9 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList9, parkingLotArray8);
        database6.pLots = parkingLotList9;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList12 = database6.getSpaces();
        client.SiteUser siteUser13 = null;
        client.types.NonFacultyStaff nonFacultyStaff14 = new client.types.NonFacultyStaff(siteUser13);
        database6.add((client.Client) nonFacultyStaff14);
        client.SiteUser siteUser16 = null;
        client.types.Faculty faculty17 = new client.types.Faculty(siteUser16);
        faculty17.returnDeposit();
        database.Database database19 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList20 = database19.getSpaces();
        parking.ParkingLot[] parkingLotArray21 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList22 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList22, parkingLotArray21);
        database19.pLots = parkingLotList22;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList25 = database19.getSpaces();
        parking.ParkingLot parkingLot29 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot29.setEnabled(false);
        parking.ParkingSpace parkingSpace34 = new parking.ParkingSpace(parkingLot29, "hi!", "");
        database19.remove(parkingSpace34);
        database6.update((client.Client) faculty17, parkingSpace34);
        parkingLot5.disable(parkingSpace34);
        int int38 = parkingLot5.getId();
        client.SiteUser siteUser40 = null;
        client.types.NonFacultyStaff nonFacultyStaff41 = new client.types.NonFacultyStaff(siteUser40);
        nonFacultyStaff41.setEmailAddress("");
        client.SiteUser siteUser44 = null;
        client.types.Faculty faculty45 = new client.types.Faculty(siteUser44);
        faculty45.returnDeposit();
        parking.ParkingLot parkingLot50 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database51 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList52 = database51.getSpaces();
        parking.ParkingLot[] parkingLotArray53 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList54 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList54, parkingLotArray53);
        database51.pLots = parkingLotList54;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList57 = database51.getSpaces();
        parking.ParkingLot parkingLot61 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot61.setEnabled(false);
        parking.ParkingSpace parkingSpace66 = new parking.ParkingSpace(parkingLot61, "hi!", "");
        database51.remove(parkingSpace66);
        parkingLot50.remove(parkingSpace66);
        client.SiteUser siteUser69 = null;
        client.types.Faculty faculty70 = new client.types.Faculty(siteUser69);
        parking.ParkingSpace parkingSpace72 = parkingLot50.getAvailableSpace((client.Client) faculty70, "hi!");
        payment.CreditCard creditCard77 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace78 = faculty45.book(parkingLot50, "Invalid Email", (payment.Payable) creditCard77);
        payment.DebitCard debitCard83 = new payment.DebitCard("Duplicate Email", 100, (int) (byte) -1);
        parking.ParkingSpace parkingSpace84 = nonFacultyStaff41.book(parkingLot50, "", (payment.Payable) debitCard83);
        parking.ParkingSpace parkingSpace85 = siteVisitor1.book(parkingLot5, "Location:Duplicate Email ParkingSpace: -1", (payment.Payable) debitCard83);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean88 = siteVisitor1.login("Payment Successful", "Verified Email");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.SiteUser.login(String, String)\" because \"this.context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(parkingSpaceListList7);
        org.junit.Assert.assertNotNull(parkingLotArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList12);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(parkingSpaceListList20);
        org.junit.Assert.assertNotNull(parkingLotArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList25);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(database51);
        org.junit.Assert.assertNotNull(parkingSpaceListList52);
        org.junit.Assert.assertNotNull(parkingLotArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList57);
        org.junit.Assert.assertNotNull(parkingSpace72);
        org.junit.Assert.assertNull(parkingSpace78);
        org.junit.Assert.assertNull(parkingSpace84);
        org.junit.Assert.assertNull(parkingSpace85);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        parking.Parking parking3 = null;
        managementTeam1.enable(parking3);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap5 = managementTeam1.getParkingTodos();
        java.util.ArrayList<management.Manager> managerList6 = null;
        managementTeam1.setTeam(managerList6);
        parking.ParkingLot parkingLot11 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database12 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database12.getSpaces();
        parking.ParkingLot[] parkingLotArray14 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList15 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList15, parkingLotArray14);
        database12.pLots = parkingLotList15;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList18 = database12.getSpaces();
        parking.ParkingLot parkingLot22 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot22.setEnabled(false);
        parking.ParkingSpace parkingSpace27 = new parking.ParkingSpace(parkingLot22, "hi!", "");
        database12.remove(parkingSpace27);
        parkingLot11.remove(parkingSpace27);
        client.SiteUser siteUser30 = null;
        client.types.Faculty faculty31 = new client.types.Faculty(siteUser30);
        parking.ParkingSpace parkingSpace33 = parkingLot11.getAvailableSpace((client.Client) faculty31, "hi!");
        java.lang.String str34 = faculty31.getPassword();
        managementTeam1.verify((client.Client) faculty31);
        java.util.HashMap<booking.Booking, management.Flag> bookingMap36 = managementTeam1.getBookingTodos();
        booking.Booking booking37 = null;
        managementTeam1.cancel(booking37);
        java.lang.String str39 = managementTeam1.getUsername();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parkingMap5);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingLotArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList18);
        org.junit.Assert.assertNotNull(parkingSpace33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "password" + "'", str34, "password");
        org.junit.Assert.assertNotNull(bookingMap36);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        management.Flag flag1 = new management.Flag("Unkown");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        time5.setEndHour(1);
        int int8 = time5.getEndMinute();
        int int9 = time5.getStartHour();
        int int10 = time5.getStartHour();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        parking.Sensor sensor22 = parkingSpace19.getSensor();
        // The following exception was thrown during execution in test generation
        try {
            sensor22.leaveCar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(sensor22);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        java.lang.String str6 = parkingLot3.getLocation();
        parking.ParkingIterator parkingIterator7 = parkingLot3.availableSpotsIterator();
        boolean boolean8 = parkingIterator7.hasNext();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Duplicate Email" + "'", str6, "Duplicate Email");
        org.junit.Assert.assertNotNull(parkingIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        management.Flag flag1 = new management.Flag("Location:Duplicate Email ParkingSpace: -1");
        flag1.setResolved(false);
        flag1.setResolved(false);
        boolean boolean6 = flag1.isResolved();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        java.lang.String str26 = faculty23.toString();
        faculty23.setEmailAddress("");
        // The following exception was thrown during execution in test generation
        try {
            faculty23.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.SiteUser.setState(client.ClientState)\" because \"this.context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "client.types.Faculty" + "'", str26, "client.types.Faculty");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        payment.MobilePayment mobilePayment2 = new payment.MobilePayment("There is no car at this place", "Successful");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        java.lang.String str7 = siteVisitor1.register("Duplicate Email", "", "Duplicate Email", "Duplicate Email", "hi!");
        java.lang.String str13 = siteVisitor1.register("Invalid Email", "hi!", "Invalid Email", "hi!", "Payment Successful");
        siteVisitor1.logout();
        booking.Booking booking15 = null;
        client.SiteUser siteUser16 = null;
        client.types.Faculty faculty21 = new client.types.Faculty(siteUser16, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean22 = faculty21.isApproved();
        payment.CreditCard creditCard26 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double27 = creditCard26.getRecentPayment();
        java.lang.String str28 = faculty21.deposit((payment.Payable) creditCard26);
        java.lang.String str29 = siteVisitor1.pay(booking15, (payment.Payable) creditCard26);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Email" + "'", str7, "Invalid Email");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Email" + "'", str13, "Invalid Email");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Payment Successful" + "'", str28, "Payment Successful");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<parking.ParkingLot> parkingLotList8 = database7.pLots;
        database0.setPlot(parkingLotList8);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList7 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = database0.getUsers();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(parkingSpaceListList7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        booking.Booking booking2 = null;
        boolean boolean3 = siteVisitor1.cancelBooking(booking2);
        booking.Booking booking4 = null;
        payment.CreditCard creditCard8 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double9 = creditCard8.getRecentPayment();
        java.lang.String str10 = siteVisitor1.pay(booking4, (payment.Payable) creditCard8);
        booking.Booking booking11 = null;
        boolean boolean12 = siteVisitor1.cancelBooking(booking11);
        booking.Booking booking13 = null;
        payment.Payable payable14 = null;
        java.lang.String str15 = siteVisitor1.pay(booking13, payable14);
        database.Database database16 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList17 = database16.getSpaces();
        parking.ParkingLot[] parkingLotArray18 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList19 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList19, parkingLotArray18);
        database16.pLots = parkingLotList19;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList22 = database16.getSpaces();
        client.SiteUser siteUser23 = null;
        client.types.NonFacultyStaff nonFacultyStaff24 = new client.types.NonFacultyStaff(siteUser23);
        database16.add((client.Client) nonFacultyStaff24);
        client.SiteUser siteUser26 = null;
        client.types.Faculty faculty27 = new client.types.Faculty(siteUser26);
        faculty27.returnDeposit();
        database.Database database29 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList30 = database29.getSpaces();
        parking.ParkingLot[] parkingLotArray31 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList32 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList32, parkingLotArray31);
        database29.pLots = parkingLotList32;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList35 = database29.getSpaces();
        parking.ParkingLot parkingLot39 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot39.setEnabled(false);
        parking.ParkingSpace parkingSpace44 = new parking.ParkingSpace(parkingLot39, "hi!", "");
        database29.remove(parkingSpace44);
        database16.update((client.Client) faculty27, parkingSpace44);
        parking.ParkingLot parkingLot47 = parkingSpace44.getParkingLot();
        client.SiteUser siteUser49 = null;
        client.types.Faculty faculty50 = new client.types.Faculty(siteUser49);
        faculty50.returnDeposit();
        parking.ParkingLot parkingLot55 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database56 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList57 = database56.getSpaces();
        parking.ParkingLot[] parkingLotArray58 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList59 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList59, parkingLotArray58);
        database56.pLots = parkingLotList59;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList62 = database56.getSpaces();
        parking.ParkingLot parkingLot66 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot66.setEnabled(false);
        parking.ParkingSpace parkingSpace71 = new parking.ParkingSpace(parkingLot66, "hi!", "");
        database56.remove(parkingSpace71);
        parkingLot55.remove(parkingSpace71);
        client.SiteUser siteUser74 = null;
        client.types.Faculty faculty75 = new client.types.Faculty(siteUser74);
        parking.ParkingSpace parkingSpace77 = parkingLot55.getAvailableSpace((client.Client) faculty75, "hi!");
        payment.CreditCard creditCard82 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace83 = faculty50.book(parkingLot55, "Invalid Email", (payment.Payable) creditCard82);
        parking.ParkingSpace parkingSpace84 = siteVisitor1.book(parkingLot47, "client.types.Faculty", (payment.Payable) creditCard82);
        booking.Booking booking85 = null;
        boolean boolean86 = siteVisitor1.cancelBooking(booking85);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(database16);
        org.junit.Assert.assertNotNull(parkingSpaceListList17);
        org.junit.Assert.assertNotNull(parkingLotArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList22);
        org.junit.Assert.assertNotNull(database29);
        org.junit.Assert.assertNotNull(parkingSpaceListList30);
        org.junit.Assert.assertNotNull(parkingLotArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList35);
        org.junit.Assert.assertNotNull(parkingLot47);
        org.junit.Assert.assertNotNull(database56);
        org.junit.Assert.assertNotNull(parkingSpaceListList57);
        org.junit.Assert.assertNotNull(parkingLotArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList62);
        org.junit.Assert.assertNotNull(parkingSpace77);
        org.junit.Assert.assertNull(parkingSpace83);
        org.junit.Assert.assertNull(parkingSpace84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        booking.Booking booking2 = null;
        boolean boolean3 = siteVisitor1.cancelBooking(booking2);
        booking.Booking booking4 = null;
        payment.CreditCard creditCard8 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double9 = creditCard8.getRecentPayment();
        java.lang.String str10 = siteVisitor1.pay(booking4, (payment.Payable) creditCard8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = siteVisitor1.login("Location:Duplicate Email ParkingSpace: -1", "Location:Duplicate Email ParkingSpace: -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.SiteUser.login(String, String)\" because \"this.context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        management.ManagementTeam managementTeam7 = new management.ManagementTeam("");
        java.lang.String str8 = managementTeam7.getPassword();
        management.Manager manager9 = null;
        managementTeam7.setSuper(manager9);
        management.Manager manager11 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam7);
        management.Manager manager12 = new management.Manager("Verified Email", "Successful", "password", managementTeam7);
        booking.Booking booking13 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager12.cancel(booking13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.cancel()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        payment.CreditCard creditCard3 = new payment.CreditCard("Successful", (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount6 = new payment.BankAccount((client.Client) visitor5);
        payment.CreditCard creditCard10 = new payment.CreditCard("hi!", 0, 100);
        java.lang.String str11 = visitor5.deposit((payment.Payable) creditCard10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment Successful" + "'", str11, "Payment Successful");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty5 = new client.types.Faculty(siteUser0, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean6 = faculty5.isApproved();
        payment.CreditCard creditCard10 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double11 = creditCard10.getRecentPayment();
        java.lang.String str12 = faculty5.deposit((payment.Payable) creditCard10);
        java.util.ArrayList<booking.Booking> bookingList13 = faculty5.getBookings();
        boolean boolean14 = faculty5.isApproved();
        booking.Booking booking15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = faculty5.pay(booking15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.getPaymentMethod()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment Successful" + "'", str12, "Payment Successful");
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.HashMap<management.ManagementTeam, java.lang.String> managementTeamMap0 = management.AutoAccountGenerationSystem.getPasswords();
        org.junit.Assert.assertNotNull(managementTeamMap0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        double double6 = visitor5.getRate();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        nonFacultyStaff8.setEmailAddress("");
        java.lang.String str11 = nonFacultyStaff8.getEmailAddress();
        payment.BankAccount bankAccount12 = nonFacultyStaff8.getAccount();
        java.lang.String str13 = visitor5.deposit((payment.Payable) bankAccount12);
        parking.Car car14 = null;
        visitor5.addCar(car14);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(bankAccount12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Payment Successful" + "'", str13, "Payment Successful");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        parking.Parking parking3 = null;
        managementTeam1.enable(parking3);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap5 = managementTeam1.getParkingTodos();
        java.lang.String str6 = managementTeam1.getPassword();
        java.util.HashMap<booking.Booking, management.Flag> bookingMap7 = managementTeam1.getBookingTodos();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parkingMap5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(bookingMap7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        parking.ParkingLot parkingLot26 = parkingSpace25.getParkingLot();
        client.SiteUser siteUser27 = null;
        client.types.Faculty faculty32 = new client.types.Faculty(siteUser27, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean33 = faculty32.isApproved();
        payment.CreditCard creditCard37 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double38 = creditCard37.getRecentPayment();
        java.lang.String str39 = faculty32.deposit((payment.Payable) creditCard37);
        java.util.ArrayList<booking.Booking> bookingList40 = faculty32.getBookings();
        boolean boolean41 = faculty32.isApproved();
        faculty32.setPassword("client.types.Faculty");
        parkingSpace25.setOccupant((client.Client) faculty32);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNotNull(parkingLot26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Payment Successful" + "'", str39, "Payment Successful");
        org.junit.Assert.assertNotNull(bookingList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        booking.Booking booking3 = null;
        managementTeam1.cancel(booking3);
        management.AutoAccountGenerationSystem.generateNewAccount(managementTeam1);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap6 = managementTeam1.getParkingTodos();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parkingMap6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        parking.Parking parking6 = null;
        managementTeam4.enable(parking6);
        management.Manager manager8 = new management.Manager("Successful", "Payment Successful", "Invalid Email", managementTeam4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        int int6 = time5.getStartHour();
        time5.setEndHour((int) (byte) -1);
        double double9 = time5.totalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        management.ManagementTeam managementTeam7 = new management.ManagementTeam("");
        java.lang.String str8 = managementTeam7.getPassword();
        management.Manager manager9 = null;
        managementTeam7.setSuper(manager9);
        management.Manager manager11 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam7);
        management.Manager manager12 = new management.Manager("Verified Email", "Successful", "password", managementTeam7);
        manager12.firstname = "email";
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        parking.ParkingSpace parkingSpace8 = new parking.ParkingSpace(parkingLot3, "hi!", "");
        int int9 = parkingLot3.getId();
        parking.ParkingLot parkingLot13 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database14 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList15 = database14.getSpaces();
        parking.ParkingLot[] parkingLotArray16 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList17 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList17, parkingLotArray16);
        database14.pLots = parkingLotList17;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList20 = database14.getSpaces();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot24.setEnabled(false);
        parking.ParkingSpace parkingSpace29 = new parking.ParkingSpace(parkingLot24, "hi!", "");
        database14.remove(parkingSpace29);
        parkingLot13.remove(parkingSpace29);
        client.SiteUser siteUser32 = null;
        client.types.Faculty faculty33 = new client.types.Faculty(siteUser32);
        parking.ParkingSpace parkingSpace35 = parkingLot13.getAvailableSpace((client.Client) faculty33, "hi!");
        java.lang.String str36 = faculty33.toString();
        parking.ParkingLot parkingLot40 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot40.setEnabled(false);
        parking.ParkingSpace parkingSpace45 = new parking.ParkingSpace(parkingLot40, "hi!", "");
        int int46 = parkingLot40.getId();
        parkingLot40.disable();
        client.SiteUser siteUser49 = null;
        client.types.Visitor visitor54 = new client.types.Visitor(siteUser49, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount55 = new payment.BankAccount((client.Client) visitor54);
        parking.ParkingSpace parkingSpace56 = faculty33.book(parkingLot40, "Weak Password", (payment.Payable) bankAccount55);
        parking.ParkingSpace parkingSpace58 = parkingLot3.getAvailableSpace((client.Client) faculty33, "Unkown");
        parking.ParkingLot parkingLot59 = parkingSpace58.getParkingLot();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(database14);
        org.junit.Assert.assertNotNull(parkingSpaceListList15);
        org.junit.Assert.assertNotNull(parkingLotArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList20);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "client.types.Faculty" + "'", str36, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertNull(parkingSpace56);
        org.junit.Assert.assertNotNull(parkingSpace58);
        org.junit.Assert.assertNotNull(parkingLot59);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        parking.Sensor sensor22 = parkingSpace19.getSensor();
        parking.ParkingLot parkingLot23 = parkingSpace19.getParkingLot();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(sensor22);
        org.junit.Assert.assertNotNull(parkingLot23);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        managementTeam1.setTeamName("hi!");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database8 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList9 = database8.getSpaces();
        parking.ParkingLot[] parkingLotArray10 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList11 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList11, parkingLotArray10);
        database8.pLots = parkingLotList11;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList14 = database8.getSpaces();
        parking.ParkingLot parkingLot18 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot18.setEnabled(false);
        parking.ParkingSpace parkingSpace23 = new parking.ParkingSpace(parkingLot18, "hi!", "");
        database8.remove(parkingSpace23);
        parkingLot7.remove(parkingSpace23);
        client.SiteUser siteUser26 = null;
        client.types.Faculty faculty27 = new client.types.Faculty(siteUser26);
        parking.ParkingSpace parkingSpace29 = parkingLot7.getAvailableSpace((client.Client) faculty27, "hi!");
        parking.ParkingLot parkingLot30 = parkingSpace29.getParkingLot();
        boolean boolean31 = managementTeam1.disable((parking.Parking) parkingSpace29);
        client.SiteUser siteUser32 = null;
        client.types.NonFacultyStaff nonFacultyStaff33 = new client.types.NonFacultyStaff(siteUser32);
        nonFacultyStaff33.setEmailAddress("");
        nonFacultyStaff33.setRATE(0.0d);
        parkingSpace29.setOccupant((client.Client) nonFacultyStaff33);
        boolean boolean41 = nonFacultyStaff33.login("client.types.Faculty", "Unkown");
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(parkingSpaceListList9);
        org.junit.Assert.assertNotNull(parkingLotArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList14);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertNotNull(parkingLot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        parking.ParkingSpace parkingSpace8 = new parking.ParkingSpace(parkingLot3, "hi!", "");
        int int9 = parkingLot3.getId();
        parkingLot3.disable();
        parking.ParkingIterator parkingIterator11 = parkingLot3.availableSpotsIterator();
        parkingLot3.enable();
        parkingLot3.disable();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(parkingIterator11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        managementTeam1.setTeamName("hi!");
        managementTeam1.setUsername("Payment Successful");
        management.ManagementTeam managementTeam10 = new management.ManagementTeam("");
        java.lang.String str11 = managementTeam10.getPassword();
        management.Manager manager12 = null;
        managementTeam10.setSuper(manager12);
        management.Manager manager14 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam10);
        management.Manager[] managerArray15 = new management.Manager[] { manager14 };
        java.util.ArrayList<management.Manager> managerList16 = new java.util.ArrayList<management.Manager>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<management.Manager>) managerList16, managerArray15);
        managementTeam1.setTeam(managerList16);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap19 = managementTeam1.getParkingTodos();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(managerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parkingMap19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        manager8.enableAllLots();
        booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager8.cancel(booking10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.cancel()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        boolean boolean26 = parkingSpace25.isEnabled();
        java.lang.String str27 = parkingSpace25.getId();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int5 = time4.getStartMinute();
        int int6 = time4.getEndMinute();
        int int7 = time4.getEndHour();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        manager8.enableAllLots();
        management.ManagementTeam managementTeam11 = new management.ManagementTeam("");
        java.lang.String str12 = managementTeam11.getPassword();
        parking.Parking parking13 = null;
        managementTeam11.enable(parking13);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap15 = managementTeam11.getParkingTodos();
        java.util.ArrayList<management.Manager> managerList16 = null;
        managementTeam11.setTeam(managerList16);
        manager8.setSuper(managementTeam11, "hi!");
        parking.ParkingLot parkingLot23 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot23.setEnabled(false);
        parking.ParkingSpace parkingSpace28 = new parking.ParkingSpace(parkingLot23, "hi!", "");
        parkingSpace28.disable();
        boolean boolean30 = manager8.disable((parking.Parking) parkingSpace28);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(parkingMap15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        client.SiteUser siteUser0 = new client.SiteUser();
        client.types.Student student1 = new client.types.Student(siteUser0);
        booking.Booking booking2 = null;
        booking.Time time7 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time8 = new booking.Time(time7);
        siteUser0.changeBookingTime(booking2, time8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        parking.ParkingSpace parkingSpace8 = new parking.ParkingSpace(parkingLot3, "hi!", "");
        int int9 = parkingLot3.getId();
        parkingLot3.disable();
        java.lang.String str11 = parkingLot3.getLocation();
        parkingLot3.disable();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Duplicate Email" + "'", str11, "Duplicate Email");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        boolean boolean1 = database.Verifier.verifyEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        java.util.ArrayList<parking.ParkingSpace> parkingSpaceList26 = database0.getOccupiedSpaces();
        parking.ParkingSpace parkingSpace27 = null;
        client.Client client28 = database0.getClient(parkingSpace27);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingSpaceList26);
        org.junit.Assert.assertNull(client28);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database0.getSpaces();
        java.lang.Class<?> wildcardClass11 = parkingSpaceListList10.getClass();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        managementTeam1.setUsername("Location:Duplicate Email ParkingSpace: -1");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList7 = database0.getSpaces();
        java.util.ArrayList<parking.ParkingSpace> parkingSpaceList8 = database0.getOccupiedSpaces();
        database0.printClientNames();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(parkingSpaceListList7);
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        booking.Booking booking2 = null;
        boolean boolean3 = siteVisitor1.cancelBooking(booking2);
        booking.Booking booking4 = null;
        payment.CreditCard creditCard8 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double9 = creditCard8.getRecentPayment();
        java.lang.String str10 = siteVisitor1.pay(booking4, (payment.Payable) creditCard8);
        booking.Booking booking11 = null;
        boolean boolean12 = siteVisitor1.cancelBooking(booking11);
        java.util.ArrayList<booking.Booking> bookingList13 = siteVisitor1.getBookings();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<management.ManagementTeam> managementTeamList1 = database0.getMgmtTeams();
        database.Database database2 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList3 = database2.getSpaces();
        parking.ParkingLot[] parkingLotArray4 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList5 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList5, parkingLotArray4);
        database2.pLots = parkingLotList5;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database2.getSpaces();
        client.SiteUser siteUser9 = null;
        client.types.NonFacultyStaff nonFacultyStaff10 = new client.types.NonFacultyStaff(siteUser9);
        database2.add((client.Client) nonFacultyStaff10);
        client.SiteUser siteUser12 = null;
        client.types.Faculty faculty13 = new client.types.Faculty(siteUser12);
        faculty13.returnDeposit();
        database.Database database15 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList16 = database15.getSpaces();
        parking.ParkingLot[] parkingLotArray17 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList18 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList18, parkingLotArray17);
        database15.pLots = parkingLotList18;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList21 = database15.getSpaces();
        parking.ParkingLot parkingLot25 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot25.setEnabled(false);
        parking.ParkingSpace parkingSpace30 = new parking.ParkingSpace(parkingLot25, "hi!", "");
        database15.remove(parkingSpace30);
        database2.update((client.Client) faculty13, parkingSpace30);
        database0.add(parkingSpace30);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(managementTeamList1);
        org.junit.Assert.assertNotNull(database2);
        org.junit.Assert.assertNotNull(parkingSpaceListList3);
        org.junit.Assert.assertNotNull(parkingLotArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(database15);
        org.junit.Assert.assertNotNull(parkingSpaceListList16);
        org.junit.Assert.assertNotNull(parkingLotArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList21);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        payment.MobilePayment mobilePayment2 = new payment.MobilePayment("", "Unkown");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        client.SiteUser siteUser0 = null;
        client.types.NonFacultyStaff nonFacultyStaff1 = new client.types.NonFacultyStaff(siteUser0);
        java.lang.String str2 = nonFacultyStaff1.getFullName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "firstname lastname" + "'", str2, "firstname lastname");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<management.ManagementTeam> managementTeamList1 = database0.getMgmtTeams();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList2 = database0.getSpaces();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(managementTeamList1);
        org.junit.Assert.assertNotNull(parkingSpaceListList2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        managementTeam1.setTeamName("hi!");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database8 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList9 = database8.getSpaces();
        parking.ParkingLot[] parkingLotArray10 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList11 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList11, parkingLotArray10);
        database8.pLots = parkingLotList11;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList14 = database8.getSpaces();
        parking.ParkingLot parkingLot18 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot18.setEnabled(false);
        parking.ParkingSpace parkingSpace23 = new parking.ParkingSpace(parkingLot18, "hi!", "");
        database8.remove(parkingSpace23);
        parkingLot7.remove(parkingSpace23);
        client.SiteUser siteUser26 = null;
        client.types.Faculty faculty27 = new client.types.Faculty(siteUser26);
        parking.ParkingSpace parkingSpace29 = parkingLot7.getAvailableSpace((client.Client) faculty27, "hi!");
        parking.ParkingLot parkingLot30 = parkingSpace29.getParkingLot();
        boolean boolean31 = managementTeam1.disable((parking.Parking) parkingSpace29);
        client.SiteUser siteUser32 = null;
        client.types.NonFacultyStaff nonFacultyStaff33 = new client.types.NonFacultyStaff(siteUser32);
        nonFacultyStaff33.setEmailAddress("");
        nonFacultyStaff33.setRATE(0.0d);
        parkingSpace29.setOccupant((client.Client) nonFacultyStaff33);
        booking.Booking booking39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = nonFacultyStaff33.pay(booking39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.getPaymentMethod()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database8);
        org.junit.Assert.assertNotNull(parkingSpaceListList9);
        org.junit.Assert.assertNotNull(parkingLotArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList14);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertNotNull(parkingLot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot10.setEnabled(false);
        parking.ParkingSpace parkingSpace15 = new parking.ParkingSpace(parkingLot10, "hi!", "");
        database0.remove(parkingSpace15);
        client.SiteUser siteUser17 = null;
        client.types.NonFacultyStaff nonFacultyStaff18 = new client.types.NonFacultyStaff(siteUser17);
        nonFacultyStaff18.setEmailAddress("");
        database0.verify((client.Client) nonFacultyStaff18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = database0.getUsers();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        client.SiteUser siteUser0 = new client.SiteUser();
        client.types.Student student1 = new client.types.Student(siteUser0);
        booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = student1.cancelBooking(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        java.lang.String str7 = siteVisitor1.register("Duplicate Email", "", "Duplicate Email", "Duplicate Email", "hi!");
        java.lang.String str13 = siteVisitor1.register("hi!", "Duplicate Email", "Already Registered", "Duplicate Email", "Already Registered");
        booking.Booking booking14 = null;
        booking.Time time19 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int20 = time19.getStartMinute();
        time19.setEndMinute(1);
        siteVisitor1.changeBookingTime(booking14, time19);
        parking.ParkingLot parkingLot27 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database28 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList29 = database28.getSpaces();
        parking.ParkingLot[] parkingLotArray30 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList31 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList31, parkingLotArray30);
        database28.pLots = parkingLotList31;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList34 = database28.getSpaces();
        parking.ParkingLot parkingLot38 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot38.setEnabled(false);
        parking.ParkingSpace parkingSpace43 = new parking.ParkingSpace(parkingLot38, "hi!", "");
        database28.remove(parkingSpace43);
        parkingLot27.remove(parkingSpace43);
        parkingLot27.enable();
        payment.CreditCard creditCard51 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace52 = siteVisitor1.book(parkingLot27, "Location:Duplicate Email ParkingSpace: -1", (payment.Payable) creditCard51);
        booking.Booking booking53 = null;
        payment.DebitCard debitCard57 = new payment.DebitCard("Duplicate Email", 100, (int) (byte) -1);
        boolean boolean59 = debitCard57.makePayment((double) 'a');
        java.lang.String str60 = siteVisitor1.pay(booking53, (payment.Payable) debitCard57);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Email" + "'", str7, "Invalid Email");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Email" + "'", str13, "Invalid Email");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(database28);
        org.junit.Assert.assertNotNull(parkingSpaceListList29);
        org.junit.Assert.assertNotNull(parkingLotArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList34);
        org.junit.Assert.assertNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        client.SiteUser siteUser9 = null;
        client.types.Faculty faculty14 = new client.types.Faculty(siteUser9, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean16 = manager8.validate((client.Client) faculty14, "Already Registered");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = manager8.generateAccount("hi!", "firstname lastname");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Incorrect password");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        database.Database database0 = database.Database.getInstance();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = database0.getUsers();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        management.ManagementTeam managementTeam24 = new management.ManagementTeam("");
        java.lang.String str25 = managementTeam24.getPassword();
        booking.Booking booking26 = null;
        managementTeam24.cancel(booking26);
        database0.add(managementTeam24);
        management.ManagementTeam managementTeam33 = new management.ManagementTeam("");
        java.lang.String str34 = managementTeam33.getPassword();
        management.Manager manager35 = null;
        managementTeam33.setSuper(manager35);
        management.Manager manager37 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam33);
        manager37.enableAllLots();
        managementTeam24.add(manager37);
        manager37.cancelAllBookingTodos();
        database.Database database41 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList42 = database41.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = database41.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = database41.getUsers();
        database.Database database45 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList46 = database45.getSpaces();
        parking.ParkingLot[] parkingLotArray47 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList48 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList48, parkingLotArray47);
        database45.pLots = parkingLotList48;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList51 = database45.getSpaces();
        parking.ParkingLot parkingLot55 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot55.setEnabled(false);
        parking.ParkingSpace parkingSpace60 = new parking.ParkingSpace(parkingLot55, "hi!", "");
        database45.remove(parkingSpace60);
        java.lang.String str62 = parkingSpace60.toString();
        database41.remove(parkingSpace60);
        management.ManagementTeam managementTeam65 = new management.ManagementTeam("");
        java.lang.String str66 = managementTeam65.getPassword();
        booking.Booking booking67 = null;
        managementTeam65.cancel(booking67);
        database41.add(managementTeam65);
        java.util.ArrayList<management.Manager> managerList70 = managementTeam65.getTeam();
        manager37.removeSuper(managementTeam65);
        manager37.enableAllLots();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = manager37.generateAccount("Successful", "Invalid Email");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Incorrect password");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(database41);
        org.junit.Assert.assertNotNull(parkingSpaceListList42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(database45);
        org.junit.Assert.assertNotNull(parkingSpaceListList46);
        org.junit.Assert.assertNotNull(parkingLotArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList51);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(managerList70);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int5 = time4.getStartMinute();
        int int6 = time4.getEndMinute();
        double double7 = time4.totalTime();
        double double8 = time4.totalTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 101.0d + "'", double8 == 101.0d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        parking.ParkingLot parkingLot26 = parkingSpace25.getParkingLot();
        boolean boolean27 = parkingSpace25.isOccupied();
        parking.Car car29 = new parking.Car("Duplicate Email");
        java.lang.String str30 = car29.getColor();
        parkingSpace25.setCar(car29);
        parkingSpace25.setOccupied(false);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNotNull(parkingLot26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Unkown" + "'", str30, "Unkown");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        java.lang.String str22 = parkingLot3.getLocation();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Duplicate Email" + "'", str22, "Duplicate Email");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        client.SiteUser siteUser10 = null;
        client.types.Faculty faculty11 = new client.types.Faculty(siteUser10);
        faculty11.returnDeposit();
        database.Database database13 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList14 = database13.getSpaces();
        parking.ParkingLot[] parkingLotArray15 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList16 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList16, parkingLotArray15);
        database13.pLots = parkingLotList16;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList19 = database13.getSpaces();
        parking.ParkingLot parkingLot23 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot23.setEnabled(false);
        parking.ParkingSpace parkingSpace28 = new parking.ParkingSpace(parkingLot23, "hi!", "");
        database13.remove(parkingSpace28);
        database0.update((client.Client) faculty11, parkingSpace28);
        parking.ParkingLot parkingLot34 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database35 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList36 = database35.getSpaces();
        parking.ParkingLot[] parkingLotArray37 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList38 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList38, parkingLotArray37);
        database35.pLots = parkingLotList38;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList41 = database35.getSpaces();
        parking.ParkingLot parkingLot45 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot45.setEnabled(false);
        parking.ParkingSpace parkingSpace50 = new parking.ParkingSpace(parkingLot45, "hi!", "");
        database35.remove(parkingSpace50);
        parkingLot34.remove(parkingSpace50);
        database0.remove(parkingSpace50);
        management.ManagementTeam managementTeam55 = new management.ManagementTeam("");
        java.lang.String str56 = managementTeam55.getPassword();
        booking.Booking booking57 = null;
        managementTeam55.cancel(booking57);
        database0.add(managementTeam55);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(parkingSpaceListList14);
        org.junit.Assert.assertNotNull(parkingLotArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList19);
        org.junit.Assert.assertNotNull(database35);
        org.junit.Assert.assertNotNull(parkingSpaceListList36);
        org.junit.Assert.assertNotNull(parkingLotArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList41);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty5 = new client.types.Faculty(siteUser0, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean6 = faculty5.isApproved();
        payment.CreditCard creditCard10 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double11 = creditCard10.getRecentPayment();
        java.lang.String str12 = faculty5.deposit((payment.Payable) creditCard10);
        double double13 = creditCard10.getRecentPayment();
        boolean boolean15 = creditCard10.makePayment((double) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Payment Successful" + "'", str12, "Payment Successful");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.0d + "'", double13 == 8.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int5 = time4.getStartMinute();
        int int6 = time4.getEndMinute();
        double double7 = time4.totalTime();
        int int8 = time4.getStartMinute();
        double double9 = time4.totalTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 101.0d + "'", double9 == 101.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount6 = new payment.BankAccount((client.Client) visitor5);
        boolean boolean8 = bankAccount6.makePayment((double) '#');
        double double9 = bankAccount6.getBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 65.0d + "'", double9 == 65.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        client.SiteUser siteUser11 = null;
        client.types.NonFacultyStaff nonFacultyStaff12 = new client.types.NonFacultyStaff(siteUser11);
        database4.add((client.Client) nonFacultyStaff12);
        client.SiteUser siteUser14 = null;
        client.types.Faculty faculty15 = new client.types.Faculty(siteUser14);
        faculty15.returnDeposit();
        database.Database database17 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList18 = database17.getSpaces();
        parking.ParkingLot[] parkingLotArray19 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList20 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList20, parkingLotArray19);
        database17.pLots = parkingLotList20;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList23 = database17.getSpaces();
        parking.ParkingLot parkingLot27 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot27.setEnabled(false);
        parking.ParkingSpace parkingSpace32 = new parking.ParkingSpace(parkingLot27, "hi!", "");
        database17.remove(parkingSpace32);
        database4.update((client.Client) faculty15, parkingSpace32);
        parkingLot3.disable(parkingSpace32);
        java.lang.String str36 = parkingSpace32.toString();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(parkingSpaceListList18);
        org.junit.Assert.assertNotNull(parkingLotArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList23);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        parking.Sensor sensor22 = parkingSpace19.getSensor();
        boolean boolean23 = sensor22.getOccupied();
        java.lang.String str24 = sensor22.update();
        java.lang.String str25 = sensor22.update();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(sensor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "There is no car at this place" + "'", str24, "There is no car at this place");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "There is no car at this place" + "'", str25, "There is no car at this place");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        management.ManagementTeam managementTeam24 = new management.ManagementTeam("");
        java.lang.String str25 = managementTeam24.getPassword();
        booking.Booking booking26 = null;
        managementTeam24.cancel(booking26);
        database0.add(managementTeam24);
        client.SiteUser siteUser29 = new client.SiteUser();
        client.SiteUser siteUser30 = null;
        client.types.Faculty faculty31 = new client.types.Faculty(siteUser30);
        faculty31.returnDeposit();
        client.SiteUser siteUser33 = null;
        client.types.Visitor visitor38 = new client.types.Visitor(siteUser33, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount39 = new payment.BankAccount((client.Client) visitor38);
        java.lang.String str40 = faculty31.deposit((payment.Payable) bankAccount39);
        faculty31.setEmailAddress("client.types.Faculty");
        siteUser29.setState((client.ClientState) faculty31);
        database0.verify((client.Client) faculty31);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Payment Successful" + "'", str40, "Payment Successful");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        client.SiteUser siteUser0 = null;
        client.types.Student student5 = new client.types.Student(siteUser0, "hi!", "hi!", "Duplicate Email", "Duplicate Email");
        // The following exception was thrown during execution in test generation
        try {
            student5.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.SiteUser.setState(client.ClientState)\" because \"this.context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = database0.pLots;
        management.ManagementTeam managementTeam15 = new management.ManagementTeam("");
        java.lang.String str16 = managementTeam15.getPassword();
        management.Manager manager17 = null;
        managementTeam15.setSuper(manager17);
        management.Manager manager19 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam15);
        database.Database database20 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList21 = database20.getSpaces();
        parking.ParkingLot[] parkingLotArray22 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList23 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList23, parkingLotArray22);
        database20.pLots = parkingLotList23;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList26 = database20.getSpaces();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot30.setEnabled(false);
        parking.ParkingSpace parkingSpace35 = new parking.ParkingSpace(parkingLot30, "hi!", "");
        database20.remove(parkingSpace35);
        parkingSpace35.enable();
        manager19.enable((parking.Parking) parkingSpace35);
        database0.remove(parkingSpace35);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(parkingLotList10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(database20);
        org.junit.Assert.assertNotNull(parkingSpaceListList21);
        org.junit.Assert.assertNotNull(parkingLotArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList26);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.HashMap<management.ManagementTeam, java.lang.String> managementTeamMap0 = management.AutoAccountGenerationSystem.getUsernames();
        org.junit.Assert.assertNotNull(managementTeamMap0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        parking.ParkingSpace parkingSpace8 = new parking.ParkingSpace(parkingLot3, "hi!", "");
        int int9 = parkingLot3.getId();
        parkingLot3.disable();
        parking.ParkingIterator parkingIterator11 = parkingLot3.availableSpotsIterator();
        parking.ParkingSpace parkingSpace12 = parkingIterator11.getNext();
        parking.ParkingSpace parkingSpace13 = parkingIterator11.getNext();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(parkingIterator11);
        org.junit.Assert.assertNull(parkingSpace12);
        org.junit.Assert.assertNull(parkingSpace13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        java.util.ArrayList<management.ManagementTeam> managementTeamList26 = database0.getMgmtTeams();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList27 = database0.getSpaces();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(managementTeamList26);
        org.junit.Assert.assertNotNull(parkingSpaceListList27);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        java.lang.String str7 = siteVisitor1.register("Duplicate Email", "", "Duplicate Email", "Duplicate Email", "hi!");
        java.lang.String str13 = siteVisitor1.register("Invalid Email", "hi!", "Invalid Email", "hi!", "Payment Successful");
        booking.Booking booking14 = null;
        booking.Time time19 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time20 = new booking.Time(time19);
        double double21 = time19.totalTime();
        double double22 = time19.totalTime();
        booking.Time time23 = new booking.Time(time19);
        siteVisitor1.changeBookingTime(booking14, time23);
        parking.ParkingLot parkingLot28 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database29 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList30 = database29.getSpaces();
        parking.ParkingLot[] parkingLotArray31 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList32 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList32, parkingLotArray31);
        database29.pLots = parkingLotList32;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList35 = database29.getSpaces();
        parking.ParkingLot parkingLot39 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot39.setEnabled(false);
        parking.ParkingSpace parkingSpace44 = new parking.ParkingSpace(parkingLot39, "hi!", "");
        database29.remove(parkingSpace44);
        parkingLot28.remove(parkingSpace44);
        client.SiteUser siteUser47 = null;
        client.types.Faculty faculty48 = new client.types.Faculty(siteUser47);
        parking.ParkingSpace parkingSpace50 = parkingLot28.getAvailableSpace((client.Client) faculty48, "hi!");
        parkingSpace50.disable();
        java.lang.String str52 = siteVisitor1.find(parkingSpace50);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid Email" + "'", str7, "Invalid Email");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid Email" + "'", str13, "Invalid Email");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 101.0d + "'", double21 == 101.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 101.0d + "'", double22 == 101.0d);
        org.junit.Assert.assertNotNull(database29);
        org.junit.Assert.assertNotNull(parkingSpaceListList30);
        org.junit.Assert.assertNotNull(parkingLotArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList35);
        org.junit.Assert.assertNotNull(parkingSpace50);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        parking.ParkingLot parkingLot5 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database6 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList7 = database6.getSpaces();
        parking.ParkingLot[] parkingLotArray8 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList9 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList9, parkingLotArray8);
        database6.pLots = parkingLotList9;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList12 = database6.getSpaces();
        client.SiteUser siteUser13 = null;
        client.types.NonFacultyStaff nonFacultyStaff14 = new client.types.NonFacultyStaff(siteUser13);
        database6.add((client.Client) nonFacultyStaff14);
        client.SiteUser siteUser16 = null;
        client.types.Faculty faculty17 = new client.types.Faculty(siteUser16);
        faculty17.returnDeposit();
        database.Database database19 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList20 = database19.getSpaces();
        parking.ParkingLot[] parkingLotArray21 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList22 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList22, parkingLotArray21);
        database19.pLots = parkingLotList22;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList25 = database19.getSpaces();
        parking.ParkingLot parkingLot29 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot29.setEnabled(false);
        parking.ParkingSpace parkingSpace34 = new parking.ParkingSpace(parkingLot29, "hi!", "");
        database19.remove(parkingSpace34);
        database6.update((client.Client) faculty17, parkingSpace34);
        parkingLot5.disable(parkingSpace34);
        int int38 = parkingLot5.getId();
        client.SiteUser siteUser40 = null;
        client.types.NonFacultyStaff nonFacultyStaff41 = new client.types.NonFacultyStaff(siteUser40);
        nonFacultyStaff41.setEmailAddress("");
        client.SiteUser siteUser44 = null;
        client.types.Faculty faculty45 = new client.types.Faculty(siteUser44);
        faculty45.returnDeposit();
        parking.ParkingLot parkingLot50 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database51 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList52 = database51.getSpaces();
        parking.ParkingLot[] parkingLotArray53 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList54 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList54, parkingLotArray53);
        database51.pLots = parkingLotList54;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList57 = database51.getSpaces();
        parking.ParkingLot parkingLot61 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot61.setEnabled(false);
        parking.ParkingSpace parkingSpace66 = new parking.ParkingSpace(parkingLot61, "hi!", "");
        database51.remove(parkingSpace66);
        parkingLot50.remove(parkingSpace66);
        client.SiteUser siteUser69 = null;
        client.types.Faculty faculty70 = new client.types.Faculty(siteUser69);
        parking.ParkingSpace parkingSpace72 = parkingLot50.getAvailableSpace((client.Client) faculty70, "hi!");
        payment.CreditCard creditCard77 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace78 = faculty45.book(parkingLot50, "Invalid Email", (payment.Payable) creditCard77);
        payment.DebitCard debitCard83 = new payment.DebitCard("Duplicate Email", 100, (int) (byte) -1);
        parking.ParkingSpace parkingSpace84 = nonFacultyStaff41.book(parkingLot50, "", (payment.Payable) debitCard83);
        parking.ParkingSpace parkingSpace85 = siteVisitor1.book(parkingLot5, "Location:Duplicate Email ParkingSpace: -1", (payment.Payable) debitCard83);
        booking.Booking booking86 = null;
        payment.DebitCard debitCard90 = new payment.DebitCard("password", (int) (short) 10, (int) (byte) 100);
        java.lang.String str91 = siteVisitor1.pay(booking86, (payment.Payable) debitCard90);
        org.junit.Assert.assertNotNull(database6);
        org.junit.Assert.assertNotNull(parkingSpaceListList7);
        org.junit.Assert.assertNotNull(parkingLotArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList12);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(parkingSpaceListList20);
        org.junit.Assert.assertNotNull(parkingLotArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList25);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(database51);
        org.junit.Assert.assertNotNull(parkingSpaceListList52);
        org.junit.Assert.assertNotNull(parkingLotArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList57);
        org.junit.Assert.assertNotNull(parkingSpace72);
        org.junit.Assert.assertNull(parkingSpace78);
        org.junit.Assert.assertNull(parkingSpace84);
        org.junit.Assert.assertNull(parkingSpace85);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        client.SiteUser siteUser0 = new client.SiteUser();
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "Payment Successful", "Payment Successful", "hi!", "lastname");
        client.types.Student student6 = new client.types.Student(siteUser0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        parking.Parking parking3 = null;
        managementTeam1.enable(parking3);
        java.util.HashMap<parking.Parking, management.Flag> parkingMap5 = managementTeam1.getParkingTodos();
        java.util.ArrayList<management.Manager> managerList6 = null;
        managementTeam1.setTeam(managerList6);
        parking.ParkingLot parkingLot11 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database12 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database12.getSpaces();
        parking.ParkingLot[] parkingLotArray14 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList15 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList15, parkingLotArray14);
        database12.pLots = parkingLotList15;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList18 = database12.getSpaces();
        parking.ParkingLot parkingLot22 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot22.setEnabled(false);
        parking.ParkingSpace parkingSpace27 = new parking.ParkingSpace(parkingLot22, "hi!", "");
        database12.remove(parkingSpace27);
        parkingLot11.remove(parkingSpace27);
        client.SiteUser siteUser30 = null;
        client.types.Faculty faculty31 = new client.types.Faculty(siteUser30);
        parking.ParkingSpace parkingSpace33 = parkingLot11.getAvailableSpace((client.Client) faculty31, "hi!");
        java.lang.String str34 = faculty31.getPassword();
        managementTeam1.verify((client.Client) faculty31);
        faculty31.returnDeposit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parkingMap5);
        org.junit.Assert.assertNotNull(database12);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingLotArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList18);
        org.junit.Assert.assertNotNull(parkingSpace33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "password" + "'", str34, "password");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        java.util.ArrayList<management.ManagementTeam> managementTeamList10 = database0.getMgmtTeams();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(managementTeamList10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        boolean boolean22 = parkingSpace19.isOccupied();
        parkingSpace19.enable();
        parkingSpace19.enable();
        client.SiteUser siteUser25 = null;
        client.types.Faculty faculty26 = new client.types.Faculty(siteUser25);
        java.util.ArrayList<booking.Booking> bookingList27 = faculty26.getBookings();
        parkingSpace19.setOccupant((client.Client) faculty26);
        parking.Sensor sensor29 = parkingSpace19.getSensor();
        parking.Car car31 = new parking.Car("Duplicate Email");
        java.lang.String str32 = car31.getColor();
        java.lang.String str33 = car31.getModel();
        sensor29.setCar(car31);
        boolean boolean35 = sensor29.getOccupied();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNotNull(sensor29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Unkown" + "'", str32, "Unkown");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Unkown" + "'", str33, "Unkown");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        java.util.ArrayList<client.Client> clientList26 = database0.getClients();
        java.util.ArrayList<parking.ParkingLot> parkingLotList27 = database0.pLots;
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(clientList26);
        org.junit.Assert.assertNotNull(parkingLotList27);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot10.setEnabled(false);
        parking.ParkingSpace parkingSpace15 = new parking.ParkingSpace(parkingLot10, "hi!", "");
        database0.remove(parkingSpace15);
        management.ManagementTeam managementTeam18 = new management.ManagementTeam("");
        java.lang.String str19 = managementTeam18.getPassword();
        booking.Booking booking20 = null;
        managementTeam18.cancel(booking20);
        database.Database database22 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList23 = database22.getSpaces();
        parking.ParkingLot[] parkingLotArray24 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList25 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList25, parkingLotArray24);
        database22.pLots = parkingLotList25;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList28 = database22.getSpaces();
        parking.ParkingLot parkingLot32 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot32.setEnabled(false);
        parking.ParkingSpace parkingSpace37 = new parking.ParkingSpace(parkingLot32, "hi!", "");
        database22.remove(parkingSpace37);
        java.lang.String str39 = parkingSpace37.toString();
        boolean boolean40 = managementTeam18.disable((parking.Parking) parkingSpace37);
        client.Client client41 = database0.getClient(parkingSpace37);
        parking.ParkingLot parkingLot45 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database46 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList47 = database46.getSpaces();
        parking.ParkingLot[] parkingLotArray48 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList49 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList49, parkingLotArray48);
        database46.pLots = parkingLotList49;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList52 = database46.getSpaces();
        parking.ParkingLot parkingLot56 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot56.setEnabled(false);
        parking.ParkingSpace parkingSpace61 = new parking.ParkingSpace(parkingLot56, "hi!", "");
        database46.remove(parkingSpace61);
        parkingLot45.remove(parkingSpace61);
        parkingLot45.enable();
        database0.add(parkingLot45);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(database22);
        org.junit.Assert.assertNotNull(parkingSpaceListList23);
        org.junit.Assert.assertNotNull(parkingLotArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList28);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(client41);
        org.junit.Assert.assertNotNull(database46);
        org.junit.Assert.assertNotNull(parkingSpaceListList47);
        org.junit.Assert.assertNotNull(parkingLotArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList52);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        parking.Car car1 = new parking.Car("lastname");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        boolean boolean12 = managementTeam4.validate("Already Registered", "email", "client.types.Faculty");
        management.ManagementTeam managementTeam17 = new management.ManagementTeam("");
        java.lang.String str18 = managementTeam17.getPassword();
        management.Manager manager19 = null;
        managementTeam17.setSuper(manager19);
        management.Manager manager21 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam17);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty27 = new client.types.Faculty(siteUser22, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean29 = manager21.validate((client.Client) faculty27, "Already Registered");
        managementTeam4.setSuper(manager21);
        java.lang.String str31 = managementTeam4.getUsername();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        boolean boolean1 = database.Verifier.verifyPassword("password");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        management.ManagementTeam managementTeam24 = new management.ManagementTeam("");
        java.lang.String str25 = managementTeam24.getPassword();
        booking.Booking booking26 = null;
        managementTeam24.cancel(booking26);
        database0.add(managementTeam24);
        management.ManagementTeam managementTeam33 = new management.ManagementTeam("");
        java.lang.String str34 = managementTeam33.getPassword();
        management.Manager manager35 = null;
        managementTeam33.setSuper(manager35);
        management.Manager manager37 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam33);
        manager37.enableAllLots();
        managementTeam24.add(manager37);
        manager37.cancelAllBookingTodos();
        java.lang.String str41 = manager37.firstname;
        boolean boolean45 = manager37.validate("Duplicate Email", "There is no car at this place", "Weak Password");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "client.types.Faculty" + "'", str41, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        java.lang.String str26 = faculty23.toString();
        faculty23.setEmailAddress("");
        booking.Booking booking29 = null;
        booking.Time time34 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time35 = new booking.Time(time34);
        double double36 = time34.totalTime();
        double double37 = time34.totalTime();
        booking.Time time38 = new booking.Time(time34);
        booking.Time time39 = new booking.Time(time34);
        time34.setEndMinute((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            faculty23.changeBookingTime(booking29, time34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "client.types.Faculty" + "'", str26, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 101.0d + "'", double36 == 101.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 101.0d + "'", double37 == 101.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        parking.ParkingLot parkingLot9 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database10 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList11 = database10.getSpaces();
        parking.ParkingLot[] parkingLotArray12 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList13 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList13, parkingLotArray12);
        database10.pLots = parkingLotList13;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList16 = database10.getSpaces();
        parking.ParkingLot parkingLot20 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot20.setEnabled(false);
        parking.ParkingSpace parkingSpace25 = new parking.ParkingSpace(parkingLot20, "hi!", "");
        database10.remove(parkingSpace25);
        parkingLot9.remove(parkingSpace25);
        client.SiteUser siteUser28 = null;
        client.types.Faculty faculty29 = new client.types.Faculty(siteUser28);
        parking.ParkingSpace parkingSpace31 = parkingLot9.getAvailableSpace((client.Client) faculty29, "hi!");
        parking.ParkingLot parkingLot32 = parkingSpace31.getParkingLot();
        parkingSpace31.enable();
        parking.ParkingLot parkingLot34 = parkingSpace31.getParkingLot();
        java.lang.String str35 = visitor5.find(parkingSpace31);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(parkingSpaceListList11);
        org.junit.Assert.assertNotNull(parkingLotArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList16);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertNotNull(parkingLot32);
        org.junit.Assert.assertNotNull(parkingLot34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Location:Duplicate Email ParkingSpace: -1" + "'", str35, "Location:Duplicate Email ParkingSpace: -1");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        management.Flag flag1 = new management.Flag("Duplicate Email");
        flag1.setResolved(true);
        boolean boolean4 = flag1.isResolved();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        client.SiteUser siteUser9 = null;
        client.types.Faculty faculty14 = new client.types.Faculty(siteUser9, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean16 = manager8.validate((client.Client) faculty14, "Already Registered");
        boolean boolean20 = manager8.login("email", "hi!", "Invalid Email");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        boolean boolean22 = parkingSpace19.isOccupied();
        parkingSpace19.enable();
        parkingSpace19.enable();
        client.SiteUser siteUser25 = null;
        client.types.Faculty faculty26 = new client.types.Faculty(siteUser25);
        java.util.ArrayList<booking.Booking> bookingList27 = faculty26.getBookings();
        parkingSpace19.setOccupant((client.Client) faculty26);
        parking.ParkingLot parkingLot32 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database33 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList34 = database33.getSpaces();
        parking.ParkingLot[] parkingLotArray35 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList36 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList36, parkingLotArray35);
        database33.pLots = parkingLotList36;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList39 = database33.getSpaces();
        parking.ParkingLot parkingLot43 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot43.setEnabled(false);
        parking.ParkingSpace parkingSpace48 = new parking.ParkingSpace(parkingLot43, "hi!", "");
        database33.remove(parkingSpace48);
        parkingLot32.remove(parkingSpace48);
        boolean boolean51 = parkingSpace48.isOccupied();
        parkingSpace48.enable();
        parkingSpace48.enable();
        client.SiteUser siteUser54 = null;
        client.types.Faculty faculty55 = new client.types.Faculty(siteUser54);
        java.util.ArrayList<booking.Booking> bookingList56 = faculty55.getBookings();
        parkingSpace48.setOccupant((client.Client) faculty55);
        parking.Sensor sensor58 = parkingSpace48.getSensor();
        parking.Car car60 = new parking.Car("Duplicate Email");
        java.lang.String str61 = car60.getColor();
        java.lang.String str62 = car60.getModel();
        sensor58.setCar(car60);
        faculty26.addCar(car60);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNotNull(database33);
        org.junit.Assert.assertNotNull(parkingSpaceListList34);
        org.junit.Assert.assertNotNull(parkingLotArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList39);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(bookingList56);
        org.junit.Assert.assertNotNull(sensor58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Unkown" + "'", str61, "Unkown");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Unkown" + "'", str62, "Unkown");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        database0.printClientNames();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("-1");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        manager8.enableAllLots();
        java.lang.String str10 = manager8.firstname;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "client.types.Faculty" + "'", str10, "client.types.Faculty");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        client.Client client4 = database0.getClient("Unkown", "Strong Password");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNull(client4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        booking.Booking booking3 = null;
        managementTeam1.cancel(booking3);
        parking.ParkingLot parkingLot8 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot8.isEnabled();
        int int12 = parkingLot8.getId();
        boolean boolean13 = managementTeam1.disable((parking.Parking) parkingLot8);
        int int14 = parkingLot8.getId();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        java.lang.String str9 = manager8.firstname;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "client.types.Faculty" + "'", str9, "client.types.Faculty");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        boolean boolean22 = parkingSpace19.isOccupied();
        parking.ParkingLot parkingLot23 = parkingSpace19.getLot();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parkingLot23);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        java.lang.String str22 = parkingLot3.toString();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        parking.ParkingLot parkingLot26 = parkingSpace25.getParkingLot();
        parkingLot26.setEnabled(true);
        database.Database database29 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList30 = database29.getSpaces();
        parking.ParkingLot[] parkingLotArray31 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList32 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList32, parkingLotArray31);
        database29.pLots = parkingLotList32;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList35 = database29.getSpaces();
        client.SiteUser siteUser36 = null;
        client.types.NonFacultyStaff nonFacultyStaff37 = new client.types.NonFacultyStaff(siteUser36);
        database29.add((client.Client) nonFacultyStaff37);
        client.SiteUser siteUser39 = null;
        client.types.Faculty faculty40 = new client.types.Faculty(siteUser39);
        faculty40.returnDeposit();
        database.Database database42 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList43 = database42.getSpaces();
        parking.ParkingLot[] parkingLotArray44 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList45 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList45, parkingLotArray44);
        database42.pLots = parkingLotList45;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList48 = database42.getSpaces();
        parking.ParkingLot parkingLot52 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot52.setEnabled(false);
        parking.ParkingSpace parkingSpace57 = new parking.ParkingSpace(parkingLot52, "hi!", "");
        database42.remove(parkingSpace57);
        database29.update((client.Client) faculty40, parkingSpace57);
        parking.ParkingLot parkingLot63 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database64 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList65 = database64.getSpaces();
        parking.ParkingLot[] parkingLotArray66 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList67 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList67, parkingLotArray66);
        database64.pLots = parkingLotList67;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList70 = database64.getSpaces();
        parking.ParkingLot parkingLot74 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot74.setEnabled(false);
        parking.ParkingSpace parkingSpace79 = new parking.ParkingSpace(parkingLot74, "hi!", "");
        database64.remove(parkingSpace79);
        parkingLot63.remove(parkingSpace79);
        database29.remove(parkingSpace79);
        parkingLot26.remove(parkingSpace79);
        parkingLot26.disable();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNotNull(parkingLot26);
        org.junit.Assert.assertNotNull(database29);
        org.junit.Assert.assertNotNull(parkingSpaceListList30);
        org.junit.Assert.assertNotNull(parkingLotArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList35);
        org.junit.Assert.assertNotNull(database42);
        org.junit.Assert.assertNotNull(parkingSpaceListList43);
        org.junit.Assert.assertNotNull(parkingLotArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList48);
        org.junit.Assert.assertNotNull(database64);
        org.junit.Assert.assertNotNull(parkingSpaceListList65);
        org.junit.Assert.assertNotNull(parkingLotArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList70);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        management.ManagementTeam managementTeam24 = new management.ManagementTeam("");
        java.lang.String str25 = managementTeam24.getPassword();
        booking.Booking booking26 = null;
        managementTeam24.cancel(booking26);
        database0.add(managementTeam24);
        management.ManagementTeam managementTeam33 = new management.ManagementTeam("");
        java.lang.String str34 = managementTeam33.getPassword();
        management.Manager manager35 = null;
        managementTeam33.setSuper(manager35);
        management.Manager manager37 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam33);
        manager37.enableAllLots();
        managementTeam24.add(manager37);
        manager37.cancelAllBookingTodos();
        database.Database database41 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList42 = database41.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = database41.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = database41.getUsers();
        database.Database database45 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList46 = database45.getSpaces();
        parking.ParkingLot[] parkingLotArray47 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList48 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList48, parkingLotArray47);
        database45.pLots = parkingLotList48;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList51 = database45.getSpaces();
        parking.ParkingLot parkingLot55 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot55.setEnabled(false);
        parking.ParkingSpace parkingSpace60 = new parking.ParkingSpace(parkingLot55, "hi!", "");
        database45.remove(parkingSpace60);
        java.lang.String str62 = parkingSpace60.toString();
        database41.remove(parkingSpace60);
        management.ManagementTeam managementTeam65 = new management.ManagementTeam("");
        java.lang.String str66 = managementTeam65.getPassword();
        booking.Booking booking67 = null;
        managementTeam65.cancel(booking67);
        database41.add(managementTeam65);
        java.util.ArrayList<management.Manager> managerList70 = managementTeam65.getTeam();
        manager37.removeSuper(managementTeam65);
        manager37.enableAllLots();
        manager37.logOut();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(database41);
        org.junit.Assert.assertNotNull(parkingSpaceListList42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(database45);
        org.junit.Assert.assertNotNull(parkingSpaceListList46);
        org.junit.Assert.assertNotNull(parkingLotArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList51);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(managerList70);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount6 = new payment.BankAccount((client.Client) visitor5);
        boolean boolean8 = bankAccount6.makePayment((double) '#');
        double double9 = bankAccount6.getRecentPayment();
        bankAccount6.deposit((double) 10L);
        client.Client client12 = bankAccount6.getOwner();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(client12);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        payment.DebitCard debitCard3 = new payment.DebitCard("Duplicate Email", 100, (int) (byte) -1);
        boolean boolean5 = debitCard3.makePayment((double) 'a');
        double double6 = debitCard3.getRecentPayment();
        boolean boolean8 = debitCard3.makePayment((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty1 = new client.types.Faculty(siteUser0);
        faculty1.returnDeposit();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        client.SiteUser siteUser25 = null;
        client.types.Faculty faculty26 = new client.types.Faculty(siteUser25);
        parking.ParkingSpace parkingSpace28 = parkingLot6.getAvailableSpace((client.Client) faculty26, "hi!");
        payment.CreditCard creditCard33 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace34 = faculty1.book(parkingLot6, "Invalid Email", (payment.Payable) creditCard33);
        boolean boolean37 = faculty1.login("", "hi!");
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertNull(parkingSpace34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        managementTeam1.setTeamName("hi!");
        managementTeam1.setUsername("Payment Successful");
        parking.ParkingLot parkingLot9 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot9.setEnabled(false);
        parking.ParkingSpace parkingSpace14 = new parking.ParkingSpace(parkingLot9, "hi!", "");
        int int15 = parkingLot9.getId();
        parking.ParkingLot parkingLot19 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database20 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList21 = database20.getSpaces();
        parking.ParkingLot[] parkingLotArray22 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList23 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList23, parkingLotArray22);
        database20.pLots = parkingLotList23;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList26 = database20.getSpaces();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot30.setEnabled(false);
        parking.ParkingSpace parkingSpace35 = new parking.ParkingSpace(parkingLot30, "hi!", "");
        database20.remove(parkingSpace35);
        parkingLot19.remove(parkingSpace35);
        client.SiteUser siteUser38 = null;
        client.types.Faculty faculty39 = new client.types.Faculty(siteUser38);
        parking.ParkingSpace parkingSpace41 = parkingLot19.getAvailableSpace((client.Client) faculty39, "hi!");
        java.lang.String str42 = faculty39.toString();
        parking.ParkingLot parkingLot46 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot46.setEnabled(false);
        parking.ParkingSpace parkingSpace51 = new parking.ParkingSpace(parkingLot46, "hi!", "");
        int int52 = parkingLot46.getId();
        parkingLot46.disable();
        client.SiteUser siteUser55 = null;
        client.types.Visitor visitor60 = new client.types.Visitor(siteUser55, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount61 = new payment.BankAccount((client.Client) visitor60);
        parking.ParkingSpace parkingSpace62 = faculty39.book(parkingLot46, "Weak Password", (payment.Payable) bankAccount61);
        parking.ParkingSpace parkingSpace64 = parkingLot9.getAvailableSpace((client.Client) faculty39, "Unkown");
        parking.ParkingLot parkingLot68 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot68.enable();
        client.SiteUser siteUser71 = null;
        client.types.Visitor visitor76 = new client.types.Visitor(siteUser71, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount77 = new payment.BankAccount((client.Client) visitor76);
        boolean boolean79 = bankAccount77.makePayment((double) '#');
        double double80 = bankAccount77.getRecentPayment();
        parking.ParkingSpace parkingSpace81 = faculty39.book(parkingLot68, "", (payment.Payable) bankAccount77);
        java.lang.String str82 = parkingLot68.toString();
        managementTeam1.enable((parking.Parking) parkingLot68);
        parking.ParkingLot parkingLot87 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot87.setEnabled(false);
        parking.ParkingSpace parkingSpace92 = new parking.ParkingSpace(parkingLot87, "hi!", "");
        int int93 = parkingLot87.getId();
        parkingLot87.disable();
        parkingLot87.disable();
        boolean boolean96 = managementTeam1.disable((parking.Parking) parkingLot87);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(database20);
        org.junit.Assert.assertNotNull(parkingSpaceListList21);
        org.junit.Assert.assertNotNull(parkingLotArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList26);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "client.types.Faculty" + "'", str42, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNull(parkingSpace62);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNull(parkingSpace81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 52 + "'", int93 == 52);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        management.ManagementTeam managementTeam7 = new management.ManagementTeam("");
        java.lang.String str8 = managementTeam7.getPassword();
        management.Manager manager9 = null;
        managementTeam7.setSuper(manager9);
        management.Manager manager11 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam7);
        management.Manager manager12 = new management.Manager("Verified Email", "Successful", "password", managementTeam7);
        management.Manager manager13 = managementTeam7.getSuperM();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(manager13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        client.SiteUser siteUser7 = null;
        client.types.NonFacultyStaff nonFacultyStaff8 = new client.types.NonFacultyStaff(siteUser7);
        database0.add((client.Client) nonFacultyStaff8);
        client.SiteUser siteUser10 = null;
        client.types.Faculty faculty11 = new client.types.Faculty(siteUser10);
        faculty11.returnDeposit();
        database.Database database13 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList14 = database13.getSpaces();
        parking.ParkingLot[] parkingLotArray15 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList16 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList16, parkingLotArray15);
        database13.pLots = parkingLotList16;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList19 = database13.getSpaces();
        parking.ParkingLot parkingLot23 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot23.setEnabled(false);
        parking.ParkingSpace parkingSpace28 = new parking.ParkingSpace(parkingLot23, "hi!", "");
        database13.remove(parkingSpace28);
        database0.update((client.Client) faculty11, parkingSpace28);
        java.util.ArrayList<parking.ParkingLot> parkingLotList31 = database0.pLots;
        java.util.ArrayList<management.ManagementTeam> managementTeamList32 = database0.getMgmtTeams();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNotNull(database13);
        org.junit.Assert.assertNotNull(parkingSpaceListList14);
        org.junit.Assert.assertNotNull(parkingLotArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList19);
        org.junit.Assert.assertNotNull(parkingLotList31);
        org.junit.Assert.assertNotNull(managementTeamList32);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot10.setEnabled(false);
        parking.ParkingSpace parkingSpace15 = new parking.ParkingSpace(parkingLot10, "hi!", "");
        database0.remove(parkingSpace15);
        client.SiteUser siteUser17 = null;
        client.types.NonFacultyStaff nonFacultyStaff18 = new client.types.NonFacultyStaff(siteUser17);
        nonFacultyStaff18.setEmailAddress("");
        database0.verify((client.Client) nonFacultyStaff18);
        payment.BankAccount bankAccount22 = new payment.BankAccount((client.Client) nonFacultyStaff18);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        java.lang.String str26 = faculty23.toString();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot30.setEnabled(false);
        parking.ParkingSpace parkingSpace35 = new parking.ParkingSpace(parkingLot30, "hi!", "");
        int int36 = parkingLot30.getId();
        parkingLot30.disable();
        client.SiteUser siteUser39 = null;
        client.types.Visitor visitor44 = new client.types.Visitor(siteUser39, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount45 = new payment.BankAccount((client.Client) visitor44);
        parking.ParkingSpace parkingSpace46 = faculty23.book(parkingLot30, "Weak Password", (payment.Payable) bankAccount45);
        double double47 = bankAccount45.getBalance();
        bankAccount45.deposit((double) 52);
        double double50 = bankAccount45.getBalance();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "client.types.Faculty" + "'", str26, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNull(parkingSpace46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 152.0d + "'", double50 == 152.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        booking.Booking booking3 = null;
        managementTeam1.cancel(booking3);
        boolean boolean8 = managementTeam1.validate("Payment Successful", "Invalid Email", "-1");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        client.SiteUser siteUser11 = null;
        client.types.NonFacultyStaff nonFacultyStaff12 = new client.types.NonFacultyStaff(siteUser11);
        database4.add((client.Client) nonFacultyStaff12);
        client.SiteUser siteUser14 = null;
        client.types.Faculty faculty15 = new client.types.Faculty(siteUser14);
        faculty15.returnDeposit();
        database.Database database17 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList18 = database17.getSpaces();
        parking.ParkingLot[] parkingLotArray19 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList20 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList20, parkingLotArray19);
        database17.pLots = parkingLotList20;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList23 = database17.getSpaces();
        parking.ParkingLot parkingLot27 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot27.setEnabled(false);
        parking.ParkingSpace parkingSpace32 = new parking.ParkingSpace(parkingLot27, "hi!", "");
        database17.remove(parkingSpace32);
        database4.update((client.Client) faculty15, parkingSpace32);
        parkingLot3.disable(parkingSpace32);
        int int36 = parkingLot3.getId();
        boolean boolean37 = parkingLot3.isEnabled();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(database17);
        org.junit.Assert.assertNotNull(parkingSpaceListList18);
        org.junit.Assert.assertNotNull(parkingLotArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        client.SiteUser siteUser0 = new client.SiteUser();
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "Payment Successful", "Payment Successful", "hi!", "lastname");
        booking.Booking booking6 = null;
        booking.Time time11 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int12 = time11.getStartMinute();
        int int13 = time11.getEndMinute();
        siteUser0.changeBookingTime(booking6, time11);
        java.util.ArrayList<booking.Booking> bookingList15 = siteUser0.getBookings();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(bookingList15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        client.SiteUser siteUser0 = new client.SiteUser();
        client.SiteUser siteUser1 = null;
        client.types.Faculty faculty2 = new client.types.Faculty(siteUser1);
        faculty2.returnDeposit();
        client.SiteUser siteUser4 = null;
        client.types.Visitor visitor9 = new client.types.Visitor(siteUser4, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount10 = new payment.BankAccount((client.Client) visitor9);
        java.lang.String str11 = faculty2.deposit((payment.Payable) bankAccount10);
        faculty2.setEmailAddress("client.types.Faculty");
        siteUser0.setState((client.ClientState) faculty2);
        client.types.NonFacultyStaff nonFacultyStaff15 = new client.types.NonFacultyStaff(siteUser0);
        booking.Booking booking16 = null;
        booking.Time time21 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int22 = time21.getStartMinute();
        int int23 = time21.getStartHour();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyStaff15.changeBookingTime(booking16, time21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"booking.Booking.isActive()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment Successful" + "'", str11, "Payment Successful");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        client.SiteUser siteUser0 = new client.SiteUser();
        client.types.Student student1 = new client.types.Student(siteUser0);
        java.util.ArrayList<booking.Booking> bookingList2 = siteUser0.getBookings();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot6.setEnabled(false);
        parking.ParkingSpace parkingSpace11 = new parking.ParkingSpace(parkingLot6, "hi!", "");
        parkingSpace11.disable();
        java.lang.String str13 = siteUser0.find(parkingSpace11);
        boolean boolean16 = siteUser0.login("lastname", "Unkown");
        booking.Booking booking17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = siteUser0.cancelBooking(booking17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"client.ClientState.cancelBooking(booking.Booking)\" because \"this.clientState\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        management.Manager manager2 = null;
        managementTeam1.setSuper(manager2);
        booking.Booking booking4 = null;
        managementTeam1.cancel(booking4);
        java.lang.String str6 = managementTeam1.getTeamName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        database.Database database26 = database.Database.getInstance();
        java.util.ArrayList<parking.ParkingLot> parkingLotList27 = database26.pLots;
        database0.pLots = parkingLotList27;
        database.Database database29 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList30 = database29.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = database29.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = database29.getUsers();
        database.Database database33 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList34 = database33.getSpaces();
        parking.ParkingLot[] parkingLotArray35 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList36 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList36, parkingLotArray35);
        database33.pLots = parkingLotList36;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList39 = database33.getSpaces();
        parking.ParkingLot parkingLot43 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot43.setEnabled(false);
        parking.ParkingSpace parkingSpace48 = new parking.ParkingSpace(parkingLot43, "hi!", "");
        database33.remove(parkingSpace48);
        java.lang.String str50 = parkingSpace48.toString();
        database29.remove(parkingSpace48);
        database.Database database52 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList53 = database52.getSpaces();
        parking.ParkingLot[] parkingLotArray54 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList55 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList55, parkingLotArray54);
        database52.pLots = parkingLotList55;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList58 = database52.getSpaces();
        client.SiteUser siteUser59 = null;
        client.types.NonFacultyStaff nonFacultyStaff60 = new client.types.NonFacultyStaff(siteUser59);
        database52.add((client.Client) nonFacultyStaff60);
        client.SiteUser siteUser62 = null;
        client.types.Faculty faculty63 = new client.types.Faculty(siteUser62);
        faculty63.returnDeposit();
        database.Database database65 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList66 = database65.getSpaces();
        parking.ParkingLot[] parkingLotArray67 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList68 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList68, parkingLotArray67);
        database65.pLots = parkingLotList68;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList71 = database65.getSpaces();
        parking.ParkingLot parkingLot75 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot75.setEnabled(false);
        parking.ParkingSpace parkingSpace80 = new parking.ParkingSpace(parkingLot75, "hi!", "");
        database65.remove(parkingSpace80);
        database52.update((client.Client) faculty63, parkingSpace80);
        java.util.ArrayList<parking.ParkingLot> parkingLotList83 = database52.pLots;
        database29.setPlot(parkingLotList83);
        database0.setPlot(parkingLotList83);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(database26);
        org.junit.Assert.assertNotNull(parkingLotList27);
        org.junit.Assert.assertNotNull(database29);
        org.junit.Assert.assertNotNull(parkingSpaceListList30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(database33);
        org.junit.Assert.assertNotNull(parkingSpaceListList34);
        org.junit.Assert.assertNotNull(parkingLotArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList39);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(database52);
        org.junit.Assert.assertNotNull(parkingSpaceListList53);
        org.junit.Assert.assertNotNull(parkingLotArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList58);
        org.junit.Assert.assertNotNull(database65);
        org.junit.Assert.assertNotNull(parkingSpaceListList66);
        org.junit.Assert.assertNotNull(parkingLotArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList71);
        org.junit.Assert.assertNotNull(parkingLotList83);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        java.lang.String str26 = faculty23.toString();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot30.setEnabled(false);
        parking.ParkingSpace parkingSpace35 = new parking.ParkingSpace(parkingLot30, "hi!", "");
        int int36 = parkingLot30.getId();
        parkingLot30.disable();
        client.SiteUser siteUser39 = null;
        client.types.Visitor visitor44 = new client.types.Visitor(siteUser39, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount45 = new payment.BankAccount((client.Client) visitor44);
        parking.ParkingSpace parkingSpace46 = faculty23.book(parkingLot30, "Weak Password", (payment.Payable) bankAccount45);
        double double47 = bankAccount45.getBalance();
        bankAccount45.deposit((double) 52);
        client.Client client50 = bankAccount45.getOwner();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "client.types.Faculty" + "'", str26, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNull(parkingSpace46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNotNull(client50);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        database.Database database23 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList24 = database23.getSpaces();
        parking.ParkingLot[] parkingLotArray25 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList26 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList26, parkingLotArray25);
        database23.pLots = parkingLotList26;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList29 = database23.getSpaces();
        client.SiteUser siteUser30 = null;
        client.types.NonFacultyStaff nonFacultyStaff31 = new client.types.NonFacultyStaff(siteUser30);
        database23.add((client.Client) nonFacultyStaff31);
        client.SiteUser siteUser33 = null;
        client.types.Faculty faculty34 = new client.types.Faculty(siteUser33);
        faculty34.returnDeposit();
        database.Database database36 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList37 = database36.getSpaces();
        parking.ParkingLot[] parkingLotArray38 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList39 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList39, parkingLotArray38);
        database36.pLots = parkingLotList39;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList42 = database36.getSpaces();
        parking.ParkingLot parkingLot46 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot46.setEnabled(false);
        parking.ParkingSpace parkingSpace51 = new parking.ParkingSpace(parkingLot46, "hi!", "");
        database36.remove(parkingSpace51);
        database23.update((client.Client) faculty34, parkingSpace51);
        java.util.ArrayList<parking.ParkingLot> parkingLotList54 = database23.pLots;
        database0.setPlot(parkingLotList54);
        parking.ParkingLot parkingLot59 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database60 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList61 = database60.getSpaces();
        parking.ParkingLot[] parkingLotArray62 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList63 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList63, parkingLotArray62);
        database60.pLots = parkingLotList63;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList66 = database60.getSpaces();
        parking.ParkingLot parkingLot70 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot70.setEnabled(false);
        parking.ParkingSpace parkingSpace75 = new parking.ParkingSpace(parkingLot70, "hi!", "");
        database60.remove(parkingSpace75);
        parkingLot59.remove(parkingSpace75);
        client.SiteUser siteUser78 = null;
        client.types.Faculty faculty79 = new client.types.Faculty(siteUser78);
        parking.ParkingSpace parkingSpace81 = parkingLot59.getAvailableSpace((client.Client) faculty79, "hi!");
        parking.ParkingLot parkingLot82 = parkingSpace81.getParkingLot();
        boolean boolean83 = parkingSpace81.isOccupied();
        parking.Car car85 = new parking.Car("Duplicate Email");
        java.lang.String str86 = car85.getColor();
        parkingSpace81.setCar(car85);
        parkingSpace81.disable();
        client.Client client89 = database0.getClient(parkingSpace81);
        parking.Sensor sensor90 = new parking.Sensor(parkingSpace81);
        boolean boolean91 = sensor90.getOccupied();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(database23);
        org.junit.Assert.assertNotNull(parkingSpaceListList24);
        org.junit.Assert.assertNotNull(parkingLotArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList29);
        org.junit.Assert.assertNotNull(database36);
        org.junit.Assert.assertNotNull(parkingSpaceListList37);
        org.junit.Assert.assertNotNull(parkingLotArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList42);
        org.junit.Assert.assertNotNull(parkingLotList54);
        org.junit.Assert.assertNotNull(database60);
        org.junit.Assert.assertNotNull(parkingSpaceListList61);
        org.junit.Assert.assertNotNull(parkingLotArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList66);
        org.junit.Assert.assertNotNull(parkingSpace81);
        org.junit.Assert.assertNotNull(parkingLot82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Unkown" + "'", str86, "Unkown");
        org.junit.Assert.assertNull(client89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        java.util.ArrayList<parking.ParkingSpace> parkingSpaceList26 = database0.getOccupiedSpaces();
        parking.SpaceIterator spaceIterator27 = new parking.SpaceIterator((java.util.List<parking.ParkingSpace>) parkingSpaceList26);
        boolean boolean28 = spaceIterator27.hasNext();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingSpaceList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("Verified Email");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        java.lang.String str26 = faculty23.toString();
        faculty23.setEmailAddress("");
        parking.ParkingLot parkingLot32 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot32.setEnabled(false);
        parking.ParkingSpace parkingSpace37 = new parking.ParkingSpace(parkingLot32, "hi!", "");
        int int38 = parkingLot32.getId();
        parkingLot32.disable();
        java.util.ArrayList<parking.ParkingSpace> parkingSpaceList40 = parkingLot32.getSpaces();
        payment.MobilePayment mobilePayment44 = new payment.MobilePayment("hi!", "Location:Duplicate Email ParkingSpace: -1");
        parking.ParkingSpace parkingSpace45 = faculty23.book(parkingLot32, "lastname", (payment.Payable) mobilePayment44);
        parking.ParkingLot parkingLot49 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database50 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList51 = database50.getSpaces();
        parking.ParkingLot[] parkingLotArray52 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList53 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList53, parkingLotArray52);
        database50.pLots = parkingLotList53;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList56 = database50.getSpaces();
        parking.ParkingLot parkingLot60 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot60.setEnabled(false);
        parking.ParkingSpace parkingSpace65 = new parking.ParkingSpace(parkingLot60, "hi!", "");
        database50.remove(parkingSpace65);
        parkingLot49.remove(parkingSpace65);
        payment.CreditCard creditCard72 = new payment.CreditCard("hi!", 0, 100);
        parking.ParkingSpace parkingSpace73 = faculty23.book(parkingLot49, "Duplicate Email", (payment.Payable) creditCard72);
        parking.ParkingIterator parkingIterator74 = parkingLot49.availableSpotsIterator();
        boolean boolean75 = parkingIterator74.hasNext();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "client.types.Faculty" + "'", str26, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(parkingSpaceList40);
        org.junit.Assert.assertNull(parkingSpace45);
        org.junit.Assert.assertNotNull(database50);
        org.junit.Assert.assertNotNull(parkingSpaceListList51);
        org.junit.Assert.assertNotNull(parkingLotArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList56);
        org.junit.Assert.assertNull(parkingSpace73);
        org.junit.Assert.assertNotNull(parkingIterator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        client.SiteUser siteUser22 = null;
        client.types.Faculty faculty23 = new client.types.Faculty(siteUser22);
        parking.ParkingSpace parkingSpace25 = parkingLot3.getAvailableSpace((client.Client) faculty23, "hi!");
        database.Database database26 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList27 = database26.getSpaces();
        parking.ParkingLot[] parkingLotArray28 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList29 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList29, parkingLotArray28);
        database26.pLots = parkingLotList29;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList32 = database26.getSpaces();
        client.SiteUser siteUser33 = null;
        client.types.NonFacultyStaff nonFacultyStaff34 = new client.types.NonFacultyStaff(siteUser33);
        database26.add((client.Client) nonFacultyStaff34);
        client.SiteUser siteUser36 = null;
        client.types.Faculty faculty37 = new client.types.Faculty(siteUser36);
        faculty37.returnDeposit();
        database.Database database39 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList40 = database39.getSpaces();
        parking.ParkingLot[] parkingLotArray41 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList42 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList42, parkingLotArray41);
        database39.pLots = parkingLotList42;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList45 = database39.getSpaces();
        parking.ParkingLot parkingLot49 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot49.setEnabled(false);
        parking.ParkingSpace parkingSpace54 = new parking.ParkingSpace(parkingLot49, "hi!", "");
        database39.remove(parkingSpace54);
        database26.update((client.Client) faculty37, parkingSpace54);
        parkingLot3.add(parkingSpace54);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertNotNull(database26);
        org.junit.Assert.assertNotNull(parkingSpaceListList27);
        org.junit.Assert.assertNotNull(parkingLotArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList32);
        org.junit.Assert.assertNotNull(database39);
        org.junit.Assert.assertNotNull(parkingSpaceListList40);
        org.junit.Assert.assertNotNull(parkingLotArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList45);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        client.SiteUser siteUser0 = new client.SiteUser();
        siteUser0.logout();
        java.util.ArrayList<booking.Booking> bookingList2 = siteUser0.getBookings();
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        java.lang.String str2 = managementTeam1.getPassword();
        booking.Booking booking3 = null;
        managementTeam1.cancel(booking3);
        parking.ParkingLot parkingLot8 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot8.setEnabled(false);
        boolean boolean11 = parkingLot8.isEnabled();
        int int12 = parkingLot8.getId();
        boolean boolean13 = managementTeam1.disable((parking.Parking) parkingLot8);
        java.util.ArrayList<management.Manager> managerList14 = managementTeam1.getTeam();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(managerList14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        java.lang.String str6 = visitor5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        booking.Time time4 = new booking.Time((int) (byte) 1, 10, 0, (int) (byte) 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        boolean boolean22 = parkingSpace19.isOccupied();
        parkingSpace19.enable();
        parkingSpace19.enable();
        client.SiteUser siteUser25 = null;
        client.types.Faculty faculty26 = new client.types.Faculty(siteUser25);
        java.util.ArrayList<booking.Booking> bookingList27 = faculty26.getBookings();
        parkingSpace19.setOccupant((client.Client) faculty26);
        parking.ParkingLot parkingLot32 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database33 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList34 = database33.getSpaces();
        parking.ParkingLot[] parkingLotArray35 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList36 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList36, parkingLotArray35);
        database33.pLots = parkingLotList36;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList39 = database33.getSpaces();
        parking.ParkingLot parkingLot43 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot43.setEnabled(false);
        parking.ParkingSpace parkingSpace48 = new parking.ParkingSpace(parkingLot43, "hi!", "");
        database33.remove(parkingSpace48);
        parkingLot32.remove(parkingSpace48);
        client.SiteUser siteUser51 = null;
        client.types.Faculty faculty52 = new client.types.Faculty(siteUser51);
        parking.ParkingSpace parkingSpace54 = parkingLot32.getAvailableSpace((client.Client) faculty52, "hi!");
        parking.ParkingIterator parkingIterator55 = parkingSpace54.availableSpotsIterator();
        java.lang.String str56 = faculty26.find(parkingSpace54);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNotNull(database33);
        org.junit.Assert.assertNotNull(parkingSpaceListList34);
        org.junit.Assert.assertNotNull(parkingLotArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList39);
        org.junit.Assert.assertNotNull(parkingSpace54);
        org.junit.Assert.assertNull(parkingIterator55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Location:Duplicate Email ParkingSpace: -1" + "'", str56, "Location:Duplicate Email ParkingSpace: -1");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        payment.DebitCard debitCard3 = new payment.DebitCard("email", (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty1 = new client.types.Faculty(siteUser0);
        java.util.ArrayList<booking.Booking> bookingList2 = faculty1.getBookings();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        client.SiteUser siteUser25 = null;
        client.types.Faculty faculty26 = new client.types.Faculty(siteUser25);
        parking.ParkingSpace parkingSpace28 = parkingLot6.getAvailableSpace((client.Client) faculty26, "hi!");
        java.lang.String str29 = faculty26.toString();
        faculty26.setEmailAddress("");
        parking.ParkingLot parkingLot35 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot35.setEnabled(false);
        parking.ParkingSpace parkingSpace40 = new parking.ParkingSpace(parkingLot35, "hi!", "");
        int int41 = parkingLot35.getId();
        parkingLot35.disable();
        java.util.ArrayList<parking.ParkingSpace> parkingSpaceList43 = parkingLot35.getSpaces();
        payment.MobilePayment mobilePayment47 = new payment.MobilePayment("hi!", "Location:Duplicate Email ParkingSpace: -1");
        parking.ParkingSpace parkingSpace48 = faculty26.book(parkingLot35, "lastname", (payment.Payable) mobilePayment47);
        boolean boolean50 = mobilePayment47.makePayment((double) (-1L));
        java.lang.String str51 = faculty1.deposit((payment.Payable) mobilePayment47);
        boolean boolean53 = mobilePayment47.makePayment(15.0d);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "client.types.Faculty" + "'", str29, "client.types.Faculty");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        org.junit.Assert.assertNull(parkingSpace48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Payment Successful" + "'", str51, "Payment Successful");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        management.ManagementTeam managementTeam4 = new management.ManagementTeam("");
        java.lang.String str5 = managementTeam4.getPassword();
        management.Manager manager6 = null;
        managementTeam4.setSuper(manager6);
        management.Manager manager8 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam4);
        client.SiteUser siteUser9 = null;
        client.types.Faculty faculty14 = new client.types.Faculty(siteUser9, "Duplicate Email", "Duplicate Email", "Duplicate Email", "Unkown");
        boolean boolean16 = manager8.validate((client.Client) faculty14, "Already Registered");
        manager8.cancelAllBookingTodos();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        client.SiteUser siteUser0 = null;
        client.types.Faculty faculty1 = new client.types.Faculty(siteUser0);
        java.util.ArrayList<booking.Booking> bookingList2 = faculty1.getBookings();
        client.SiteUser siteUser3 = null;
        client.types.Faculty faculty4 = new client.types.Faculty(siteUser3);
        faculty4.returnDeposit();
        parking.ParkingLot parkingLot9 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database10 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList11 = database10.getSpaces();
        parking.ParkingLot[] parkingLotArray12 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList13 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList13, parkingLotArray12);
        database10.pLots = parkingLotList13;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList16 = database10.getSpaces();
        parking.ParkingLot parkingLot20 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot20.setEnabled(false);
        parking.ParkingSpace parkingSpace25 = new parking.ParkingSpace(parkingLot20, "hi!", "");
        database10.remove(parkingSpace25);
        parkingLot9.remove(parkingSpace25);
        client.SiteUser siteUser28 = null;
        client.types.Faculty faculty29 = new client.types.Faculty(siteUser28);
        parking.ParkingSpace parkingSpace31 = parkingLot9.getAvailableSpace((client.Client) faculty29, "hi!");
        payment.CreditCard creditCard36 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace37 = faculty4.book(parkingLot9, "Invalid Email", (payment.Payable) creditCard36);
        client.SiteUser siteUser39 = null;
        client.SiteVisitor siteVisitor40 = new client.SiteVisitor(siteUser39);
        java.lang.String str46 = siteVisitor40.register("Duplicate Email", "", "Duplicate Email", "Duplicate Email", "hi!");
        java.lang.String str52 = siteVisitor40.register("hi!", "Duplicate Email", "Already Registered", "Duplicate Email", "Already Registered");
        parking.ParkingLot parkingLot56 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot56.enable();
        client.SiteUser siteUser59 = null;
        client.types.Faculty faculty60 = new client.types.Faculty(siteUser59);
        faculty60.returnDeposit();
        parking.ParkingLot parkingLot65 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database66 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList67 = database66.getSpaces();
        parking.ParkingLot[] parkingLotArray68 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList69 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList69, parkingLotArray68);
        database66.pLots = parkingLotList69;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList72 = database66.getSpaces();
        parking.ParkingLot parkingLot76 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot76.setEnabled(false);
        parking.ParkingSpace parkingSpace81 = new parking.ParkingSpace(parkingLot76, "hi!", "");
        database66.remove(parkingSpace81);
        parkingLot65.remove(parkingSpace81);
        client.SiteUser siteUser84 = null;
        client.types.Faculty faculty85 = new client.types.Faculty(siteUser84);
        parking.ParkingSpace parkingSpace87 = parkingLot65.getAvailableSpace((client.Client) faculty85, "hi!");
        payment.CreditCard creditCard92 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        parking.ParkingSpace parkingSpace93 = faculty60.book(parkingLot65, "Invalid Email", (payment.Payable) creditCard92);
        parking.ParkingSpace parkingSpace94 = siteVisitor40.book(parkingLot56, "There is no car at this place", (payment.Payable) creditCard92);
        parking.ParkingSpace parkingSpace95 = faculty1.book(parkingLot9, "hi!", (payment.Payable) creditCard92);
        double double96 = creditCard92.getRecentPayment();
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(database10);
        org.junit.Assert.assertNotNull(parkingSpaceListList11);
        org.junit.Assert.assertNotNull(parkingLotArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList16);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertNull(parkingSpace37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Invalid Email" + "'", str46, "Invalid Email");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Invalid Email" + "'", str52, "Invalid Email");
        org.junit.Assert.assertNotNull(database66);
        org.junit.Assert.assertNotNull(parkingSpaceListList67);
        org.junit.Assert.assertNotNull(parkingLotArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList72);
        org.junit.Assert.assertNotNull(parkingSpace87);
        org.junit.Assert.assertNull(parkingSpace93);
        org.junit.Assert.assertNull(parkingSpace94);
        org.junit.Assert.assertNull(parkingSpace95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        client.SiteUser siteUser0 = new client.SiteUser();
        client.SiteUser siteUser1 = null;
        client.types.Faculty faculty2 = new client.types.Faculty(siteUser1);
        faculty2.returnDeposit();
        client.SiteUser siteUser4 = null;
        client.types.Visitor visitor9 = new client.types.Visitor(siteUser4, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount10 = new payment.BankAccount((client.Client) visitor9);
        java.lang.String str11 = faculty2.deposit((payment.Payable) bankAccount10);
        faculty2.setEmailAddress("client.types.Faculty");
        siteUser0.setState((client.ClientState) faculty2);
        client.types.Faculty faculty15 = new client.types.Faculty(siteUser0);
        client.SiteUser siteUser16 = null;
        client.types.Visitor visitor21 = new client.types.Visitor(siteUser16, "hi!", "", "Duplicate Email", "Duplicate Email");
        parking.Car car23 = new parking.Car("Weak Password");
        visitor21.addCar(car23);
        faculty15.addCar(car23);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Payment Successful" + "'", str11, "Payment Successful");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        client.SiteUser siteUser0 = null;
        client.SiteVisitor siteVisitor1 = new client.SiteVisitor(siteUser0);
        booking.Booking booking2 = null;
        boolean boolean3 = siteVisitor1.cancelBooking(booking2);
        booking.Booking booking4 = null;
        payment.CreditCard creditCard8 = new payment.CreditCard("", (int) (byte) 1, (int) '4');
        double double9 = creditCard8.getRecentPayment();
        java.lang.String str10 = siteVisitor1.pay(booking4, (payment.Payable) creditCard8);
        management.ManagementTeam managementTeam12 = new management.ManagementTeam("");
        managementTeam12.setTeamName("hi!");
        parking.ParkingLot parkingLot18 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database19 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList20 = database19.getSpaces();
        parking.ParkingLot[] parkingLotArray21 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList22 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList22, parkingLotArray21);
        database19.pLots = parkingLotList22;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList25 = database19.getSpaces();
        parking.ParkingLot parkingLot29 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot29.setEnabled(false);
        parking.ParkingSpace parkingSpace34 = new parking.ParkingSpace(parkingLot29, "hi!", "");
        database19.remove(parkingSpace34);
        parkingLot18.remove(parkingSpace34);
        client.SiteUser siteUser37 = null;
        client.types.Faculty faculty38 = new client.types.Faculty(siteUser37);
        parking.ParkingSpace parkingSpace40 = parkingLot18.getAvailableSpace((client.Client) faculty38, "hi!");
        parking.ParkingLot parkingLot41 = parkingSpace40.getParkingLot();
        boolean boolean42 = managementTeam12.disable((parking.Parking) parkingSpace40);
        client.SiteUser siteUser43 = null;
        client.types.NonFacultyStaff nonFacultyStaff44 = new client.types.NonFacultyStaff(siteUser43);
        nonFacultyStaff44.setEmailAddress("");
        nonFacultyStaff44.setRATE(0.0d);
        parkingSpace40.setOccupant((client.Client) nonFacultyStaff44);
        java.lang.String str50 = siteVisitor1.find(parkingSpace40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(database19);
        org.junit.Assert.assertNotNull(parkingSpaceListList20);
        org.junit.Assert.assertNotNull(parkingLotArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList25);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertNotNull(parkingLot41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot3.setEnabled(false);
        parking.ParkingSpace parkingSpace8 = new parking.ParkingSpace(parkingLot3, "hi!", "");
        int int9 = parkingLot3.getId();
        parkingLot3.disable();
        parkingLot3.disable();
        java.lang.String str12 = parkingLot3.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        client.SiteUser siteUser0 = null;
        client.types.Visitor visitor5 = new client.types.Visitor(siteUser0, "hi!", "", "Duplicate Email", "Duplicate Email");
        java.util.ArrayList<booking.Booking> bookingList6 = visitor5.getBookings();
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        parking.ParkingLot parkingLot6 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database7 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList8 = database7.getSpaces();
        parking.ParkingLot[] parkingLotArray9 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList10 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList10, parkingLotArray9);
        database7.pLots = parkingLotList10;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList13 = database7.getSpaces();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot17.setEnabled(false);
        parking.ParkingSpace parkingSpace22 = new parking.ParkingSpace(parkingLot17, "hi!", "");
        database7.remove(parkingSpace22);
        parkingLot6.remove(parkingSpace22);
        database0.add(parkingLot6);
        java.util.ArrayList<parking.ParkingSpace> parkingSpaceList26 = database0.getOccupiedSpaces();
        client.SiteUser siteUser27 = null;
        client.types.Faculty faculty28 = new client.types.Faculty(siteUser27);
        faculty28.returnDeposit();
        client.SiteUser siteUser30 = null;
        client.types.Visitor visitor35 = new client.types.Visitor(siteUser30, "hi!", "", "Duplicate Email", "Duplicate Email");
        payment.BankAccount bankAccount36 = new payment.BankAccount((client.Client) visitor35);
        java.lang.String str37 = faculty28.deposit((payment.Payable) bankAccount36);
        faculty28.setEmailAddress("client.types.Faculty");
        management.ManagementTeam managementTeam44 = new management.ManagementTeam("");
        java.lang.String str45 = managementTeam44.getPassword();
        management.Manager manager46 = null;
        managementTeam44.setSuper(manager46);
        management.Manager manager48 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam44);
        database.Database database49 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList50 = database49.getSpaces();
        parking.ParkingLot[] parkingLotArray51 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList52 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList52, parkingLotArray51);
        database49.pLots = parkingLotList52;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList55 = database49.getSpaces();
        parking.ParkingLot parkingLot59 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot59.setEnabled(false);
        parking.ParkingSpace parkingSpace64 = new parking.ParkingSpace(parkingLot59, "hi!", "");
        database49.remove(parkingSpace64);
        parkingSpace64.enable();
        manager48.enable((parking.Parking) parkingSpace64);
        parking.Car car69 = new parking.Car("Duplicate Email");
        java.lang.String str70 = car69.getPlateNumber();
        parkingSpace64.setCar(car69);
        database0.update((client.Client) faculty28, parkingSpace64);
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(database7);
        org.junit.Assert.assertNotNull(parkingSpaceListList8);
        org.junit.Assert.assertNotNull(parkingLotArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList13);
        org.junit.Assert.assertNotNull(parkingSpaceList26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Payment Successful" + "'", str37, "Payment Successful");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(database49);
        org.junit.Assert.assertNotNull(parkingSpaceListList50);
        org.junit.Assert.assertNotNull(parkingLotArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList55);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Duplicate Email" + "'", str70, "Duplicate Email");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        management.Flag flag1 = new management.Flag("Duplicate Email");
        boolean boolean2 = flag1.isResolved();
        boolean boolean3 = flag1.isResolved();
        flag1.setResolved(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        client.SiteUser siteUser0 = new client.SiteUser();
        client.types.Faculty faculty5 = new client.types.Faculty(siteUser0, "hi!", "client.types.Faculty", "client.types.Faculty", "Weak Password");
        client.ClientState clientState6 = siteUser0.getClient();
        boolean boolean9 = siteUser0.login("email", "");
        org.junit.Assert.assertNotNull(clientState6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        parking.Car car1 = new parking.Car("Duplicate Email");
        java.lang.String str2 = car1.getModel();
        java.lang.String str3 = car1.getModel();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Unkown" + "'", str2, "Unkown");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Unkown" + "'", str3, "Unkown");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        parking.ParkingLot parkingLot3 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        parkingLot3.remove(parkingSpace19);
        parkingSpace19.disable();
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        parking.ParkingLot[] parkingLotArray2 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList3 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList3, parkingLotArray2);
        database0.pLots = parkingLotList3;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList6 = database0.getSpaces();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot10.setEnabled(false);
        parking.ParkingSpace parkingSpace15 = new parking.ParkingSpace(parkingLot10, "hi!", "");
        database0.remove(parkingSpace15);
        parkingSpace15.enable();
        parkingSpace15.enable();
        parking.Car car19 = parkingSpace15.getCar();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(parkingLotArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList6);
        org.junit.Assert.assertNull(car19);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        int int6 = time5.getStartMinute();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        database.Database database0 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList1 = database0.getSpaces();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = database0.getUsers();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = database0.getUsers();
        database.Database database4 = database.Database.getInstance();
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList5 = database4.getSpaces();
        parking.ParkingLot[] parkingLotArray6 = new parking.ParkingLot[] {};
        java.util.ArrayList<parking.ParkingLot> parkingLotList7 = new java.util.ArrayList<parking.ParkingLot>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parking.ParkingLot>) parkingLotList7, parkingLotArray6);
        database4.pLots = parkingLotList7;
        java.util.ArrayList<java.util.ArrayList<parking.ParkingSpace>> parkingSpaceListList10 = database4.getSpaces();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot((int) '4', "", "Duplicate Email");
        parkingLot14.setEnabled(false);
        parking.ParkingSpace parkingSpace19 = new parking.ParkingSpace(parkingLot14, "hi!", "");
        database4.remove(parkingSpace19);
        java.lang.String str21 = parkingSpace19.toString();
        database0.remove(parkingSpace19);
        management.ManagementTeam managementTeam24 = new management.ManagementTeam("");
        java.lang.String str25 = managementTeam24.getPassword();
        booking.Booking booking26 = null;
        managementTeam24.cancel(booking26);
        database0.add(managementTeam24);
        management.ManagementTeam managementTeam33 = new management.ManagementTeam("");
        java.lang.String str34 = managementTeam33.getPassword();
        management.Manager manager35 = null;
        managementTeam33.setSuper(manager35);
        management.Manager manager37 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam33);
        manager37.enableAllLots();
        managementTeam24.add(manager37);
        boolean boolean43 = manager37.login("lastname", "email", "");
        manager37.setPassword("There is no car at this place");
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertNotNull(parkingSpaceListList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(database4);
        org.junit.Assert.assertNotNull(parkingSpaceListList5);
        org.junit.Assert.assertNotNull(parkingLotArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parkingSpaceListList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        booking.Time time4 = new booking.Time((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        booking.Time time5 = new booking.Time(time4);
        double double6 = time4.totalTime();
        double double7 = time4.totalTime();
        booking.Time time8 = new booking.Time(time4);
        booking.Time time9 = new booking.Time(time4);
        booking.Time time10 = new booking.Time(time9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.0d + "'", double6 == 101.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 101.0d + "'", double7 == 101.0d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        management.ManagementTeam managementTeam1 = new management.ManagementTeam("");
        managementTeam1.setTeamName("hi!");
        managementTeam1.setUsername("Payment Successful");
        management.ManagementTeam managementTeam10 = new management.ManagementTeam("");
        java.lang.String str11 = managementTeam10.getPassword();
        management.Manager manager12 = null;
        managementTeam10.setSuper(manager12);
        management.Manager manager14 = new management.Manager("client.types.Faculty", "Duplicate Email", "Weak Password", managementTeam10);
        management.Manager[] managerArray15 = new management.Manager[] { manager14 };
        java.util.ArrayList<management.Manager> managerList16 = new java.util.ArrayList<management.Manager>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<management.Manager>) managerList16, managerArray15);
        managementTeam1.setTeam(managerList16);
        java.lang.String str19 = managementTeam1.getPassword();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(managerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
    }
}

