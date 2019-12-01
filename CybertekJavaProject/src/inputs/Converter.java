package inputs;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
	
		int seconds;	
		int minutes;
		int remainsec;
		int remainmin;
		int hours;
		int days;
		int weeks;
		int remainhours;
		int remaindays;
		int remainweeks;
		int year;
		int remainyear;
		
		System.out.println("\tWelcome to time calculator\n");
		
		System.out.println("Please enter total seconds:");
		
		Scanner input = new Scanner (System.in);
		
		seconds 	= input.nextInt();
		
		minutes 	= seconds/60;
		hours 		= minutes/60;
		days		= hours/24;
		weeks		= days/7;
		year 		= weeks/52;
		
		remainsec 	= seconds%60;
		remainmin 	= minutes%60;
		remainhours = hours%24;
		remaindays  = days%7;
		remainweeks = weeks%52;
		remainyear 	= year%100; 
		
		
	
		System.out.println(seconds + " converted into: ");
		System.out.println(year + " years");
		System.out.println(remainweeks + " weeks");
		System.out.println(remaindays + " days");
		System.out.println(remainhours + " hours");
		System.out.println(remainmin + " minutes");
		System.out.println(remainsec + " seconds");
	
	}
	
}
