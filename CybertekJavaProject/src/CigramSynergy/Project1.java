package CigramSynergy;

import java.util.Scanner;

import javax.xml.namespace.QName;

public class Project1 {
	 
	
	
	
	public static void main(String[] args) {
	
	// Task 1
   
	int unitPrice;
    int quantity;
    double grandTotal=0.0;
    int discount=0;
    double discountApplied=0.0;
    double total=0.0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter unit price:");
    unitPrice = input.nextInt();
    
    System.out.println("Enter quantity:");
    quantity = input.nextInt();
    
    // your code here. (DO NOT change existing code)
    //----------------------------------------------
    grandTotal =  unitPrice*quantity;
//    discountApplied = grandTotal/100*discount;
//    total = grandTotal - discountApplied;
 
    if(quantity>=100 && quantity<=120){
        discount=10;
    }
     
    else if(quantity>120) {
    	discount=15;
    	
    }
        	
    else {
    	discount=0;
    	
    }
    discountApplied = grandTotal/100*discount;
    total = grandTotal - discountApplied;
    
    	 System.out.println("Grand Total: $ "+grandTotal);
         System.out.println("Discount: % "+discount);
         System.out.println("Discount applied: $ "+discountApplied);
         System.out.println("Total: $ : "+total);
    
	

    }
}