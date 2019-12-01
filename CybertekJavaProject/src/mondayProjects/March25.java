package mondayProjects;

import java.util.Scanner;

public class March25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// TASK 1
	    System.out.println("Enter number:");
	    int x = input.nextInt();
	    
	    //your code here 
	    //----------------------------------------------------------

		for(int i=1; i<=x; i++ ) {
			if(i%2==0 && i%3==0) {
				System.out.print(i*i +" ");
			}
		}	
		System.out.println();
			//TASK 2
		    System.out.println("Enter word:");
		    String str1 = input.next();
		    
		    //your code here 
		    //---------------------------------------------------------- 
		   
		    
		    int l = str1.length();
		    if(l>=3 && l<100) {
		    	
		    	for(int a = 0; a<l; a++) {
		    		if(str1.charAt(a)>=48 && str1.charAt(a)<=57)  {
		    			System.out.print(str1.charAt(a));
		    		}
		    	}

		    }
		    else {
		    	System.out.println("Invalid enter");
		    }
		    
		    //----------------------------------------------------------
		    
		    //TASK 3
		    //your code here 
		    //----------------------------------------------------------
		    System.out.println();
		    
		   String str2; 
		   int positive=0;
		   int negative=0;
		   int zero=0;
		   
		   
		   do  {
		    	System.out.println("Enter the number: ");
		    	int b = input.nextInt();
		    	if(b<0) {
		    		negative++;
		    	}
		    	else if(b>0) {
		    		positive++;
		    	}
		    	else {
		    		zero++;
		    	}
		    	input.nextLine();
		    	
		    	System.out.println("Do you want to continue y/n?");
		    	str2 = input.nextLine();
		   }
		    while (str2.equalsIgnoreCase("y"));
		   System.out.println("Positive numbers: " + positive);
		   System.out.println("Negative numbers: " + negative);
		   System.out.println("Zero number: " + zero);
		}
	    
	}
	

