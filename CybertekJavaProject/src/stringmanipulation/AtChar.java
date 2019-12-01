package stringmanipulation;

import java.util.Scanner;

public class AtChar {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter name:");
	String name = input.nextLine();
	name=name.toLowerCase();
	System.out.println("Name: " + name);
	name=name.trim();
	
	if(name.isEmpty()) {
		System.out.println("Invalid name");
	} else {
			
	char first=name.charAt(0);
	int l =name.length();
	char last=name.charAt(l-1);
	if(first=='a' && last == 'z') {
	System.out.println("Cool");
} else {
	System.out.println("Not very cool");
}
}
} 
}



