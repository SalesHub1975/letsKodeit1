package operators;

public class AndOperator {

	public static void main(String[] args) {
		
		int age = 45;
		String  name = "James";
		System.out.println(age > 21);
		System.out.println(name == "James");
		String lastName = "Bond";
		boolean result = (age > 21) && (name == "James") && (lastName == "Bond");	//AND OPERATOR 
		boolean result1 = (age > 100) || (name == "James"); 						//OR OPERATOR
		boolean result2 = (age > 40);												//GREATER THAN
		
		System.out.println("Final result; " + result);
		System.out.println(result2);
		
	}
}
