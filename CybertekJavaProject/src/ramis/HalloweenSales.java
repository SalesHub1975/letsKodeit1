package ramis;

public class HalloweenSales {

    public static void main(String[] args) {

        int p = 100;
        int d = 99;
        int m = 81;
        int s = 180;
        int counter = 0;


        if(s >= p) {
            do {
                if (p <= m) {
                    p = m;
                    s = s - p;
                } else {
                    s = s - p;
                    p = p - d;
                }
                counter++;
            }
            while (s >= p && s >= m);
        }

        System.out.println(counter);





    }
}
