package arraylist;

import constructors.Item;

public class ShoppingCenter {

	public static void main(String[] args) {
		Store channel = new Store("Good vibes", "Chicago, IL");
		channel.seelInventory();
		Item screen = new Item("Screen ABG", 35);
		Item tire = new Item("Good rich", 299);
		channel.addItem(screen);
		channel.addItem(tire);
		channel.seelInventory();
		channel.checkItem("Lip sticks");
		channel.checkItem("Good rich");
		Item board = new Item("White board", 90);
		System.out.println(channel.totalSales);
		channel.exchange(board, tire);
		channel.seelInventory();
		System.out.println(channel.totalSales);
		
		channel.addItem(2);
		channel.seelInventory();
		System.out.println(channel.totalSales);
		System.out.println(channel.numOfItems);
		
		
	}
}
