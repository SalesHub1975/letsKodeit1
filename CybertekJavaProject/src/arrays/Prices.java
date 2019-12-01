package arrays;

import java.util.Arrays;

public class Prices {

	public static void main(String[] args) {
		
		// Declare and initialize double array for prices
	    // Store following prices
	    // 45.99, 23.5, 11.50, 33.33, 99.99
	    // Then change the last element to 112.89
	    // Print all values using Arrays.toString
		
		double[] prices = {45.99, 23.5, 11.50, 33.33, 99.99};
		prices[4]=112.89;
		System.out.println(Arrays.toString(prices));
	}
}
