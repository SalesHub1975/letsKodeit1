package tasks;

import java.util.Scanner;

public class Warmup6 {
 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean campusopen;
	
		System.out.println("Please enter the time to check campus hours:");
		int time = input.nextInt();
		
		
		if(time>0 && time<=24) {
		if(time>=8 && time<=24) {
			campusopen = true;
		}
		else{
			campusopen = false;
			}
		System.out.println("Campus open: " + campusopen);
		}
		else {
			System.out.println("Invalid time. Try again");
		}
	}
}
