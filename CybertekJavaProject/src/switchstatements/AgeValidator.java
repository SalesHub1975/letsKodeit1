package switchstatements;

import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter age:");
		int age = input.nextInt(); 
		
		
		//switch(age) {
		//case (16):
			//System.out.println("almost done with high school");
		//break;
		//case (24):
			//System.out.println("almost done with university");
		//break;
		//default:
			//System.out.println("keep living");
			
			if(age>0 && age<=120) {
			 switch (age) {
			 case 16:	
				 System.out.println("almost done with high school");
				 System.out.println("patient");
				 break;
			 
			 case 24:
			 case 25:
				 System.out.println("almost done with university");
				 break;	 
				 
				 default:
					 System.out.println("keep living");
				}
			}
				else {
					System.out.println("invalid age");
				}
			}
	}

		
		
		

