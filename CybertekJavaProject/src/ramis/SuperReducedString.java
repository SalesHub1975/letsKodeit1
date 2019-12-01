package ramis;

public class SuperReducedString {

    public static void main(String[] args) {

        String s = "aabb";
        String temp = "";

        boolean check = true;

        while(check == true) {
            check = false;
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) != s.charAt(i+1)){
                    temp += s.charAt(i);
                }else{
                    i++;
                    continue;
                }
            }
            temp = temp + s.charAt(s.length()-1);

            for (int i = 0; i < temp.length() - 1; i++) {
                if (temp.charAt(i) == temp.charAt(i + 1)) {
                    check = true;
                    break;
                }
            }
        }

        System.out.println(temp);

    }

}
