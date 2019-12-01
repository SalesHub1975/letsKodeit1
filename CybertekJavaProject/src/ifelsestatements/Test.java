package ifelsestatements;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		// Get only the ages between 0 and 120
		// if they enter valid age the print "valid age" else "invalid age"
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome. Please enter your age:");
		int age = input.nextInt();
		
		if(age > 0 && age <=120) {
			System.out.println("valid age");
			if(age >= 21) {
				System.out.println("Welcome to Club");
			}
			else {
				System.out.println("Not enough age!");
				int difference = 21 - age;
				System.out.println("Please come back after " + difference + " years");
			}
		}
		else {
			System.out.println("invalid age");
		}
		
		
		
		
	}

}