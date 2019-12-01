package loops;

import java.util.Scanner;

public class LettersOnEachLIne {

	public static void main(String[] args) {
		
//	Please write a program that asks the name from user using 
//	Scanner and print "Welcome, %name" for 15 times
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String name = input.nextLine();
		
//		for(int i=0; i<15; i++) {
//			System.out.println(i);
//			System.out.println("Welcome to our club: " + name);
//		}
		
//		PART II
//		PRint each character on the new line
//		EX:
//		J
//		A
//		M
//		E
//		S
		
		int l = name.length();
		
		for (int i=0; i < l; i++) {
			System.out.println(name.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
