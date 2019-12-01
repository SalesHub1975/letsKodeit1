package methods;

public class TimeResult {
	
	public static void main(String[] args) {
		
		String result = "about 691,000,000 results (0.78 seconds)";
		
		String seconds = createSeconds(result);
		System.out.println(seconds);
		
		
	}
	
	public static String createSeconds(String res) {
		int first = res.indexOf("(");
		int second = res.indexOf(")");
		String s = res.substring(first + 1, second);
		return s;
	}
	
	
}
