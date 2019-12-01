package ramis;

import java.util.Scanner;

public class Ifs {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = input.nextLine();
		


		    //your code here
		 	String rTM1 = "project";
		    String rTM2 = "alejandro project";
		   
		   if(a.equals(rTM1) || a.equals(rTM2)) {
		    System.out.println("read this mail");
		   }
		   
		    else {
		    System.out.println("dont read");
		    }
		      
		    
		  }
		}