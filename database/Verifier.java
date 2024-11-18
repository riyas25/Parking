package database;

import java.util.regex.Pattern;

public final class Verifier {
	//this class will verify that inputs follow a given syntax
	//eg. all email addresses are in the form username@domainname
	 
	private static final String emailSyntax = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	private static Pattern emailPattern = Pattern.compile(emailSyntax);
	
	private static final String nonVisitor_EmailSyntax = "^[A-Za-z0-9+_.-]+@[A-Za-z.]+.yorku.ca$";
	private static Pattern nonVisitor_EmailPattern = Pattern.compile(nonVisitor_EmailSyntax);
	
	private static final String usernameSyntax = "^[A-Za-z0-9+_.-]+$";
	private static Pattern usernamePattern = Pattern.compile(usernameSyntax);
	
	private static final String plateSyntax = "^[A-Za-z+]+[0-9+]+$";
	private static Pattern platePattern = Pattern.compile(plateSyntax);
	
	private static final String punct = "[!\"#$%&'()*,/:;<=>?@`{|}~+_.-]";
	private static final String upper = "[A-Z]";
	private static final String lower = "[a-z]";
	private static final String digit = "[0-9]";
	
	public static final String VERIFIED_EMAIL = "Verified Email";
	public static final String INVALID_EMAIL = "Invalid Email";
	public static final String DUPE_EMAIL = "Duplicate Email";
	public static final String WEAK_PW = "Weak Password";
	public static final String STRONG_PW = "Strong Password";
	public static final String SUCCESSFUL = "Successful";
	
	public static boolean verifyEmail(String email) {
		return emailPattern.matcher(email).matches();
	}
	
	public static boolean verifyUsername(String username) {
		return usernamePattern.matcher(username).matches();
	}
	
	public static boolean verifyNonVisitorEmail(String email) {
		return nonVisitor_EmailPattern.matcher(email).matches();
	}
	
	public static boolean verifyPassword(String pw) {
		//check that pw contains all the needed elements
		boolean hasPunct = Pattern.compile(punct).matcher(pw).find();
		boolean hasUpper = Pattern.compile(upper).matcher(pw).find();
		boolean hasLower = Pattern.compile(lower).matcher(pw).find();
		boolean hasDigit = Pattern.compile(digit).matcher(pw).find();
		return hasPunct&&hasUpper&&hasLower&&hasDigit;
	}

	public static boolean verifyPlate(String plate) {
		return platePattern.matcher(plate).matches();
	}
	
}
