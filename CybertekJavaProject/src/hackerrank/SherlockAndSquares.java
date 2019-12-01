package hackerrank;

public class SherlockAndSquares {

    public static void main(String[] args) {

        int a = 3;
        int b = 9;
        int result = 0;

        int end = (int)Math.sqrt(b);

        for(int i = 1; i <= end; i++){
            if(i*i >= a && i*i <= b){
                result++;
            }
        }
        System.out.println(result);


    }
}
