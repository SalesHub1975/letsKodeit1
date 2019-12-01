package ifelsestatements;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		//Get only the ages between 0 and 120
		//if they enter valid age then print "valid age" else "invalid age"
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, how old are you?");
		int age = input.nextInt();
		
		
		if(age>0 && age<=120) {
			System.out.println("Valid age");
		if(age>=21 && age<=120) {
				System.out.println("Welcome to club!");
			}
		
				else {
					int age1 = 21-age;
					System.out.println("Please come back in" + " " + age1+" year");
				}
				}
		
		else {
			System.out.println("invalid");
			//int age1 = 21-age;
			//System.out.println("Please come back in" + " " + age1+" year");
	
	}
	}
}
