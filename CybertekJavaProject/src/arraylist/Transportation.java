package arraylist;

import java.util.ArrayList;

public class Transportation {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names.size());
		names.add("Adam");
		names.add("James");
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(1));
		names.add("Salah");
		System.out.println(names);
		names.add(0, "Van Dijk");
		System.out.println(names);
		System.out.println(names.contains("Salah"));
		System.out.println(names.indexOf("Van Dijk"));
		names.remove(2);
		System.out.println(names);
		names.remove("Adam");
		System.out.println(names);
		names.add("Salah");
		System.out.println(names.indexOf("Salah"));
		names.clear();
		System.out.println(names);
		System.out.println(names.isEmpty());
		
		
	}

}
