package mondayProjects;

import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class Project4 {

	 public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);  
		    
		 // TASK 1
		    System.out.println("Enter number in word(ex: one, two..):");
		    String str1 = input.nextLine();
		    
		    //your code here 
		    //----------------------------------------------------------
		    str1=str1.toLowerCase();
				    
				    switch (str1) {
				    case "one":
				    	System.out.println("1");
				    	break;
				    case "two":
				    	System.out.println("2");
				    	break;
				    case "three":
				    	System.out.println("3");
				    	break;
				    case "four":
				    	System.out.println("4");
				    	break;
				    case "five":
				    	System.out.println("5");
				    	break;
				    case "six":
				    	System.out.println("6");
				    	break;
				    case "seven":
				    	System.out.println("7");
				    	break;
				    case "eight":
				    	System.out.println("8");
				    	break;
				    case "nine":
				    	System.out.println("9");
				    	break;
				    case "ten":
				    	System.out.println("10");
				    	break;
				    	
				    	default:
				    		System.out.println("Out of bound");	
				    }

		    //----------------------------------------------------------
		    
		    //TASK 2
		    System.out.println("Enter word:");
		    String str2 = input.nextLine();
		    
		    //your code here 
		    //---------------------------------------------------------- 
		    
		  str2=str2.trim().toLowerCase();
				    int i = str2.length();
				
				    	int indexOfMiddleEven1 = i/2;
				    	int indexOfMiddleEven2 = i/2-1;
				    	int indexOfMiddleOdd = i/2+1;
				    	
				    	String evenFirstPart = str2.substring(0, indexOfMiddleEven2);
					    String evenSecondPart = str2.substring(indexOfMiddleOdd);
				   	    String oddFirstPart = str2.substring(0,indexOfMiddleEven1);
					    String oddSecondPart = str2.substring(indexOfMiddleOdd);
				    
				   if(i>3 && i<100) { 
					   if(i%2==0) { 	
					   String a = str2.substring(indexOfMiddleEven2, indexOfMiddleOdd).toUpperCase();
					   String evenWord = evenFirstPart.concat(a).concat(evenSecondPart);
					   System.out.println(evenWord);	   
				   }else {
					   String b = str2.substring(indexOfMiddleEven1,indexOfMiddleOdd).toUpperCase();
					   String oddWord = oddFirstPart.concat(b).concat(oddSecondPart);
					   System.out.println(oddWord);
				    }
				   }
					   else {
						   System.out.println("Invalid enter");
					   }
				    
		    
		    
		    
		    //----------------------------------------------------------
		    
		    //TASK 3
		    
		    System.out.println("Enter two words(separate with space):");
		    String str3 = input.nextLine();
		    
		    //your code here 
		    //----------------------------------------------------------
		    
		    str3 = str3.trim();
					    
					    int indexSpace = str3.indexOf(" ");
					    
					    String first = str3.substring(0, indexSpace);
					    String second = str3.substring(indexSpace+1);
					    int sum = first.length()+second.length();

					  
					    String firstUpper = first.substring(0, 1).toUpperCase();
					    String secondUpper = second.substring(0,1).toUpperCase();

			    
					    String firstPart = first.substring(1, indexSpace);
					    String secondPart = second.substring(1);
					   

					    
					    String newFirst = firstUpper.concat(firstPart);
					    String newSecond = secondUpper.concat(secondPart);

					    
					    System.out.println(sum);
					    System.out.println(newFirst + " " + newSecond);
					    
					  
					    
					    
		}

		}