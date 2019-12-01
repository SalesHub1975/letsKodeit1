	
	 package arraysClass;



	import java.util.*;


	public class CarsModels {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		String [] cars = {"bmw", "amg", "mercedes", "toyota", "zenda", "lexus"};
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
	}
}
