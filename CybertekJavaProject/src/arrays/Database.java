package arrays;

import java.util.Arrays;
import java.util.Random;

public class Database {

	public static void main(String[] args) {
		int [] ages = new int[50];
		Random r = new Random();
		
		for(int i=0; i<ages.length; i++) {
			ages[i]=r.nextInt(100);
		}
		System.out.println(Arrays.toString(ages));

}
}