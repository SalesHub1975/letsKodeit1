package ramis;

import java.util.Scanner;

public class CurrencyExchange {

	
	public static void main(String[] args) {
		
		String 	countryCurrencyname;
		double 	usdollarvalue;
		int 	usdamount; 
		double 	countryCurrencyAmount;
		
		
		System.out.println("\tWelcome to our Currency Exchange!\n");
		System.out.println("You can here exchange your US dollars to your country currency.");
		System.out.println("Please enter your contry currency. For example: RUB, KZT, EUR, KGS:");
		Scanner input = new Scanner (System.in);
		countryCurrencyname = input.nextLine();
		System.out.println("Please enter the 1 US dollar value in " + countryCurrencyname + " currency: ");
		usdollarvalue = input.nextDouble();
		System.out.println("Great! Now we can start exchange" );
		System.out.println("Please enter amount of USD you want to exchange:");
		usdamount = input.nextInt();
		countryCurrencyAmount = usdamount * usdollarvalue;
		System.out.println("The converted amount of " + usdamount + " dollars will be " + countryCurrencyAmount + " " + countryCurrencyname);
		
		
		
		
		
	
		
	
	}
}
