package constructors;

import java.util.Scanner;

public class MyShop {
	
	public static void main(String[] args) {
		

//		Item item1 = new Item("Controller", 8);
//		item1.info();

		

		Scanner input = new Scanner(System.in);
		System.out.println("How many items you want to add?");
		int size = input.nextInt();
		input.nextLine();
		Item[] myItems = new Item[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Please enter name for item " + (i + 1));
			String iname = input.nextLine();
			System.out.println("Please enter price for item " + (i + 1));
			double iprice = input.nextDouble();
			input.nextLine();
			Item ii = new Item(iname, iprice);
			myItems[i] = ii;
			// or myItems[i] = new Item(iname, iprice);
		}

		for (Item a : myItems) {
			a.info();
		}
		
		
	}

}
