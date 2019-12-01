package multidimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class CreateTwoArrays {
	
	public static void main(String[] args) {
		
		
		
	
	}
	public static int [][] getMultiArray(int size1, int size2){
		int[][] numbers = new int [size1][size2];
		Random r = new Random();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
			numbers[i][j] = r.nextInt(100);
		}
	}
		return numbers;
	}
}

