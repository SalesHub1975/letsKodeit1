package methodOverloading;

import java.util.Arrays;

public class myClass {
	
	public static void main(String[] args) {
		int [] ages = {23,34,45,56,18};
		System.out.println(arrayContains(ages, 21));
		String [] words = {"hi", "five", "ten", "bye"};
		String [] newWords = addElement(words, "Toyota");
		System.out.println(Arrays.toString(newWords));
	}
	
	public static String [] addElement(String [] arr, String word) {
		String [] newArr = new String[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1] = word;
		return newArr;
	}
	
	public static boolean arrayContains(int [] arr, int target) {
		for(int i: arr) {
			if(i == target) {
				return true;
			}
		}
		return false;
	}

}




