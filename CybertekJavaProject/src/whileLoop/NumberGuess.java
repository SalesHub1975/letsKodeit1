package whileLoop;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		int secreNum = 45;
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		while(guess != secreNum) {								/// if (boolean)true it will continue running
			System.out.println("Wrong! Enter your guess");		/// once (boolean) false it goes outside of loop
			guess = input.nextInt();
		}
		System.out.println("Congrats");
	}
}
