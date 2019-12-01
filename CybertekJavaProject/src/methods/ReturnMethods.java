package methods;

import javax.xml.crypto.Data;

public class ReturnMethods {
	
	public static void main(String[] args) {
		
		
		// PART I
		//	Create a method that accepts String.
		//	Method should check if given String contains word “con”.
		//	If yes then it removes word “con” from the given String and returns modified String.
		//	Special cases:1.You need to check if given String is ONLY one word.
		//	If given string is two or more words then print “Invalid data”, terminate the method and return empty String.
		//	2.You need to check if given String length is at least 3. If less than 3 then print “Invalid data”, terminate the method and return empty String.
		//	3.If given String doesn’t contain word “con” return the given word itself.
		//	Input: “Consequences”Output: “sequences”
		//	Input: “James” Output: “James”
		//	Input: “concept map”Output: print: “Invalid data” return value: ”
		
		
//		PART II Write a method
//		Method should accept 2 strings
//		1 - Data.class 2 - String we want to remove(3 letters)
//		Every single rules for previous version is came for this method too
		
		String str = "concept";
		String result = removeCon(str);
		System.out.println(result);
		
		System.out.println(removeLetters("HondaAccord", "cord"));
		
		
	}
	public static String removeCon (String word) {
		word = word.toLowerCase().trim();
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		if(word.contains("con")) {
			String s = word.replace("con", "");
			return s;
		}else {
			return word;
		}
		
		
	}
	public static String removeLetters (String word1, String word2) {
		word1 = word1.toLowerCase().trim();
		if(word1.contains(" ") || word1.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		if(word1.contains(word2)) {
			String result = word1.replace(word2, "");
			return result;
		}else {
			return word1;
		}
		
		
	}

}
