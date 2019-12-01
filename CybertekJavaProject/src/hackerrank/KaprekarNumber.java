package hackerrank;

public class KaprekarNumber {

    public static void main(String[] args) {

        int p = 1000;
        int q = 10000;


        for(int i = p; i <= q; i++){
            if(i % 10 == 0){
                continue;
            }
            int sq = i*i;
            String s = sq+"";
            int N = (int) Math.pow(10, s.length()-1);
            while(N != 0){
                int rem = sq % N;
                int divide = sq / N;
                N = N / 10;
                int sum = divide + rem;
                if(sum == i){
                    System.out.println(i);
                    System.out.println(divide + " plus " + rem + " give us " + i);
                    break;
                }
            }
        }


    }
}
