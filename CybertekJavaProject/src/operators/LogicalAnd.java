package operators;

public class LogicalAnd {

	public static void main(String[] args) {
		
		int age = 18;
		String name = "John";
		String weather = "rainy";
		
		boolean check = ((name = "Adam") == "James")&(age >=21)  ;					//GREATER THAN OR EQUAL, AND OPERATOR;
		System.out.println(check);
		System.out.println(name);
		
		String username = "jbond";
		String password = "Jbond123";
		//boolean login = (username -> exists in database) & (password -> exist DB);
		
	}
}
