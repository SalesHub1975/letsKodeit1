package methodOverloading;

public class Keys {
	
	public static void main(String[] args) {
	
	calculate((short)45);		// to make it short over to int
		
		
	}
	
	public static void calculate(short s) {
		System.out.println("Short is calculated " + s);
	}
	
	public static void calculate(int i) {
		System.out.println("Int is calculated " + i);
	}
}
