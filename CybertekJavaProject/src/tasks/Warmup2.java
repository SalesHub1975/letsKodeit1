package tasks;

import java.util.Scanner;

public class Warmup2 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		 System.out.println("Please enter two double values:");
		    double num1 = input.nextDouble();
		    double num2 = input.nextDouble();
		    double result = 0;
		    
		    
		    System.out.println("Please choose operator from below options:\n+,-,*,/");
		    String operator = input.next();
		    
		    boolean invalidOperator = false;
		    
///// OR	 if(!operator.equals("*") && !operator.equals("/") && !operator.equals("+")&& !operator.equals("-")) {
////////    System.out.println("Invalid operator");
		    	
		    	
/////		    }
////		    else {
		    
		    switch (operator) {
		    case "*":
		    	result = num1*num2;
		    	break;
		    case "/":
		    	result = num1/num2;
		    	break;
		    case "+":
		    	result = num1+num2;
		    	break;
		    case "-":
		    	result = num1-num2;
		    	break;
		    default:
		    	System.out.println("Invalid operator, Please try again!");
		    	
////////////somehow give a flag about the invalid operator   	
		   
		    	invalidOperator = true;	
		    }
		    if(invalidOperator == false) {
		    System.out.println("Result of " + num1 + " " + operator + " " + num2 + " is " + result);
	       
		    }
		
	}
}

