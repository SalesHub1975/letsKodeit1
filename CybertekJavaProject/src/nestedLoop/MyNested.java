package nestedLoop;

public class MyNested {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("JAVA");			// (j) 012 012 012 012 012
			}
			//System.out.println("Hello");		// inside of inner loop
			
			
		}
	}
}
