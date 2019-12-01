package replit;

import java.util.Arrays;
import java.util.Scanner;

	public class Methods {

		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
			{
			//your code here
			String [] split = info.split(",");
			System.out.println("person name: " + split [0] + " last name: " + split[1] + " age: " + split[2]);
			
			}//end person
		  
		}