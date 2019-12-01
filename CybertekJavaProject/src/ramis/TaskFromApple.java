package ramis;

import java.util.HashMap;
import java.util.Map;

public class TaskFromApple {

    public static void main(String[] args) {


        test1("aaabbb");

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2551);
        map.put("b", 4556);
        map.put("c", 23);
        map.put("d", 40);
        map.put("e", 244);
        test2(map);





    }
    public static void test1(String name){

        name = name.toLowerCase();
        int max = 0;
        String result = "";

        for(int i = 0; i < name.length(); i++){
            int counter = 0;
            for(int j = 0; j < name.length(); j++){
                if(name.charAt(j) == name.charAt(i)){
                    counter++;
                }
            }
            if(max < counter) {
                max = counter;
                result = name.charAt(i) + "-" + max;
            }
        }
        System.out.println(result);
    }


    public static void test2(Map<String, Integer> map){
        int max = Integer.MIN_VALUE;
        String result = "";

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                result = "The Character '" + entry.getKey() + "' has the largest int value which is " + entry.getValue();
            }
        }
        System.out.println(result);
    }
}
