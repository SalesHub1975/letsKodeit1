package presentation;

import java.util.Random;

public class Warmup3 {

	public static void main(String[] args) {
	
//	Scanner -> a class that comes from Java library
//	Random 	-> a calss that comes from Java and helps us to generate some random number.		
	
		Random random = new Random();
		int i = random.nextInt(10);					//  bond --> limit number from 0 to 10 (10 is not included)
		
		System.out.println(i);
		if((i)%2==1)  {
			System.out.println("Number is odd");
			}
		else {
			System.out.println("Number is even");
		}
		
	}
	
}
