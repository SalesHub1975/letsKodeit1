package loops;

import java.util.Scanner;

public class LoginToApp {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		int attempts = 0;
		
		for (;;) {
			System.out.println("Enter password:");
			String n = input.nextLine();
			attempts++;
			if(n.equals("secret478")) {
				System.out.println("Welcome to your profile");
				break;
			}
			if(attempts==3) {
				System.out.println("Sorry. Your account is locked. Try again after 5 hours");
				break;
			}
			}
			
		}
	}
	

