package hackerrank;

public class Gemstones {

    public static void main(String[] args) {

        String [] arr = {"qaweqweqweqwe", "aaqwaa", "bbbbbbwbabbbq", "wqa"};

        String result = "";
        String str = arr[0];
        for(int i = 0; i < str.length(); i++){
            String s = str.charAt(i)+"";
            int counter = 0;
            if(!result.contains(s)){
                for(int j = 1; j < arr.length; j++){
                    if(arr[j].contains(s)){
                        counter++;
                    }
                }
                if(counter == arr.length - 1){
                    result += s;
                }
            }
        }

        System.out.println(result);



    }
}
