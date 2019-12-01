package hackerrank;

public class AlternatingCharacther {

    public static void main(String[] args) {

        String s = "AAA";

        int counter = 0;
        for(int i = 0; i < 1; i++){
            char c = s.charAt(i);
            int index = i+1;
            while(index < s.length()){
                if(c == s.charAt(index)){
                    counter++;
                    index++;
                }else{
                    c = s.charAt(index);
                    index++;
                }
            }
        }

        System.out.println(counter);
    }
}
