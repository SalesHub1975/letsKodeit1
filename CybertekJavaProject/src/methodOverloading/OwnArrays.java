package methodOverloading;

import java.util.Arrays;

public class OwnArrays {
	
	public static void main(String[] args) {
		String [] colors = {"Red", "Blue", "White", "Yellow", "Yellow"};
		int [] n = {1,2,3,4,5,6,7,11};
		
		System.out.println(Arrays.toString(colors));
		System.out.println(Arrays.toString(n));
		
		
		
	}
	public static String toString(String [] words) {
		String result = "[";
		for(int i = 0; i < words.length; i++) {
			if(i == words.length-1) {
				result += words[i] + "]";
			}else {
				result += words[i] + ", ";
			}
		}
		return result;
	}
		
	
	public static String toString(int [] nums) {
		String result = "[";
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length-1) {
				result += nums[i] + "]";
			}else {
				result += nums[i] + ", ";
			}
		}
		return result;
}
}
