package CigramSynergy;

import java.util.Scanner;

public class Project3 {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	int numberOfCall;
    double bill=0.0;
    System.out.println("Enter number of calls:");
    numberOfCall = input.nextInt();
    
    // your code here. (DO NOT change existing code)
    //--------------------------------------------
    
    double defaultbill = 200.0;
    if(numberOfCall<=100) {
    	bill = 200;
    }
    if(numberOfCall>100 && numberOfCall<=150){
    	bill = defaultbill + (numberOfCall - 100)*0.6;
    	
    }
   if(numberOfCall>150 && numberOfCall<=200) {
	   bill = defaultbill + (numberOfCall - 150)*0.5 + (150-100)*0.6;
   		
   }
   if(numberOfCall>200) {
	   bill = defaultbill + (numberOfCall - 200)*0.4 + (200-150)*0.5 + (150-100)*0.6;
   }
   System.out.println("Your bill is $"+bill);

  }
}

