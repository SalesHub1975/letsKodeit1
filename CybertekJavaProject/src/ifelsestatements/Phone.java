package ifelsestatements;

public class Phone {

public static void main(String[] args) {
	String color = "Grey";
	int memory = 128;
	String model = "Iphone X";
	System.out.println("Color is changing to Gold");
	color = "Gold";
	int size = color.length();
	memory = 152;
	if(memory >= 512) {
		System.out.println("Gold phone");
	}
	else {
		System.out.println("Okey phone");
	}
		}
}