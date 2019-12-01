package ramis;

public class Ulugbek {

    public static void main(String[] args) {

        String str = "asdasd";
        str = str.toLowerCase();
        String str2 = "";

        for(int i = 0; i < str.length(); i++){
            int counter = 0;
            for(int j = 0; j < str.length(); j++){
                if(!str2.contains(str.charAt(i)+"")) {
                    if (str.charAt(i) == str.charAt(j)) {
                        counter++;
                    }
                }else{
                    continue;
                }
            }
            if(!str2.contains(str.charAt(i)+"")) {
                System.out.print((str.charAt(i) + "") + counter);
            }
            str2 += str.charAt(i);
        }
    }
}
