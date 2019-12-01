package ramis;

public class TwoTwo {

    public static void main(String[] args) {

        String a = "120408192";


        long num = 0;
        String s = "";
        int counter = 0;



        // System.out.println(a);

        for (int k = 0; k < a.length(); k++) {
            if (s.startsWith("0")) {
                while (s.startsWith("0")) {
                    s = s.substring(1);
                }
                continue;
            }
            s = "";
            num = 0;
            for (int i = k; i < a.length(); i++) {
                s = s + a.charAt(i);
                num = Integer.valueOf(s);
                System.out.println(num);
                for (int j = 0; j < s.length(); j++) {
                    do {
                        if (num % 2 != 0) {
                            break;
                        }
                        num = num / 2;
                        if (num == 1) {
                            counter++;
                        }
                    } while (num > 1);
                }
            }
        }
        System.out.println(counter);



    }
}
