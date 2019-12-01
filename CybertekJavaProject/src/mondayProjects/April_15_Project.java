package mondayProjects;

import java.util.Arrays;

public class April_15_Project {
	
	public static void main(String[] args) {
		
		String str1 = "h2c7wtrg72i3e283trgf//h2nc3";
		System.out.println(Arrays.toString(extractNum(str1)));
	
		System.out.println(isAnagram("ijklin", "ilkin"));
		int [] nums = {-3,-6,-34,-1};
		
		System.out.println(secondLargestNum(nums));
		
		
		
		
	}
	//-----------------------------------------------------------
	public static int [] extractNum(String str) {
		String s = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				s += str.charAt(i) + ",";
			}
		}
		s = s.substring(0,s.length()-1);
		//System.out.println(s);
		
		String[] nums = s.split(",");
		int [] result = new int[nums.length];
		
		for(int j = 0; j < result.length; j++) {
			result [j] = Integer.valueOf(nums[j]);
		}
		return result;
}
	
	
	
	//-------------------------------------------------------------
	
	
	public static boolean isAnagram(String word1,String word2) {
		
		word1 = word1.toLowerCase().trim().replace(" ", "");
		word2 = word2.toLowerCase().trim().replace(" ", "");
		
		String [] arr1 = word1.split("");
		String [] arr2 = word2.split("");
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].equals(arr2[i])) {
				continue;
			}
			return false;
		}
		return true;
	}
	
	
	//----------------------------------------------------------------------------
	
	
	public static int secondLargestNum(int[] arr) {
		
		int counter = 0;
		int secondMax = 0;
		
		for(int i = 0; i < arr.length; i++) {					
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					counter++;
				}
				}
			if(counter == 1) {
				secondMax = arr[i];
				break;
			}
			counter = 0;
		}
		return secondMax;
	}
	//-------------------------------------------------------------------------
	
	
}

