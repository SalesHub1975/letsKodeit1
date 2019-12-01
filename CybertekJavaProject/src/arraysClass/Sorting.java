package arraysClass;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int ages [] = {34,23,6,24,78,89,55};
		System.out.println(Arrays.toString(ages));
		Arrays.sort(ages);
		System.out.println(Arrays.toString(ages));
	}
}


//do {
//	  total = 0;
//  for(int j = 0; j < inhabitants.length; j++) {
//
//  	if(inhabitants[j] == 0) {
//  		if ((j-1) < 0) {
//  	inhabitants[j+1] = inhabitants[j+1] / 2;
//  		if ((j + 1) == 8) {
//  	inhabitants[j-1] = inhabitants[j-1] / 2;
//  		}
//  		
//  		}else {
//  			inhabitants[j-1] = inhabitants[j-1] / 2;
//  			inhabitants[j+1] = inhabitants[j+1] / 2;		    		
//  	}
//  	total += inhabitants[j];
//  }
//	System.out.print("Day " + day + " ");
//  System.out.println(Arrays.toString(inhabitants));
//  day++;
//}
//}
//while(total > 0);	    
//  
//  
//}
//}
