package stringmanipulation;

import java.util.Scanner;

public class NameValidation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean hasMultipleWords;
		System.out.println("Enter something:");
		String name = input.nextLine();
//		name = name.trim();							////////////// str = str.trim(); ->removes spaces 
		
		
		if(name.isEmpty()) {
			System.out.println("Please enter data:");
		}
		else {
		if(name.contains(" ")) {
			hasMultipleWords = true;
		}
		else {
			hasMultipleWords = false;
		}	
		System.out.println("Multiple words: " + hasMultipleWords);
		
				
//		double price = 44.99;
//		String priceInString = price + "";  		/////////////  any data added to string is string
//		System.out.println(priceInString);
//		boolean check = priceInString.isEmpty();	///////////// false, because its not empty
//		System.out.println(check);
		
		}
		
	}

}
