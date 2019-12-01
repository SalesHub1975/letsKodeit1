package casting;

import java.util.Scanner;

public class Task2_19March {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message:");
		String s = input.nextLine().trim();
		
		
		char firstChar = s.charAt(0);
		int i = firstChar;
//		System.out.println(i);
		
		boolean mark = false;
		if(s.endsWith(".") || s.endsWith("!")) {
			mark=true;
		}
	
		if(i>=65 && i<=90 && mark==true) {
			System.out.println("Message valid");
		}
		else {
			System.out.println("Message is invalid");
		}
	}
	
}
