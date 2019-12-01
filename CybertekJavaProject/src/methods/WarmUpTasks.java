package methods;

public class WarmUpTasks {

	public static void main(String[] args) {
		
		printOdd50();
		welcome("James");
		welcome("Adam");
		printOdd(10);
		
		
	}
	public static void printOdd50() {
		for(int i = 1; i <= 50; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void welcome(String name) {
		System.out.println("Welcome, " + name + "!!!");
	}
	
	
	public static void printOdd(int limit) {
	for(int i = 1; i <= limit; i++) {
		if(i%2==1) {
			System.out.print(i + " ");
		}
		}
		}
	
	
}