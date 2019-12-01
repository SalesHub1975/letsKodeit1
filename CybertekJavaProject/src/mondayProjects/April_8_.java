package mondayProjects;

import java.util.Arrays;
import java.util.Scanner;

public class April_8_ {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line. 
		    
		    int sum = 0;
			int j = 0;
			
		    do {
		    	 System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
		      sum = 0;
		    for(int i = 0; i < inhabitants.length; i++){
		    	if(i == inhabitants.length-1 && inhabitants[i] > 0 &&  inhabitants[i-1] == 0) {
		         	inhabitants[i]/=2;
		         	 }
		         if(i + 1 < inhabitants.length && inhabitants[i + 1] == 0 && inhabitants[i] > 0 && i == 0  ) {
		         	inhabitants[i]/=2;   	
		         }
		    	if(i + 1 < inhabitants.length && i != 0 && inhabitants[i] > 0 && (inhabitants[i-1] == 0 || inhabitants[i+1] == 0)) {
		        	inhabitants[i]/=2;
		        	if(i + 2 <inhabitants.length && inhabitants[i] == 0 && inhabitants[i+1] != 0 && inhabitants[i+2] != 0)
		        	i++;
		        	 }
		       	sum += inhabitants[i];
		     }
		   
		    j++; 
		    }while(sum > 0);
		    
		    System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
		    System.out.println("---- EXTINCT ----");
	}
}