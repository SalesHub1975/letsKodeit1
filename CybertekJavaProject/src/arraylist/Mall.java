package arraylist;

import arrays.numberOfCars;
import constructors.Item;

public class Mall {

	public static void main(String[] args) {
		
		Store myStore = new Store("Cool books", "600 N Michigan ave, Chicago IL");
		
		Item book1 = new Item("100$ startup", 14.99);
		myStore.addItem(book1);
		Item mouse = new Item("Computer mouse", 44.99);
		Item pen = new Item("mount bla bla", 120);
		myStore.addItem(mouse);
		myStore.addItem(pen);
		myStore.seelInventory();
		System.out.println(myStore.numOfItems);
		
		
		myStore.sell("Computer mouse");
		myStore.sell("mount bla bla");
		myStore.seelInventory();
		System.out.println(myStore.numOfItems);
		System.out.println(myStore.totalSales);
		
		System.out.println();
		
		myStore.refund(mouse);
		myStore.seelInventory();
		System.out.println(myStore.numOfItems);
		System.out.println(myStore.totalSales);
		
		System.out.println(myStore.storeItems);
			
		
		
	}
}
