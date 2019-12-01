package tasks;

import java.util.Random;

public class SixDigitUniquqNumber {

	public static void main(String[] args) {
		
		Random r = new Random();
		String result="";
		
		for(int i=0; i<6; i++) {
			int ii = r.nextInt(10);
			while(result.contains(ii+"")) {
				ii = r.nextInt(10);
		}
			result = result+ii;
}
		System.out.println(result);
}
}	