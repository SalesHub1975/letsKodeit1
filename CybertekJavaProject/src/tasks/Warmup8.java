package tasks;

import java.util.Scanner;

public class Warmup8 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		String name1;
		String name2;
		String lastName;
		boolean check;
		
		System.out.println("Please enter name1:");
		name1 = input.nextLine().toLowerCase().trim();
		System.out.println("Please enter name2:");
		name2 = input.nextLine().toLowerCase().trim();
		
		int i = name1.indexOf(" ");
		//System.out.println(i);
		lastName=name1.substring(i).trim();
		//System.out.println(lastName);
		
		if(name2.contains(lastName)) {
			check=true;
		}
		else {
			check=false;
		}
		System.out.println("Relative: " + check);
	
}
}
