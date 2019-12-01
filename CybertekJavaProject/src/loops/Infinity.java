package loops;

import java.util.Scanner;

public class Infinity {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for( ; ;) {
			System.out.println("enter message:");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase("hi")) {
				System.out.println("hello");
			} else if(answer.equals("exit")) {
				break;
			}
			else {
				System.out.println("good bye");
			}
		}
		}
}
