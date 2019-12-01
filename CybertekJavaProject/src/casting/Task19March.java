package casting;

import java.util.Scanner;

public class Task19March {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = "Published on Feb 12, 2018";
		int indexOfComma = s.indexOf(",");
		String year = s.substring(indexOfComma+2);
//		System.out.println(year);
		int x = Integer.valueOf(year);
//		System.out.println(x);
		
		if(x<=2019) {
			System.out.println("Valid year");
		}
		else {
			System.out.println("Invalid year");
		}
	}
}
