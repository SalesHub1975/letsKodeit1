package stringmanipulation;

import java.util.Scanner;

public class NoU {

		public static void main(String[] args) {
			
			String message;
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter your message:");
			message = input.nextLine();
			
			String s = message.replace('u', 'U');
			System.out.println(s);
			
			
		}
}
