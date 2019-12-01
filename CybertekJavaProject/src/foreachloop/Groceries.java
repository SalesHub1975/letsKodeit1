package foreachloop;

import java.util.Arrays;

public class Groceries {

	public static void main(String[] args) {
		
		String [] groceries = {"Bread", "Cucumber", "Apples", "oranges", "cookies", "Cake"};
		
		
		int counter = 0;
		for(String item: groceries) { 
			char c = item.charAt(0);
			int check = c;
			if(c>=65 && c<=90) {
				counter++;	
			}
		}
		System.out.println("Total words starting with upper case: " + counter);
		
//		for(int i = 0; i < groceries.length; i++) {
//			char c = groceries[i].charAt(0);
//			int check = c;
//			if(c>=65 && c<=90) {
//				System.out.println(groceries[i]);
//			}
//			
//		}
		
		
	}
}
