package tasks;

import java.util.Random;
import java.util.Scanner;

public class Warmup5 {
	 
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		boolean sent;
		String message;
		boolean delivered;
		boolean read;
		
		System.out.println("Please enter your message to send:");
		message = input.nextLine();
		
		if (message.length()>=15) {
			sent = true;		
		}
		else {
			sent = false;	
		}
		
		System.out.println("Message: " + message);
		System.out.println("Sent: " + sent);
		///////////////////////////////////////////////////////////
//		TASK PART II
//		declare boolean for 'delivered' status
//		generate random number 0-10
//		check generated Numbers. If even then set 'delivered' to true
//		if number is odd set 'delivered status to false'
		
	
		Random random = new Random();
		int i = random.nextInt(10);	
		int x = random.nextInt(10);
		int z = random.nextInt(10);
		
		if (sent==true) {
		if((i)%2==0)  {
			delivered = true;
			
		}
		else {
			delivered = false;
		}
		
		System.out.println("Delivered status: " + delivered);
		
		///////////////////////////////////////////////////////////
		//TASK PART III
		//declare boolean for 'read' status
		//generate random number 0-10
		//check generated Numbers. If even then set 'read' to true
		//if number is odd set 'read status to false'
		
		if(delivered == true) {
			if((z)%2==0)  {
				read = true;
		}
			else {
				read = false;				
			}
			System.out.println("Read status: " + read);
		}
	}
	}	
}