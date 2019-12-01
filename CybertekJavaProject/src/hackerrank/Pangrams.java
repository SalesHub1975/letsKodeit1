package hackerrank;

public class Pangrams {

    public static void main(String[] args) {

        String s = "We promptly judged antique ivory buckles for the next prize";

        s = s.toLowerCase();
        s = s.replace(" ", "");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String [] arr = alphabet.split("");
        String result = "pangram";


        for(int i = 0; i < arr.length; i++){
           if(s.indexOf(arr[i]) == -1){
               result = "not pangram";
               break;
           }
        }

        System.out.println(result);



    }
}
