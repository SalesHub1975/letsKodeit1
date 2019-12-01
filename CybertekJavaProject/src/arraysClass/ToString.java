package arraysClass;

public class ToString {
	
	public static void main(String[] args) {
		
		int [] numbers = {23,23,34,56,342,2};
		String result = "[";
		
		for(int i = 0; i < numbers.length; i++) {
			if(i == numbers.length-1) {
				result += numbers[i] + "]";
			}else {
				result += numbers[i] + ", ";
		}
	}
		System.out.print(result);
	}
}
