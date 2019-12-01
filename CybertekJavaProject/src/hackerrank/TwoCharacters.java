package hackerrank;

import java.util.Arrays;

public class TwoCharacters {

    public static void main(String[] args) {


        String s = "cobmjdczpffbxputsaqrwnftvbmxjujeubiofecvmjmxvofejdvovtjulhhfyadr";


        String copy = s;
        String stored = "";


        for (int i = 0; i < s.length(); i++) {
            if (!stored.contains(s.charAt(i) + "")) {
                stored += s.charAt(i) + "";
            }
        }

        String[] arr = stored.split("");
        int max = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                String temp = "";
                boolean valid = true;
                s = copy;
                for (int x = 0; x < s.length(); x++) {
                    if ((arr[i]).equals(s.charAt(x) + "") || arr[j].equals(s.charAt(x) + "")) {
                        temp += s.charAt(x);
                    }
                }
                for (int k = 0; k < temp.length() - 1; k++) {
                    if (temp.charAt(k) == temp.charAt(k + 1)) {
                        valid = false;
                        break;
                    }
                }
                if (valid == true) {
                    System.out.println("PRINTED VALID MESSAGE " + temp);
                    if (max < temp.length()) {
                        max = temp.length();
                    }
                }

            }
        }

        System.out.println(max);


    }
}
