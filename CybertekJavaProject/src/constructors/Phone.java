package constructors;

public class Phone {
	
	boolean touchscreen;
	String model;
	int memory;
	String color;
	long phoneNumber;
	
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Phone(String model, String color, int memory, boolean touchscreen) {
		this(model, color);
		this.touchscreen = touchscreen;
		if(memory > 0) {
			this.memory = memory; 
		}else {
			System.out.println("Invalid memory");
		}
	}
		
	
	
		public boolean text(long phoneNumber, String message) {
			if((phoneNumber+"").length() == 10 && !message.isEmpty()) {
				System.out.println(message + " sent to " + phoneNumber);
				return true;
			}else {
				System.out.println("Invalid phone number or text body");
				return false;
			}
		}
		
		
		public void call(long phoneNumber) {
			if((phoneNumber+"").length() == 10){
				System.out.println("Calling to " + phoneNumber);
			}else {
				System.out.println("Invalid phone number");
			}
		}
		
		
		
	}
	
	

