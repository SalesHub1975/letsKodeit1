package stringmanipulation;

import java.util.Scanner;

public class dataValidation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name  = input.nextLine().trim();
		
		if(name.isEmpty()) {
			System.out.println("You didn't provide the name");
			System.out.println("Enter your name again:");
		}
		else  {
			System.out.println("Your name " + name);
		}
		
		
	}
}
