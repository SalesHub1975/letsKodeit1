package methodOverloading;

public class MaxValue {
	
	public static void main(String[] args) {
		
		int [] arr = {1,22,123,4,5,6,7,8,11,2};
		
		printMaxValue(arr);
		
	}
	public static void printMaxValue(int ... nums) {
		int max = nums[0];
		for(int i: nums) {
			if(i > max) {
				max = i;
			}
		}
		System.out.println("Maximum value is: " + max);
	}
	
}
