package foreachloop;

public class ValidEmail {

	public static void main(String[] args) {
		
		String [] emails = {"facebook@gmail.com", "google@mail.ru", "cars.mail.us", "soccer@yahoo.com", "rambler.ru"};
		for(String result: emails) {
			if(result.contains("@") && result.contains(".")) {
				System.out.println(result);
			}
		}
		
	}
}
