package ifelsestatements;

import java.util.Scanner;

public class CreateAccount {

	public static void main(String[] args) {
		
		String username1 = "test";
		String username2 = "james";
		String enteredUsername;
		
		// Write a code that asks to create username from user on console
		// Check if entered username already exists in database. (In database there are two usernames now).
		// If entered username already exists print "username taken" else "username created"
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please create username;");
		enteredUsername = input.nextLine();
		
		if(enteredUsername.equals(username1) || enteredUsername.equals(username2)){
			System.out.println("Username taken");
		}
			
			else {
				System.out.println("Username created");
			System.out.println("Please create password");
		
	
	
	String password = input.nextLine();
	if(password.length()>=5 && password.length()<=12) {
		System.out.println("Password created");
	}
			
	else {
		System.out.println("Your password must no less than 5 and no more than 12 characters");
	}
			}
			}
		
		
	}

