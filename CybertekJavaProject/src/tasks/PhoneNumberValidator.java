package tasks;

import java.util.Scanner;

public class PhoneNumberValidator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		boolean valid = true;
		System.out.println("Please enter the phone number:");
		String phone = input.next();
		System.out.println(phone.length());
		if(!(phone.length() == 10 || phone.length() == 12)) {
			valid = false;
			System.out.println("Invalid length");
		}
		else if(phone.length() == 12) {
			if(!(phone.charAt(0) == '(' && phone.charAt(4) == ')')) {
				valid = false;
				System.out.println("Invalid format phone number");
			}
		}
		phone = phone.replace("(", "");
		phone = phone.replace(")", "");
		System.out.println(phone);
		if(phone.length() == 10) {
			for(int i = 0; i < phone.length(); i++) {
				char c = phone.charAt(i);
				int ii = c;
				if(ii < 48 || ii > 57) {
					valid = false;
					System.out.println("Must be number between 0 - 9");
					break;
				}
			}
			
		}
		if(valid) {
			System.out.println("Valid phone number");
		}
		
	}

}


