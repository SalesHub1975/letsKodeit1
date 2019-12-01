package tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int i = r.nextInt(10);
		
		
		while(1>0) {
			
			System.out.println("Please guess the number:");
			int j = input.nextInt();
			if(j>i) {
				System.out.println("Your guess is to high");
				
			}
			else if (j<i) {
				System.out.println("Your guess is too low");
				
			}
			else {
				System.out.println("Congrats");
				break;
				
			}
			}
		System.out.println("Generated number is: " + i);
	
	}	
}
