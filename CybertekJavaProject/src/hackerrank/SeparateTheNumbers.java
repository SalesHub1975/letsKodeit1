package hackerrank;

public class SeparateTheNumbers {

    public static void main(String[] args) {

        String s = "122123124125126127128129130131132133134";
        String first = "NO";

        for(int i = 1; i < s.length()/2 + 1; i++){
            first = s.substring(0, i);
            long num = Long.valueOf(first);
            long nextNum = num + 1;
            do{
                if(s.indexOf(first) == -1){
                    break;
                }else{
                    first = first + (nextNum + "");
                    nextNum++;
                }
            }
            while(first.length() < s.length());
            if(first.equals(s)){
                first = "YES " + num;
                break;
            }else{
                first = "NO";
            }
        }

        System.out.println(first);

    }
}
