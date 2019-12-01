package constructors;

public class Speaker {

	String model;
	double weight;
	int year;
	
	
	public Speaker(String model) {
		this(model, 2000);
		this.model = model;
		
	}
	
	public Speaker(String model, int year) {
		
		this.model = model;
		this.year = year;
		this.volumeUp();
	}
	
	public void volumeUp() {
		System.out.println(model + " is increasing the volume");
	}
	
	
	public void volumeDown() {
		System.out.println(model + " is decreasing the volume");
	}
	
}
