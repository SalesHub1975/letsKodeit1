package arraysClass;

import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
		
		int [] numbers = {45,23,6,-3,66};
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == -3) {
				System.out.println(i);
				break;
			}
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		int result = Arrays.binarySearch(numbers, 23);
		System.out.println(result);
		// -(1)-1=-2  --> example for 4			4 is in (1) index position
		// example for 7 --> -(2)-1 = -3		7 should be in 2(index position)
		
	}
}

