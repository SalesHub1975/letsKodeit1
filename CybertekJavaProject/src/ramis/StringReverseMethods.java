package ramis;

public class StringReverseMethods {

    public static void main(String[] args) {


        char[] charArr = new char[10000];
        String s = new String(charArr);
        long start = System.currentTimeMillis();

        reverseWithSwap(s);

        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);


    }
    public static String reverseWithStringBiulder(String s){
        return new StringBuilder(s).reverse().toString();
    }



    public static String reverseWithNewString(String s){
        String reversed = "";
        for(int i = s.length()-1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        return  reversed;
    }

    public static String reverseWithSwap(String s){
        char[] charArr = s.toCharArray();
        for(int i = 0; i < charArr.length/2; i++){
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length - 1 - i];
            charArr[charArr.length - 1 - i] = temp;
        }
        return new String(charArr);
    }
}
