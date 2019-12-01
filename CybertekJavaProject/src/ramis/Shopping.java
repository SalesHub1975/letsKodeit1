package ramis;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		
		int phone = 500;
		int tv = 350;
		int gas = 50;
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you have?");
		int enteredmoney = input.nextInt();
		
		if(enteredmoney>=900) {
			System.out.println("OK! You can buy for this money phone, tv and gas for your car");
		}
		else if (enteredmoney>350 && enteredmoney<=899){
			System.out.println("You can choose 2 from 3 items");
		}
		else if(enteredmoney>=50 && enteredmoney<=350) {
				System.out.println("You need to choose. TV or GAS?");
			}
				
				else if (enteredmoney<50){
					System.out.println("Unfortunatly you cannot anything");
					
				}
	
		
		
		
		
	}
}
