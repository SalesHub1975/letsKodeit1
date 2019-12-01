package hackerrank;

public class FunnyString {

    public static void main(String[] args) {




    }
    public static String funnyString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reverse = sb.toString();
        String str1 = "";
        String str2 = "";

        for(int i = 0, j = s.length()-1; i < s.length()-1; i++, j--){
            int temp = Math.abs(s.charAt(i) - s.charAt(i+1));
            str1 += temp;
            int temp2 = Math.abs(s.charAt(j) - s.charAt(j-1));
            str2 += temp2;
        }

        if(str1.equals(str2)){
            return "Funny";
        }else{
            return "Not Funny";
        }
    }
}
