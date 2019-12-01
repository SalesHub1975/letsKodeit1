package whileLoop;

import java.util.Scanner;

public class LoginWhile {

	public static void main(String[] args) {
		
		int counter = 0;
		
		while(5>4) {
			System.out.println("Hi there - " + counter);
		
				if(counter == 4) {
				break;
				}
				else if(counter==2) {
				continue;
			}
			counter++;
			
		}
	}
}
