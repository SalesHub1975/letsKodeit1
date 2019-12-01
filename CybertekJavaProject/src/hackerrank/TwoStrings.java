package hackerrank;

import java.util.ArrayList;

public class TwoStrings {

    public static void main(String[] args) {

        String s1 = "hi";
        String s2 = "world";

        System.out.println(twoStrings(s1,s2));


    }
        static String twoStrings(String s1, String s2){
            String abc = "abcdefghijklmnopqrstuvwxyz";

            for(char c: abc.toCharArray()){
                if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1){
                    return "YES";
                }
            }
            return "NO";
        }
}
