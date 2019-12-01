package stringmanipulation;

public class CheckAccount {

	public static void main(String[] args) {
		
		String s = "Account number: 257389ACCD";
		
//		Check if "number" is starting with upper case or lower case
//		print "Starts with upper case" if "Number" 
//		print "Starts with lower case" if "Number" 
		
		int indexOfN = s.indexOf(" ")+1;
		
		
		if (s.charAt(indexOfN)==('N')) {
			System.out.println("Starts with upper case");
		}
		else {
			System.out.println("Starts with lower case");
		}
	}
}
