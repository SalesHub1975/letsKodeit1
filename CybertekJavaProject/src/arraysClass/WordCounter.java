package arraysClass;

import java.util.Arrays;

public class WordCounter {
	
	public static void main(String[] args) {
		
		String s = "Write a program that creates a group of given size";
		
		String [] result = s.split(" ");
		int counter =0;
		
		for(String result2: result) {
			if(result2.equalsIgnoreCase("program")) {
				counter++;
			}
		}
		System.out.println("Number of program is: " + counter);
	}

}
