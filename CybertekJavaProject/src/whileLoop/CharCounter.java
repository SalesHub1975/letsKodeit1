package whileLoop;

import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		// use charAt method and loop
		// Read the word and store into String.
		// REad second word and covert it to char
		// iterate through the characters of the word
		// each character you iterate keep checking with given char
		// if same count it if not 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word:");
		String word = input.nextLine();
		System.out.println("Please enter character:");
		char c = input.next().charAt(0);
		System.out.println(word);
		System.out.println(c);
		int counter = 0; 
		for(int i = 0; i < word.length(); i++) {
			if(c == word.charAt(i)) {
				counter++;
			}
		}
		System.out.println(counter);
		
	}

}

