package nestedLoop;

public class Window {
	
	// Run 10 times in the inner loop and skip the inner loop when it hits 5
	// other than 5 print all values of j
	// break the outer loop when j hits 7.
	

	public static void main(String[] args) {
		myOuterLoop:
			for(int i=0; i<1; i++) {
		myInnerLoop:	
			for(int j=0; j<=10; j++) {
			if(j==5) {
				continue;
				}
			if(j==7) {
				break myOuterLoop;
			}
			System.out.print(j);
			}	
		
		}
	}
}