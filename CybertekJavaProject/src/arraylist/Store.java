package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import constructors.Item;
import constructors.MyShop;

public class Store {

	String name;
	String address;
	ArrayList<Item> storeItems = new ArrayList<>();
	int numOfItems;
	double totalSales;

	public void sell(String itemName) {
		for (int i = 0; i < storeItems.size(); i++) {
			if (storeItems.get(i).name.equals(itemName)) {
				System.out.println(itemName + " is sold for " + storeItems.get(i).price);
				numOfItems--;
				totalSales += storeItems.get(i).price;
				storeItems.remove(i);
				break;
			}
		}
	}

	public void refund(Item item) {
		System.out.println(item.name + " refunded!!!");
		addItem(item);
		totalSales = totalSales - item.price;

	}

	public boolean checkItem(String itemName) {
		for (Item item : storeItems) {
			if (item.name.equals(itemName)) {
				System.out.println(itemName + " found in stock");
				return true;
			}
		}
		System.out.println(itemName + " is not found in stock");
		return false;
	}

	public void exchange(Item toReturn, Item toGet) {
		System.out.println("\n" + toReturn.name + " exchanged to " + toGet.name);
		storeItems.add(toReturn);
		storeItems.remove(toGet);
		totalSales = totalSales - toReturn.price + toGet.price;
	}

	public void addItem(int numAdd) {
		for(int i = 0; i < numAdd; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter item name " + (i+1));
			String str = input.nextLine();
			System.out.println("Please enter price name " + (i+1));
			double d = input.nextDouble();
			input.nextLine();
			Item item = new Item(str, d);
			addItem(item);
		}
	}

	public Store(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void addItem(Item item) {
		storeItems.add(item);
		numOfItems++;
	}

	public void seelInventory() {
		System.out.println("\nOUR INVENTORY LIST:::::");
		for (int i = 0; i < storeItems.size(); i++) {
			storeItems.get(i).info();
		}
//		for (Item i : storeItems) {
//			i.info();
//		}
	}

}
