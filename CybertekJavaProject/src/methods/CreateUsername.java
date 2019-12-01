package methods;

import java.util.Random;

public class CreateUsername {

	public static void main(String[] args) {
	
		createUsername("Ramis", "Umetaliev");
		createUsername("Mohamed", "Salah");
		reverseString("Cybertek");
		
	}
	public static void createUsername(String first, String lastName) {
		Random r = new Random();
		int i = r.nextInt(101);
		System.out.print(first.toLowerCase() + lastName.toLowerCase() + i);
		System.out.println();
	}
	
	public static void reverseString(String name) {
		for(int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}	
	}
	
}
