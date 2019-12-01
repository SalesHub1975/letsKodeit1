package tasks;

import java.security.acl.LastOwnerException;
import java.util.Scanner;

public class SpecialJAmes {
	
//	Write a program that asks the name from the user
//	if they enter james then ask their last name
//	if their name is not james then dont ask the last name
//	NOTE: Use nested if statement
//	give value "nobody" if the name is not james
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name = input.nextLine();
		String lastName;
		
		if(name.equals("James")) {
			System.out.println("Enter last name:");
			lastName = input.nextLine();
		}
		else {
			lastName = "Nobody";
		}
		System.out.println("First name: " + name);
		System.out.println("Lastname: " + lastName);
		
		
	
}
}
