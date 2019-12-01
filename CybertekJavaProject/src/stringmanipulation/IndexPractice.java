package stringmanipulation;

import java.util.Scanner;

public class IndexPractice {

	public static void main(String[] args) {
//		String breed = "Huskeys";
//		int i = breed.indexOf('s');    //////////int i = breed.indexOf('s', 3); --> starts searching for 's' after 3rd index (6)
//		System.out.println(i);
		
//		Write a program that detects bad words
//		heck, silly, idiot
//		Ask from user to enter the message to send
//		Check if message contains above bad words
//		If message contains any of those words print "Message failed"
//		Otherwise print "Message sent"
//		NOTE: You must use indexof method
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter message:");
		String message = input.nextLine().toLowerCase().trim();
		
		int first = message.indexOf(" heck");
		int second = message.indexOf("silly");
		int third = message.indexOf("idiot");
		
		System.out.println(first +", " + second + ", " + third);
		
		if(first == -1 && second == -1 && third == -1) {
			System.out.println("Message sent");
		}
		else {
			System.out.println("Message failed");
		}
		
//		System.out.println(first);
//		System.out.println(second);
//		System.out.println(third);
//		
		
	}
}
