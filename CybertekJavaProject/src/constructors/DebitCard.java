package constructors;

public class DebitCard {

	String cardNumber;
	String holderName;
	String type;
	int pin;
	double balance;
	
	public DebitCard(String cardNumber, String holderName, String type, int pin, double balance) {
		
		if(type.equalsIgnoreCase("Mastercard") || type.equalsIgnoreCase("Visa")) {
			this.type = type;
		}else {
			System.out.println("Invalid type");
		}
		if((pin+"").length() == 4) {
			this.pin = pin;
		}else {
			System.out.println("Invalid pin");
		}
		if(cardNumber.length() == 16) {
		this.cardNumber = cardNumber;
		}else {
			System.out.println("Invalid card number");
		}
		this.holderName = holderName;
		this.balance = balance;
		
	}
	
}
