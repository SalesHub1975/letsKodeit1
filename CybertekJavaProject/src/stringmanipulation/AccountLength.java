package stringmanipulation;

public class AccountLength {
	public static void main(String[] args) {
		
		String s = "Account Number: 453845383";
		
//		Write a code that validates account number length
//		Each account length must be 8 
//		print "Valid account length" if 
//		print "Invalid account length" if
		
		int i = s.indexOf(":")+2;
		String number = s.substring(i);
		if(number.length()==8) {
			System.out.println("Valid account length");
		}else {
			System.out.println("Invalid account length");
		}
			
 	}
}
