package mondayProjects;

import java.util.Arrays;
import java.util.Scanner;

public class April_1 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		    String str = input.nextLine().toLowerCase().trim();
		    int l = str.length();
		    String reversed = "";
		  
		    for(int i=l-1; i>=0; i--) {
		    reversed+=str.charAt(i);
		    }
		    if(str.equalsIgnoreCase(reversed)) {
		      System.out.println("Palindrome");
		    }else{
		      System.out.println("Not Palindrome");
		    }		    
		  }
		}