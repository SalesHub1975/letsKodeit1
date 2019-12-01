package tasks;

import java.util.Random;
import java.util.Scanner;

public class Warmup4_1 {

	public static void main(String[] args) {
		
		
			Scanner input =new Scanner(System.in);
			Random random = new Random();
			boolean found = false;
			
			//shortcut for importing the classes command+shift+0
			
			int secretNumber = random.nextInt(10);
			System.out.println("Please enter your guess between 0-10");
			int enteredNumber = input.nextInt() ;
			
			if(enteredNumber>secretNumber) {
				
				System.out.println("your guess is too high");
			}
			else if(enteredNumber<secretNumber) {
				System.out.println("Your guess is too low!");
		}
		   else {
			   System.out.println("Congratulaytions! You got it!");
			   found = true;
		   }
			
		   //System.out.println("Secret number was:" + secretNumber);
			
		   System.out.println("Found: " + found);
		   
		   if(found==false) {
			   System.out.println("This is your last chance. Please guess the number:");
			   int secondGuess = input.nextInt();
			  
			   if(secondGuess == secretNumber) {
				   System.out.println("Congratulations!");
			   }
			   else {
				   System.out.println("YOU LOST!!!");
			   }
			   System.out.println("Secret number was:" + secretNumber);
		   }
		}
		
	}
	

