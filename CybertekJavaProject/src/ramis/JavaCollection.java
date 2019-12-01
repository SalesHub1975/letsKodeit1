package ramis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollection {

    public static void main(String[] args) {


        Map<String, Integer> myList = new HashMap<>();
        myList.put("Salah", 11);
        myList.put("Firmino", 9);
        myList.put("Mane", 10);
        myList.put("Owen", 10);
        myList.put("Gerrard", 8);
        myList.put("Carragher", 23);
        myList.put("Salah", 11);

        System.out.println(myList);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Map.Entry<String, Integer> entry: myList.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
            }
            if(entry.getValue() < min){
                min = entry.getValue();
            }
        }

        System.out.println("MAX IS: " + max + " MIN IS: " + min);



    }
}
