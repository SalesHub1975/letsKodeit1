package arrays;

public class Colors {

	public static void main(String[] args) {
		
		// PART I Create String array for the colors
	    // Initialize 4 colors
	    // Loop through each element using for loop and print each color names
		
		
		// PART II Print the color names if the length of the color is 4 or more
		
		
		String[] colors = {"red", "blue", "green", "white"};
		
		
		for(int i=0; i<colors.length; i++) {
			if(colors[i].length()>=4) {
			System.out.println("Colors: " + colors[i]);
		}
		}
	}
}
