package whileLoop;

import java.util.Scanner;

public class StepNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("ENTER 2 NUMBERS:");
		int number = input.nextInt();
		int number2 = input.nextInt();
		
		for (int i = 0; i<=(number-number2)*(-1); number++) {
			System.out.println("Step " + number);
		}
			
		
	}	
	}	
	