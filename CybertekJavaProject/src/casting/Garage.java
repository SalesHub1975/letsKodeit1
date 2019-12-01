package casting;

public class Garage {

	public static void main(String[] args) {
		
		
		String garage = "toyota, bmw, jaguar, mazerati";
		garage=garage.toLowerCase();
		
		if(garage.isEmpty()){
			System.out.println("no cars in garage");
		} else {	
			if(garage.contains("toyota") || garage.contains("nissan")) {
				System.out.println("There is a Japanese car in garage");
			} else {
			System.out.println("No Japanese cars");
			}
		
			if(garage.contains("bmw")) {
			System.out.println("There is a german car in garage");
			} else {
				System.out.println("No german cars");
			}	
		
			if(garage.contains("mazerati")) {
			System.out.println("There is an italian car in garage");
			} else {
			System.out.println("No italian cars");
			}
		
			if (garage.contains("jaguar")) {
			System.out.println("There is an british car in garage");
			} else {
			System.out.println("No british cars");
			
	}
	}
	}
	}

		