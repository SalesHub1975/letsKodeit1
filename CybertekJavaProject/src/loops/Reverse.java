package loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter message:");
		String word = input.nextLine();
		int lastIndex = word.length()-1;
		
		for(int i = lastIndex; i>=0; i--) {
			System.out.print(word.charAt(i));
		}
		
		
	}
}
