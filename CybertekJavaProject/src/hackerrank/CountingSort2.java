package hackerrank;

import java.util.Arrays;

public class CountingSort2 {

    public static void main(String[] args) {

        int [] arr = {11,21,3,200,1,101};

        int max = Integer.MIN_VALUE;
        for(int i: arr){
            if(max < i){
                max = i;
            }
        }

        int [] result = new int[max + 1];

        for(int i = 0; i < arr.length; i++){
            result[arr[i]]++;
        }
        System.out.println(Arrays.toString(result));

        int [] myarr = new int[arr.length];
        int index = 0;

        int iteration = 0;
        int min = 0;
        for(int i = 0; i < result.length; i++){
            while(result[i] != 0){
                myarr[index] = min;
                index++;
                result[i]--;
            }
            min++;
        }

        System.out.println(Arrays.toString(myarr));


    }
}
