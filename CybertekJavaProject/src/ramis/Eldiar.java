package ramis;

public class Eldiar {

    public static void main(String[] args) {

        String s = "Java coding is fun and challenging";
        s = s.trim();
        String result = "";

        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++){
            result += arr[i].charAt(arr[i].length()-1) + arr[i].substring(1, arr[i].length()-1) + arr[i].charAt(0) + " ";
        }
        System.out.println(result);

    }

}
