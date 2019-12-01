package CigramSynergy;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int price=0;
	    int quarter=0;
	    int dime = 0;
		int nickle=0;
	  
	    System.out.println("Enter price in cents:");
	    price = input.nextInt();
		    
		    
		    // your code here. (DO NOT change existing code)
		    //----------------------------------------------
	    
	   
	    
	    int remquarter;
	    int remdime;
	    int change;
	    change = 100 - price;
	    quarter = change/25;
	    remquarter = change%25; 
	    dime = remquarter/10;
	    remdime = remquarter%10;
	    nickle = remdime/5;
	    

		    //----------------------------------------------
	   
	    if(price >=25 && price<=100) {
	     System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickels.");
	}
	    else {
	    	System.out.println("Invalid input");
	    }
	    }
}