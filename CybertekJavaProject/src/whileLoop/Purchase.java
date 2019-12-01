package whileLoop;

import java.util.Scanner;

public class Purchase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = 1500;
		int transactionAmount;
		// Print "transaction amount is too high" and break the loop
		// if transaction amount is going to put balance to negative.
		
//		PART II
//		When transactionAmount is higher than balance
//		Print "Transaction amount is too high. Try lower price" and 
//		skip the transaction process to the next transaction.
//		Use continue.
		
		// Ask item name from the user per each transaction.
//		if transaction is processed successfully print 
//		 "%itemName purchased successfully"
//		If item name is AK-47 Block the account, print "Illegal item" and break 
//		the loop.
		while(balance > 0) {
			System.out.println("Enter the transaction amount:");
			transactionAmount = input.nextInt();
			input.nextLine();
			System.out.println("Enter Item name:");
			String itemName = input.nextLine();
			if(itemName.equalsIgnoreCase("ak-47")) {
				System.out.println("Illegal Item.");
				break;
			}
			if(transactionAmount > balance) {
				System.out.println("Transaction amount is too high. Try lower price");
				continue;
			}
			balance = balance - transactionAmount;
			System.out.println(itemName + " purchased successfully!");
		}
		if(balance == 0) {
			System.out.println("You're broke");
		}
		
		System.out.println("Your balance: " + balance);
	}

}
