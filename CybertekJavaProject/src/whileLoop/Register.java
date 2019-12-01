package whileLoop;

import java.security.AllPermission;
import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many items are you purchasing?");
		int i = input.nextInt();
		double total = 0;
		String allitems = "";
		
		for(int j=1; j<=i; j++) {
			System.out.println("What is item " + j+ "?");
		
			input.nextLine();
			String item1 = input.nextLine();
			System.out.println("How much is " + item1 + "?");
			double price1 = input.nextDouble();
			allitems = allitems + item1 + ", ";
			total = total+price1;		
		}
		System.out.println("Your items: " + allitems);
		System.out.println("Your total Price: $" + total);

	}
	
}
