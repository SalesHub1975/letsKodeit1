package replit;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		 System.out.println("Please enter:");
		    Scanner scanner = new Scanner(System.in);
		    String n = scanner.next();
		    
		    // Your code here
		    //------------------------------------------------
		    boolean checklength;
		    boolean aInTheString;
		    
		    if(n.length()>=7 && n.length()<=10)  {
		      checklength = true;
		    }
		    else {
		      checklength = false;
		    }
		    
		    if(n.contains("a")) {
		      aInTheString = true;
		    }
		    else {
		      aInTheString=false;
		    }
		   
		   if(n.length()<5 && aInTheString==true) {
		     System.out.println("A Perfect");
		   } else if(checklength==true && aInTheString==true && n.contains("b")) {
		     System.out.println("B Perfect");
		   }else if(checklength==false && aInTheString==true) {
		         System.out.println("");
		   }else if(checklength==false && aInTheString==false) {
		       System.out.println("Perfect"); 
		       }
		   
		   else {
		     System.out.println("Sorry");
		   }
		   }
		  
	}
		
	

