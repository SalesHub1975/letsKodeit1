package hackerrank;

public class HackerrankInAString {

    public static void main(String[] args) {


        String ss = "hackerworld";
        System.out.println(hackerrankInString(ss));



    }

    public static String hackerrankInString(String s) {

        if(s.length() < 10){
            return "NO";
        }
        if(s.indexOf("hackerrank") > -1){
            return "YES";
        }

        String hackerrank = "hackerrank";
        String result = "";

        for(int i = 0; i < hackerrank.length(); i++){
            char c = hackerrank.charAt(i);
            String str = hackerrank.charAt(i) + "";
            for(int j = 0; j < s.length(); j++){
                if(s.indexOf(str) == -1){
//                    System.out.println(str + " does not exist in " + s);
//                    System.out.println(result);
                    return "NO";
                } else if(c == s.charAt(j)){
                    result += s.charAt(j);
                    s = s.substring(j+1);
                    break;
                }
            }
        }

        if(hackerrank.equalsIgnoreCase(result)){
            return "YES";
        }else{
            return "NO";
        }


    }

}
