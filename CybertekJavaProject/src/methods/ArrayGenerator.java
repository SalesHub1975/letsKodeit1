package methods;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
	
	// Create a method that takes integer(size), Integer(bound) and returns array of Integers.
	// Method idea: method should create list of integers and assign random numbers between zero to given bound.
	// Size of array should be given size
	
	public static void main(String[] args) {
		
	
		//System.out.println(Arrays.toString(getArray(10, 30)));
		// OR
		
		int [] numbers = getArray(10, 30);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(evenCounter(numbers));
		
		
	}	
	public static int evenCounter(int [] arr) {
		int count = 0;
		for(int i: arr) {
			if(i % 2 == 0) {
				count++;
			}
		}
		System.out.println("Even number count is: ");
		return count;
		
// ------------------------------------------------------------------		
		
	}
	public static int [] getArray (int size, int bound) {
		int [] nums = new int [size];
		Random r = new Random(); 
		for(int i = 0; i < size; i++) {
			nums [i] = r.nextInt(bound);
		}
		return nums; 
	}	
}
