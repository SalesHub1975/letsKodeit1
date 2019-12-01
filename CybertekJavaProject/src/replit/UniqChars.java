package replit;

public class UniqChars {

	public static void main(String[] args) {
		
		String s = "Liverpool";
		
		String result = uniqueChars(s);
		System.out.println(result);
		
	}
	 public static String uniqueChars(String str) {
		 String s = "";
		    for(int i = 0; i < str.length(); i++){
		      if(s.contains(str.charAt(i)+"")){
		        continue;
		      }
		      s = s + str.charAt(i);
		    }
		    return s; 
	 }
}
