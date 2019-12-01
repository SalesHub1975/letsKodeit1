package primitives;

public class Student {

	public static void main(String[] args) {
		double height = 5.7;
		System.out.println("Height before:" + height);
		height = 6.1;
		System.out.println("Height after:" + height);
		System.out.println(height);
		
		String name = "James";
		String LastName = "Bond";
		String location = "Chicago";
		System.out.println(name);
		System.out.println(LastName);
		System.out.println(name + " " + LastName);
		System.out.println(name + " " + LastName + "," + location);
		location = "London";
		System.out.println(name + " " + LastName + "," + location);
		
	
	}
	
}
