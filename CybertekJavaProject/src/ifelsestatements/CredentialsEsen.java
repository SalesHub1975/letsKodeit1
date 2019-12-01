package ifelsestatements;

import java.util.Scanner;

public class CredentialsEsen {

	public static void main(String[] args) {
		 
		String username = "test";
		String password = "test123";
		String enteredusername;
		String enteredpassword;
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("Please enter username:");
		enteredusername = input.nextLine();
		System.out.println("Please enter password:");
		enteredpassword = input.nextLine();
		
		// write code that takes the username and password from user on console
		// check if both username and password are matching, if matching
		// print "Welcome,%username!!!"
		if(enteredusername.equals(username) && enteredpassword.equals(password)) {
			System.out.println("Welcome, " + username);
		}
		
		// if username is correct but password is incorrect print "password incorrect"
		else if(enteredusername.equals(username) && !enteredpassword.equals(password)) {
			System.out.println("Invalid password! Username is correct");
		}
		
		// if username is incorrect but password is correct print "username incorrect"
		else if(!enteredusername.equals(username) && enteredpassword.equals(password)){
			System.out.println("Invalid username. Password is correct");
		}
		else {
			System.out.println("Invalid credentials");
		}
		// else print invalid credentials
		
		
		
		
		
		
		
				
		
		
		
		
	}
}
