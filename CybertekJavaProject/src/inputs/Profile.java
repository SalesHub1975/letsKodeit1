package inputs;

import java.util.Scanner;

public class Profile {

	public static void main(String[] args) {
		
		System.out.println("Welcome to my Program!");
		String firstName, lastName, location;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		firstName = input.nextLine();
		System.out.println("YOU ARE THE BEST, " + firstName);
		System.out.println("Please enter your lastname:");
		lastName = input.nextLine();
		System.out.println("HOW CAN I HELP YOU, Mr. " + lastName);
		System.out.println("WHERE ARE YOU FROM?");
		location = input.nextLine();
		System.out.println("I AM ALSO FROM " + location);
		System.out.println("HOW OLD ARE YOU, " + firstName);
		age = input.nextInt();
		System.out.println("BUT YOU ARE LOOKING YOUNGER, " + firstName);
	}
	
}
