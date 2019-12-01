package tasks;

import java.util.Random;
import java.util.Scanner;

public class Warmup4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		int i = random.nextInt(10);					//  bond --> limit number from 0 to 10 (10 is not included)
		


		System.out.println("Please enter your guess between 0 - 10:");
		int number = input.nextInt();
	
		if (number>0 && number<=10)	{
	 
		if (i>number) {
		 System.out.println("Your guess is too low");
	 }	
		else if (i<number) {
		 System.out.println("Your guess is too high");
	 }
		else if (i==number) {
		 System.out.println("Congratulations!");
	 }
		System.out.println("Generated random number was " + i);
		}
	 else {
		 System.out.println("Invalid guess number");
	 }
	}
}
