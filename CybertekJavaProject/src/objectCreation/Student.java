package objectCreation;

public class Student {
	
	String name;
	String email;
	int age;

	public void read() {
		System.out.println(this.name + " is reading ");
	}
	
	public void read(Book book) {
		System.out.println(this.name + " is reading " + book.title + " by " + book.author);
	}
	
	public void read(int hours) {
		System.out.println( this.name + " is reading  for " + hours + " hours");
	}
}
	

