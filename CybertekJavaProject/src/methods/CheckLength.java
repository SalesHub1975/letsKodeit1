package methods;

public class CheckLength {

	public static void main(String[] args) {
		String name  = "Lawrence";
	
		checkLength(name, 5);
		
	}
	public static void checkLength(String word, int number) {
		if(word.length() == number) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
	}
}
