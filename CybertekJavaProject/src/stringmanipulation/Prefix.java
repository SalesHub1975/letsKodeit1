package stringmanipulation;

public class Prefix {
	public static void main(String[] args) {
	
		String s = "Account number: 255572ACCD";
		boolean checkAccount = s.startsWith("2", 16);
		System.out.println(checkAccount);
		if(checkAccount==true) {
			System.out.println("Cool");
		}else {
			System.out.println("Not cool");
		}
		
		
//		int indexAccount = s.indexOf(":")+2;
//		String account = s.substring(indexAccount);
//		boolean check;
//		if(account.startsWith("2")) {
//			check = true;
//		}
//		else {
//			check = false;
//		}
//		System.out.println(check);
		
		
}
}
