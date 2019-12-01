package ramis;

import java.util.Arrays;

public class ArmstomgNums {

	public static void main(String[] args) {


		System.out.println(3125+1024+16807+1024+32768);

		int size = 100000;

		for (int i = 10; i < size; i++) {
			String s = i + "";
			String[] str = s.split("");
			int result = 0;
			for (int j = 0; j < str.length; j++) {
				int a = Integer.valueOf(str[j]);
				int temp = (int) Math.pow(a, str.length);
				result += temp;

			}

			if (i == result) {
				System.out.println(i);
			}	
		}

	}
}
