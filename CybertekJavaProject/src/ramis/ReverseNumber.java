package ramis;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 121234233;
        int sum = 0;

        while(num != 0){
            sum = sum * 10;
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.println(sum);
    }
}
