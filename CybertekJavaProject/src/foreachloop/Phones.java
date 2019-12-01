package foreachloop;

public class Phones {

	public static void main(String[] args) {
		
		String [] phone = {"Iphone", "Samsung", "LG", "Google Pixel", "Motorola"};
		String [] phone2 = {"Iphone", "Samsung", "LG", "Google Pixel", "Motorola"};
	
		int counter=0;
		
		if(phone.length==phone2.length) {
		for(int i = 0; i < phone.length; i++) {
				if(phone[i].equals(phone2[i])) {
					counter++;
				}
		}
		}
		if(counter==phone.length) {
			System.out.println("Two arrays are the same");
		}else {
			System.out.println("Two arrays are different");
		}
	}
}