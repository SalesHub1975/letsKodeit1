package tasks;

import java.util.Scanner;

public class UniqeCharacters {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your data:");
		String data = input.nextLine();
		data=data.toLowerCase().trim();
		data=data.replace(" ","");
		
		//System.out.println(data);		// To check new string 
		
		
		String result="";
		
		for(int i = 0; i<data.length(); i++) {
		char c = data.charAt(i);
		if(result.contains(c+"")) {
            continue;
		}
		result +=c;
		}
            System.out.println(result);
		}
		
	}
	

