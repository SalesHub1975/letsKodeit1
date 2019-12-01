package foreachloop;

import java.util.Arrays;

public class NoNegativity {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,-3,4,-34,55,78,90,33,10};
		
		int ii = 0;
		for(int nums: numbers) {
			if(nums < 0) {
				numbers [ii] = 0;
			}
			ii++;
		}
			System.out.print(Arrays.toString(numbers));
		}
		
	}
