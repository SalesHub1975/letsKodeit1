package replit;

public class JavaSelenium {
	
	public static void main(String[] args) {
		
		String one = "12345";
		String two = "0000000";
		
		String result = mergeStrings(one, two);
		System.out.println(result);
		
	}
		 public static String mergeStrings(String one, String two) {
			    
			    String s = "";
			    
			    if(one.length() <= two.length()){
			    for(int i = 0; i < one.length(); i++) {
						s = s + one.charAt(i) + two.charAt(i);
						if(i == one.length()-1) {
							s = s + two.substring(i+1);
						}
			    }
			    }else{
			      for(int i = 0; i < two.length(); i++) {
						s = s + one.charAt(i) + two.charAt(i);
						if(i == two.length()-1) {
							s = s + one.substring(i+1);
						}
			      	}
			  }
				return s;
			}
	}
