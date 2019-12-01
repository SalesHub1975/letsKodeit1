package objectCreation;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Ibrahim";
		s1.age = 16;
		s1.email = "umetaliev.ramis@gmail.com";
		

		s1.read();

		Book b = new Book();
		b.author = "James Bond";
		b.title = "Life is Difficult";
		b.pages = 230;
		s1.read(b);
		int hours = 2;
		s1.read(hours);
		
		

	}

}
