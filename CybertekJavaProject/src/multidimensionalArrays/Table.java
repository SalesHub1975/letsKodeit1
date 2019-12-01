package multidimensionalArrays;

import java.util.Random;

public class Table {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		int [][] numbers = new int [4][5];
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = r.nextInt(100);
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
