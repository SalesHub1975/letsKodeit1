package methods;

public class MyCollection {
	
	public static void main(String[] args) {
		int [] nums = {23, 53, 2, -4, 23, -45, -785, 1};
		
		printNegativeNums(nums);
		
	}
	public static void printNegativeNums(int [] numbers) {
		for(int num: numbers) {
			if(num < 0) {
				System.out.println(num);
			}
		}
	}
	
}
