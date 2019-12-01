package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class WeightedUniformString {

    public static void main(String[] args) {

        String s = "abccddde";
        int [] queries = {1,3,12,5,9,10};

        ArrayList<Integer> list1 = new ArrayList<>();
        HashSet<Integer> list = new HashSet<>();
        char current = '\0';
        int num = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(current != c){
                current = c;
                num = 0;
            }
            num += (int) current - 96;
            list.add(num);
        }

        String [] result = new String[queries.length];
        for(int i = 0; i < result.length; i++){
            if(list.contains(queries[i])){
                result[i] = "Yes";
            }else{
                result[i] = "No";
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
