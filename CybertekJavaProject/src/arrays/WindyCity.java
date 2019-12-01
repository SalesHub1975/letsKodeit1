package arrays;

public class WindyCity {

	public static void main(String[] args) {
		
		
		// a program and create String array called cities.
	    // Initialize the cities with cities below: Chicago,New York, Madison, Miami, Washington.
	    // Iterate through each city and check if Chicago is inside the cities.
		
		String [] cities = {"Chicago", "New York", "Madison", "Miami", "Washington"};
		int counter=0;
		
		for(int i=0; i<cities.length; i++) {
			if(cities[i].equalsIgnoreCase("chicago")) {
				System.out.println("Windy city found");
				counter++;
				break;
			}
		}
		if(counter==0) {
			System.out.println("Windy city not found");
		}
		
		int result=0;
		for(int j=0; j<cities.length; j++) {
			if(cities[j].equalsIgnoreCase("chicago")) {
				result++;
			}
		}
		if(result>0) {
		System.out.println("Number of Chicago: " + result);
	}
}
}
		
