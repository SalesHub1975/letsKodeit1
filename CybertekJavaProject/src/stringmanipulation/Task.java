package stringmanipulation;

public class Task {

	 public static void main(String[] args) {
		 
		 String s = "Your account number: 257389ACCD";
		 int i = s.indexOf(":")+2;
		 if(s.charAt(i)=='2') {
			 System.out.println("Cool");
			 String account=s.substring(i,i+6);
			 System.out.println("Account is: " + account);
		 }
		 else {
			 System.out.println("Not cool");
			 String account=s.substring(i,i+5);
			 System.out.println("Account is: " + account);
		 }
		

//		 String account = "257389ACCD";
//		 String account2 = "52317XYZ";
//		 
//		 char first = account.charAt(0);
//		 
//		 int i = account.length();
//		 int l = account2.length();
//		 
//		 
//		 if (first=='2' ) {
//			 String number = account.substring(0,6);
//			 System.out.println("Account number is: " + number);
//		 }
//		 else {
//			String number2 = account2.substring(0,5);
//			System.out.println("Account number is: " + number2);
//		 }
		
		 
//		 String numbers = account.substring(0,6);
//		 System.out.println(numbers);
		
	}
}
