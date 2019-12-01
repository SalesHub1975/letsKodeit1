package arraysClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Names {

	public static void main(String[] args) throws FileNotFoundException {
		String result = "";
		
		File file = new File("test.txt");
		Scanner sc = new Scanner(file);   
		while(sc.hasNextLine())	{ 
		String name = sc.nextLine().trim();
		if(name.isEmpty()) {
			continue;
		}
		result += name + ",";
		}
		System.out.println(result);
		String [] students = result.split(",");
		System.out.println(Arrays.toString(students));
}
}
