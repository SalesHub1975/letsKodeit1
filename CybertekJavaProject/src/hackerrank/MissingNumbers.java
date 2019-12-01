package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumbers {

    public static void main(String[] args) {


        int [] arr = {1,12,3,123,1,23};
        int [] brr = {1,12,3,123,1,23,124,1};
        Arrays.sort(arr);
        Arrays.sort(brr);
        int [] result = new int[brr.length - arr.length];
        int k = 0;

       for(int i = 0, j = 0; i < arr.length;) {
           if (arr[i] != brr[j]) {
               result[k] = brr[j];
               k++;
               j++;
           } else {
               i++;
               j++;
           }

           if(i == arr.length){
               for(int x = j; x < brr.length; x++){
                   result[k] = brr[x];
                   k++;
               }
           }
       }

        ArrayList<Integer> list  = new ArrayList<>();

       for(int c = 0; c < result.length; c++){
           if(!list.contains(result[c])){
               list.add(result[c]);
           }
       }

       int [] array = new int[list.size()];
       for(int d = 0; d < list.size(); d++){
           array[d] = list.get(d);
       }

        System.out.println(Arrays.toString(array));


    }
}
