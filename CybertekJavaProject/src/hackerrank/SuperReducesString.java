package hackerrank;

public class SuperReducesString {

    public static void main(String[] args) {

        String s = "baab";

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                s = s.substring(0,i) + s.substring(i+2);
                System.out.println(s);
                i = -1;
            }
        }

        if(s.isEmpty()){
            System.out.println("Empty String");
        }else{
            System.out.println(s);
        }



    }
}
