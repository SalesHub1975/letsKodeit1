package mondayProjects;

import java.util.Arrays;
import java.util.Scanner;

public class April_8 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);	
	
	 int[] inhabitants = new int [8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    
	    // 1. Do While Loop;
	    // 2. for loop inside doWhile;
	    // 3. Each iteration divide each element by 2
	    // 4. Print the result after every iteration
	    // 5. Do it until every element will be 0;
	    
	    int day = 1;
	    int total = 0;
	    
	    System.out.print("Day " + day + "0");
	    System.out.println(Arrays.toString(inhabitants));
	  do {
		  total = 0;
	    for(int j = 0; j < inhabitants.length; j++) {
	    	inhabitants[j] = inhabitants[j]/2;
	    	total += inhabitants[j];
	    }
		System.out.print("Day " + day + " ");
	    System.out.println(Arrays.toString(inhabitants));
	    day++;
	  }
	  while(total > 0);	    
	  }  
	 }
	

