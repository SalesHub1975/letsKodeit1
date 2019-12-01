package multidimensionalArrays;

import java.util.Arrays;

public class Student {

	public static void main(String[] args) {
		String [][] groups = new String [3][];
		
		// 	TASK
		//	Create 3 String arrays - 3 group;
		//	1st array size of 2, 2nd array size of 5; 3rd array size of 4;
		//	Give names for all elements;
		
		
		String [] team3 = {"Adam", "James"};
		String [] team2 = {"Benzema", "Bale", "Modric", "Kaylor", "Marcelo"};
		String [] team1 = {"Messi", "Alba", "Suarez", "Dembele"};
		groups[0] = team1;
		groups[1] = team2;
		groups[2] = team3;
		
		// System.out.println(groups[0][3]);
		// System.out.println(groups[2][0]);
		
		// Print all teams using Arrays toString methods
		
//		System.out.println(Arrays.toString(groups[0]));
//		System.out.println(Arrays.toString(groups[1]));
//		System.out.println(Arrays.toString(groups[2]));
		
		// Print each teams members using Arrays toString and using loop
		
		for(int i = 0; i < groups.length; i++) {
			System.out.println((groups[i].length));
		}
		
		
		for(int i = 0; i < groups.length; i++) {
			for(int j = 0; j < groups[i].length; j++) {
				System.out.print(groups[i][j] + " ");
			}
			System.out.println();
		}
		
	
		int age1 = 45;
		int age2 = 23;
		int [] ages = new int [2];
		ages[0] = age1;
		ages[1] = age2; 
		

	}
}
