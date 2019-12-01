package hackerrank;

import java.util.Arrays;

public class FindTheMedian {

    public static void main(String[] args) {


        int [] arr = {1,2,3,4,1,23,12,3,123,1,7,23,123};

        int less = 0;
        int more = 0;
        int index = 0;
        int med = 0;

        do {
            med = arr[index];
            less = 0;
            more = 0;
          inner:  for(int i = 0; i < arr.length; i++){
                if(index == i){
                    continue inner;
                }
                if(med >= arr[i]){
                    less++;
                }else{
                    more++;
                }
            }
            index++;
        }
        while(less != arr.length/2 && more != arr.length/2);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(med);



    }
}
