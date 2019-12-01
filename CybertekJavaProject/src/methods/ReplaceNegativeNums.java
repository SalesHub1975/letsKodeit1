package methods;

import java.util.Arrays;

public class ReplaceNegativeNums {
	
	public static void main(String[] args) {
	
	int [] arr = {23, 23, -4, -5, 11};
	
	System.out.println(Arrays.toString(arr));
	replaceNegativeNums(arr, 100);

	}
	
	public static void replaceNegativeNums(int [] number, int replaceValue) {
		for(int i = 0; i < number.length; i++) {
			if(number[i] < 0) {
				number[i] = replaceValue;
			}
		}
			System.out.println(Arrays.toString(number));
		}
	}
	
