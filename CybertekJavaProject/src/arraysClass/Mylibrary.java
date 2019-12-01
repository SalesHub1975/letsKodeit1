package arraysClass;

import java.util.Arrays;
import java.util.Scanner;

public class Mylibrary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] myBooks = {"Java", "Java Script", "Python", "C++", "Ruby"};
		
		System.out.println("Please enter the book to replace");
		String oldBook = input.nextLine();
		System.out.println("Please enter the new book");
		String newBook = input.nextLine();
		
		Arrays.sort(myBooks);
		System.out.println(Arrays.toString(myBooks));
		int result = Arrays.binarySearch(myBooks, oldBook);
		System.out.println(result);
		if(result >= 0) {
			 myBooks [result] = newBook;	
		}
		
		Arrays.sort(myBooks);
		System.out.println(Arrays.toString(myBooks));
	}
}
