package ramis;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        System.out.println("Please enter a word:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.toLowerCase();
        String result = "Given word is Palindrome";

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                result = "Given word is not Palindrome";
                break;
            }
        }
        System.out.println(result);



    }

}
