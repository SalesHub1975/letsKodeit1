package constructors;

import java.util.Scanner;

public class SoundSystem {
	
	public static void main(String[] args) {
		
	//	Speaker s1 = new Speaker("Custom PX9500");
	//	Speaker s2 = new Speaker("Custom BR", 2011);
	
		Phone p1 = new Phone("Iphone X", "Gold");
		p1.text(1232234123, "hi");
		
		p1.call(7737493377L);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter model of phone:");
		String m = input.nextLine();
		System.out.println("Please enter color of phone:");
		String c = input.nextLine();
		Phone p2 = new Phone(m, c);
	
		System.out.println("Enter phone number to call:");
		long pn = input.nextLong();
		
		p1.call(pn);
		
		
		
		
	}
 
}
