package hackerrank;

import java.util.ArrayList;

public class GameOfThrones {

    public static void main(String[] args) {

        String s = "cdefghmnopqrstuvw";

        int odd = 0;
        String result = "YES";
        ArrayList<Character> list = new ArrayList<>();


            for (int i = 0; i < s.length(); i++) {
                int counter = 0;
                for (int j = 0; j < s.length(); j++) {
                    if(list.contains(s.charAt(i))){
                        continue;
                    }
                    if (s.charAt(i) == s.charAt(j)) {
                        counter++;
                    }
                }
                list.add(s.charAt(i));
                if (counter % 2 == 1) {
                    odd++;
                }
                if(odd > 1){
                    result = "NO";
                    break;
                }
            }


        System.out.println(result);

    }
}
