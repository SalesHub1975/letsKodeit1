package ramis;

public class ReverseNumbers {

    public static void main(String[] args) {

        int [] numbers = {1,2};
        System.out.println(reverseArray(numbers));
    }


    public static int reverseArray(int [] arr){
        int result = 0;
        int num = (int)Math.pow(10, arr.length-1);
        for(int i = arr.length - 1; i >= 0; i--){
            result += arr[i] * num;
            num = num / 10;
        }
        return result;
    }
}
