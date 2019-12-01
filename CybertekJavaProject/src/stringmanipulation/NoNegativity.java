package stringmanipulation;

import java.util.Scanner;

public class NoNegativity {
	public static void main(String[] args) {
		
//		Write a program that asks message from the user
//		replace word "hate" with "love"
//		print new version of the message
//		I hate youuu! >> I love youuu 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter message:");
		String s = input.nextLine().toLowerCase();
		String message = s.replace("hate", "love").toUpperCase();
		
		System.out.println(message);
		
		
	}
}
