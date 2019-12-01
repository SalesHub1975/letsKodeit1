package switchstatements;

import java.util.Scanner;

public class UnderstandingBoolean {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		boolean currentStudent;
		System.out.println("Please enter your name");
		name= input.nextLine();
		System.out.println("Are you a student currently?\nyes/no");
		String response= input.nextLine();
		if(response.equals("yes")) {
			currentStudent=true;
			System.out.println(name + " you Rock!!");
		}
		else {
			currentStudent=false;
		System.out.println("Name:" + name);
		
		System.out.println("CurrentStudent: " + currentStudent);
		
		/////////////////////////////////////PRINT %NAME YOU ROCK
		
		}
	}
	}
