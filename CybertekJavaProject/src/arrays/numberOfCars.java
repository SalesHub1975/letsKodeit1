package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class numberOfCars {

	public static void main(String[] args) {
		
		// PART I
		// Write a program that asks the number of cars user has
	    // create an array of String with given size
		
		// PART II
		// Please assign “Aston Martin” to each element of the garage array
		
		// PART III
		// Change the first car to "BMW" and last car to "Mercedes"
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of cars you have:");
		int numOfCars = input.nextInt();
		String [] myGarage = new String [numOfCars];
		String carName= "";
		//String result= "";
		input.nextLine();
		
		
		for(int i=0; i <numOfCars; i++) {
			System.out.println("Enter car # " + (i+1) + ": ");
			carName = input.nextLine();
			myGarage[i] = carName;
		}
		
		boolean check = false;
		
		for(int j=0; j<numOfCars; j++) {
			if(myGarage[j].equalsIgnoreCase("bmw") || myGarage[j].equalsIgnoreCase("mercedes")) {
				check = true;
		}
		}
		if(check) {
			System.out.println("You have german car");
		}else {
			System.out.println("You don't have german car");
		}	
		System.out.println("Cars are: " +Arrays.toString(myGarage));
	
		}
		}
		
			
