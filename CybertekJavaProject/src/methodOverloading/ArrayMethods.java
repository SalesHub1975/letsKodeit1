package methodOverloading;

public class ArrayMethods {
	
	public static void main(String[] args) {
	
		int [] ages = {12,34,5,6,6,666,8};
		
		
	boolean check = arrayContains(ages, 13);
	System.out.println(check);
		
		
	}
	
	public static boolean arrayContains (int [] arr, int target) {
		for(int i: arr) {
			if(i == target) {
				return true;
			}
		}
		return false;
	}
}

