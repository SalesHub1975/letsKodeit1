package ramis;

public class FindDigits {

    public static void main(String[] args) {

        int n = 1012;

        int counter = 0;
        String s = "" + n;

        for(int i = 0; i < s.length(); i++){
            int num = Integer.valueOf(s.charAt(i)+"");
            if(num == 0){
                continue;
            }
            if(n % num == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
