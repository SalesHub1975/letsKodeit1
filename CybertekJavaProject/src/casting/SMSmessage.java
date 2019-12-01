package casting;

public class SMSmessage {

	public static void main(String[] args) {
		
		String SMSmesssage = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		
		int a = SMSmesssage.indexOf("<");
		int b = SMSmesssage.indexOf(">");
		String sender = SMSmesssage.substring(a+1, b);
		
		int c = SMSmesssage.indexOf("[");
		int d = SMSmesssage.indexOf("]");
		String phoneNumber = SMSmesssage.substring(c+1, d);
		
		int e = SMSmesssage.indexOf("{");
		int f = SMSmesssage.indexOf("}");
		String message = SMSmesssage.substring(e+1, f);
		
		System.out.println("Sender: " + sender);
		System.out.println("Number: " + phoneNumber);
		System.out.println("Message: " + message);
	}
}
