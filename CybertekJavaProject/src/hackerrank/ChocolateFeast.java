package hackerrank;

public class ChocolateFeast {

    public static void main(String[] args) {

        int n = 6;
        int c = 2;
        int m = 2;

        int bars = n / c;
        int wrapper = bars;

        while(wrapper >= m){
            int counter = wrapper/m;
            bars += counter;
            int rem = wrapper % m;
            wrapper = rem + counter;
        }

        System.out.println(bars);
    }
}
