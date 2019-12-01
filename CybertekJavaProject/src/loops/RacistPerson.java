package loops;

import java.util.Scanner;

public class RacistPerson {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Write a program named RacistPerson. Ask the name from the user and print "Good job, %name" except for the James.
		
		for( ; ; ) {
			System.out.println("What is your name:");
			String name = input.nextLine();	
			if(name.equalsIgnoreCase("james")) {
				continue;
			}
				System.out.println("Good job, " + name);
			}
			
					
		}
	}

