package foreachloop;

public class Fruits {

	public static void main(String[] args) {
		String [] favoriteFruits = {"Orange", "Apples", "Pineapple", "Mango"};
		for(String fruit: favoriteFruits) {
			if(fruit.length()%2==0) {
			System.out.println(fruit);
		}
	}
	}
}

