package management;

import java.util.HashMap;
import java.util.Random;

public class AutoAccountGenerationSystem {
	
	private static HashMap<ManagementTeam, String> Usernames = new HashMap<ManagementTeam, String>();
	private static HashMap<ManagementTeam, String> Passwords = new HashMap<ManagementTeam, String>();
	
    // Generate a new management account
    public static void generateNewAccount(ManagementTeam team) {
    	
            // Generate a unique username and strong password
            String newUsername = generateUniqueUsername();
            String newPassword = generateStrongPassword();
            
            // Store the new account in the database
            storeAccount(team, newUsername, newPassword);
             
            System.out.println("\nNew account generated successfully:");
            System.out.println("Username: " + newUsername);
            System.out.println("Password: " + newPassword + "\n");
                  
    }
    
    // Generate a unique username
    private static String generateUniqueUsername() {
    	
        String prefix = "ManagerTeam";
        String UniqueName;
    	do {
            String suffix = String.valueOf(new Random().nextInt(10000));
            UniqueName = prefix + suffix;
    	}
    	while (Usernames.containsValue(UniqueName));
        return UniqueName;
    }
    
    // Generate a strong password
    private static String generateStrongPassword() {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_-+={}[]\\|:;\"'<>,.?/";
        
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            password.append(uppercaseLetters.charAt(random.nextInt(uppercaseLetters.length())));
            password.append(lowercaseLetters.charAt(random.nextInt(lowercaseLetters.length())));
            password.append(numbers.charAt(random.nextInt(numbers.length())));
            password.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        
        return password.toString();
    }
    
    // Store the new account in the database
    private static void storeAccount(ManagementTeam team, String username, String password) {
		Usernames.put(team, username);
		Passwords.put(team, password);
		team.setUsername(username);
		team.setPassword(password);
    }

	public static HashMap<ManagementTeam, String> getUsernames() {
		return Usernames;
	}

	public static HashMap<ManagementTeam, String> getPasswords() {
		return Passwords;
	}

}
