package hackerrank;

public class CaesarCipher {

    public static void main(String[] args) {

        String s = "www.abc.xy";
        int k = 87;

        String result = "";
        char c;

        for(int i = 0; i < s.length(); i++){
            int oldIndex = s.charAt(i);
            int newIndex = oldIndex + k;
            if(oldIndex >= 65 && oldIndex <= 90){
                if(newIndex > 90){
                    while(newIndex > 90){
                        newIndex = newIndex - 26;
                    }
                }
                c = (char) newIndex;
            }else if(oldIndex >= 97 && oldIndex <=122){
                if(newIndex > 122){
                    while(newIndex > 122){
                        newIndex = newIndex - 26;
                    }
                }
                c = (char) newIndex;
            }else{
                c = (char) oldIndex;
            }
            result += c;
        }

        System.out.println(result);


    }
}
