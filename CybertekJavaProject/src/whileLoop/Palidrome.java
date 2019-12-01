package whileLoop;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word:");
		String word = input.nextLine();
		String reversed = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reversed = reversed + word.charAt(i);
		}
		if(word.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}




