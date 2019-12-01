package multidimensionalArrays;

import java.util.Arrays;

public class BiggestIntElement {

	public static void main(String[] args) {

		int[][] nums = { { 1, 200000, 3, 4, 5 }, { 23, 34, 453, 12 }, { 12, 12, 1000, 12, 34, 4 } };
		// printMax(nums);

		highestSum(nums);

	}

	// ---------------------------------------------------------------------
	public static void printMax(int[][] arr) {
		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);

	}
	// -----------------------------------------------------------------------

	public static void highestSum(int[][] nums) {
		int maxSum = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 0; i < nums.length; i++) {
			int sum = 0;
			for(int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
			}
			if(sum > maxSum) {
				maxSum = sum;
				index = i;
			}
		}
		System.out.println(Arrays.toString(nums[index]));
	}
}
