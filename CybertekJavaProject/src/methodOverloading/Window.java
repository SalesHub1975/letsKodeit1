package methodOverloading;

public class Window {
	
	public static void main(String[] args) {
		
	printArray(23,54,66,54,43);	
		
	}
	public static void printArray(int ... nums) {
		for(int i: nums) {
			System.out.println(i);
		}
	}
}
