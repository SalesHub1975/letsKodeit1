package switchstatements;

import java.util.Scanner;

public class KnowledgeValidator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String grade;
		
		System.out.println("enter your grade:");
		grade = input.nextLine();
		
		switch (grade) {
		case ("A"):
			System.out.println("Excellent");
			break;
		case ("B"):
			System.out.println("Good");
		break;
		case ("C"):
			System.out.println("Still ok");
		break;
		case ("D"):
			System.out.println("Not good");
		break;
		case ("F"):
			System.out.println("Fail");
		break;
		default:
			System.out.println("Invalid grade");
			
		}
	}
}
