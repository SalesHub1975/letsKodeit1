package ramis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Int {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("davron");
        list.add("adam");
        list.add("adam");
        list.add("davron");
        list.add("davron");
        list.add("adam");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("john");
        list.add("adam");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("davron");
        list.add("STEVEN");
        list.add("davron");
        list.add("STEVEN");


        List<String> str = usernames(list);
        System.out.println(str);

    }

    public static List<String> usernamesSystem(List<String> u) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < u.size(); i++) {
            int counter = 0;
            if (result.contains(u.get(i))) {
                for (int j = 0; j < result.size(); j++) {
                    if (result.get(j).contains(u.get(i))) {
                        counter++;
                    }
                }
                result.add(u.get(i) + counter);
            } else {
                result.add(u.get(i));
            }
        }
        return result;
    }

    public static List<String> usernames(List<String> u) {
        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        for(int i = 0; i < u.size(); i++){
            if(!result.contains(u.get(i))){
                result.add(u.get(i));
            }else{
                int counter = 0;
                for(int j = 0; j < temp.size(); j++){
                    if(u.get(i).equals(u.get(j))){
                        counter++;
                    }
                }
                result.add(u.get(i)+counter);

            }
            temp.add(u.get(i));
        }
        return result;
    }
}
