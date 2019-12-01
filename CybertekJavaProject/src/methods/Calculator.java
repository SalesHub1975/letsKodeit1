package methods;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println(addMethod(10, 5));
		System.out.println(substractMethod(5, 9));
		System.out.println(multiplyMethod(3, 8));
		System.out.println(divideMethod(56, 8));
		
		
	}
	public static int addMethod(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static int substractMethod(int a, int b) {
		int result = a - b;
		return result;
	}
	
	public static int multiplyMethod(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public static int divideMethod(int a, int b) {
		int result = a / b;
		return result;
}
}
