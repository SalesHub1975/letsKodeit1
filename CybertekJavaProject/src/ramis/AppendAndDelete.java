package ramis;

public class AppendAndDelete {

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcdert";
        int k = 10;

        System.out.println(appendAndDelete(s,t,k));

    }

        static String appendAndDelete (String s, String t,int k){

        if(s.length() + t.length() <= k){
            return "Yes";
        }

            int count = 0;
            if (s.length() >= t.length()) {
                for (int i = 0; i < t.length(); i++) {
                    if (s.charAt(i) == t.charAt(i)) {
                        count++;
                    } else {
                        break;
                    }
                }
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (t.charAt(i) == s.charAt(i)) {
                        count++;
                    } else {
                        break;
                    }
                }
            }

            int changes = Math.abs(s.length() - count) + Math.abs(t.length() - count);
            if (k == changes) {
                return "Yes";
            } else {
                return "No";
            }


    }
}
