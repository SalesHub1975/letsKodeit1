package ramis;

public class StrongPassword{

    public static void main(String[] args) {


        /*
        numbers = "0123456789"
        lower_case = "abcdefghijklmnopqrstuvwxyz"
        upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        special_characters = "!@#$%^&*()-+"
         */

        String password = "HackerRank#1";
        String str = "!@#$%^&*()-+";
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;
        int counter = 6;

            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                    if (upper == 0) {
                        upper++;
                        counter--;
                    }
                } else if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                    if (lower == 0) {
                        lower++;
                        counter--;
                    }
                } else if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    if (digit == 0) {
                        digit++;
                        counter--;
                    }
                } else {
                    if (special == 0) {
                        for (int j = 0; j < str.length(); j++) {
                            if (password.charAt(i) == str.charAt(j)) {
                                special++;
                                counter--;
                            }
                        }
                    }
                }
            }


        int sum = upper+lower+digit+special;
        int result = password.length() - sum;
        int print = 0;

        if(result < 0){
            print = Math.abs(password.length()-sum);
        }



    }
}