package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Groups {
	
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the size of groups");
		int sizeOfGroup = input.nextInt();
		input.nextLine();
		String [][] groups  = new String [sizeOfGroup][];
		
		

		
		
		for(int i = 0; i < groups.length; i++) {
			System.out.println("Please enter number of students for group " + (i+1) + ":");
			int memberNum = input.nextInt();
			input.nextLine();
			String [] group = new String [memberNum];
			for(int j = 0; j < group.length; j++) {
				System.out.println("Please enter student name " + (j+1) + ":");
				group[j] = input.nextLine();
			}
			groups[i] = group;
		}
		
		System.out.println(Arrays.deepToString(groups));
	
	}
}
