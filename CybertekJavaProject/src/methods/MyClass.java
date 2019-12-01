package methods;

public class MyClass {
	
	public static void main(String[] args) {
		
	int [] nums = {1,2,3,4,5,6};	
	
	int count = evenNum(nums);
	System.out.println(count);
		
		
	}
	public static int evenNum (int [] arr) {
		int counter = 0;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] % 2 == 0) {
			counter++;
		}
		}
		return counter;
	}
}
