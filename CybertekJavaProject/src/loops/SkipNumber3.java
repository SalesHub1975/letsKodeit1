package loops;

public class SkipNumber3 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 50; i++) {
			
			String n = i+"";
			if(n.endsWith("3")) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
