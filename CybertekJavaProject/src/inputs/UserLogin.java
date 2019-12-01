package inputs;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		
		String username, password;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter user name:");
		username = input.nextLine();
		System.out.println("Please enter password:");
		password = input.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("\t\t" + "Welcome, " + username);
		System.out.println();
		System.out.println("Profile" + "\t\t" + "Pictures" + "\t\t" + "Videos");
		System.out.println("Posts" + "\t\t" + "Posts" + "\t\t\t" + "Comments");
		System.out.println("Products" + "\t" + "Orders" + "\t\t\t" + "Feedbacks");
	
		String firstName, lastName, address;
		String confirm;
		long creditCard;
							
		
		System.out.println();;
		System.out.println("\t\t\t" + "Profile edit page:\n");
		System.out.println("First name: ");
		firstName = input.nextLine();
		System.out.println("Last name: ");
		lastName = input.nextLine();
		System.out.println("Address: ");
		address = input.nextLine();
		System.out.println("Credit Card Number: ");
		creditCard = input.nextLong();
		System.out.println();
		System.out.println("Information you entered:");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Address: " + address);
		System.out.println("CC Number: " + creditCard);
		
		
		System.out.println();
		System.out.println("Save now?");
		System.out.println("> Yes"); 
		System.out.println("> No\n");
		input.nextLine(); 
		confirm = input.nextLine();
		//System.out.println(">" + confirm);
		System.out.println();
		System.out.println("Thank you");
	
	}
	
	
}
