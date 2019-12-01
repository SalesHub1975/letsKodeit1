package methods;

public class GoogleSearch {

	public static void main(String[] args) {
	
	String result = "about 691,000,000 results (0.78 seconds)";
	String count = resultCounts(result);
	System.out.println(count);
	
	String str = "About 841,000,000 results (2.81 seconds)"; 
	String count2 = resultCounts(str);
	System.out.println(count2);
	
	
	}
	public static String resultCounts (String res) {
		int space = res.indexOf(" ");
		int space2 = res.indexOf(" ", space+1);
		String s = res.substring(space+1, space2);
		s = s.replace(",","");
		System.out.println("Count of search::::");
		return s;
	}
}
