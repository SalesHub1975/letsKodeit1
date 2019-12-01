package constructors;

public class Item {
	
	public String name;
	public double price;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void info() {
		System.out.println("\nITEM INFFORMATION:::");
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price + "$");
	}
	
}
