package methodOverloading;

import java.util.Arrays;

public class StringToIndexPosition {

	public static void main(String[] args) {
	
		String [] str = {"Firmino", "Salah", "Mane", "Van Dijk", "Robertson"};
		String newPlayer = "Coutihno";
		int replace  = 0;
		
		System.out.println(Arrays.toString(addElement(str, newPlayer, replace)));
		
		
	}
	public static String [] addElement (String[ ] arr, String word, int  index) { //we want to copy everything from arr to word (not index)
		String [] newArr=new String [arr.length+1];
		int in=0;
		for(int i=0; i<newArr.length; i++) {
		if(i==index) {
			newArr[i]=word;
		} else {
			newArr[i]= arr[in];     //copy
			in++;
		}
		}
		return newArr;
	}
}
