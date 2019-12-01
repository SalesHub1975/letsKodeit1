package methods;

public class Phone {

	public static void main(String[] args) {
	
	boolean check = isWeatherSunny("Monday");	
	if(check) {
		System.out.println("Let's do picnic");
	}else {
		System.out.println("Let's do code");	
	}
	}
	
//	return type method
//	method returns boolean type
//	method accepts String
	
	public static boolean isWeatherSunny(String day) {
		if(day.equals("Monday")) {
			System.out.println(day + " is sunny");
			return true;
		}else {
			System.out.println(day + " is not sunny");
			return false;
		}
	}
}
