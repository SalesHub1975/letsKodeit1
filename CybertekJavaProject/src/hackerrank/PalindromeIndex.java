package hackerrank;

public class PalindromeIndex {

    public static void main(String[] args) {

        String s = "hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";

        int index = -1;
        for(int i = 0; i < s.length()/2; i++){
            char start = s.charAt(i+1);
            char end = s.charAt(s.length()-2-i);
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                    if(s.charAt(s.length()-1-i) == start){
                        index = i;
                    }else if(s.charAt(i) == end){
                        index = s.length()-1-i;
                    }
                    break;
            }
        }

        System.out.println(index);

    }
}
