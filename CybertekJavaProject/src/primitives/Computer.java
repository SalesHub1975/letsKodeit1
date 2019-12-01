package primitives;

import java.util.Scanner;

public class Computer {

	public static void main(String[] args) {
		
		String something;
		int b11students = 130;
		boolean graduated = false;
		double averageGpa = 3.9;
		
		System.out.println("Welcome to Cybertek Systems");
		
		Scanner input = new Scanner (System.in);
		
		something = input.nextLine();
		
		System.out.println("THIS IS: " + something);
	
		
		System.out.println("THe number of students:" + b11students);
		System.out.println("Graduated:" + graduated);
		System.out.println("The average GPA is:" + averageGpa);
		
		System.out.println("MADINA");
	}
}
