package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array1000 {

	public static void main(String[] args) {
		
//		Create String array size of 4;
//		Store 4 names in that Array.class Give a proper name for
//		your array variable. Make sure to assign value for every single index. 
//		Print out second and third names on separate lines
		
		String [] names = new String [4];
		names[0] = "James";
		names[1] = "Adam";
		names[2] = "John";
		names[3] = "Will";
		//System.out.println(Arrays.toString(names));
		System.out.println(names[1]+", " +names[2] + ", "+names[3]);
		
	}
	
}
