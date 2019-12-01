package tasks;

import java.util.Random;

public class GeneratedNUmbers {

	public static void main(String[] args) {
		
		Random r = new Random();
		int i = r.nextInt(101);
		int counter = 0;
		System.out.println("Target number is: " +i);
		
		for(int j=0; j<101; j++) {
			counter++;
			if(i==j) {
				System.out.println();
				System.out.println("Target number is found!");
				System.out.println("Number of attempts: " + counter);
			break;	
			}
		}
		
	}
}