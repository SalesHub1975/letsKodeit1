package hackerrank;

import java.util.Arrays;

public class ServiceLane {

    public static void main(String[] args) {

        int n = 5;
        int [][] cases = {
                            {0,3},
                            {4,6},
                            {6,7},
                            {3,5},
                            {0,7},
                         };

        int [] arr = new int[n];
        int [] width = {2, 3, 1, 2, 3, 2, 3, 3};


        for(int i = 0; i < cases.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = cases[i][0]; j <= cases[i][1]; j++){
                if(min > width[j]){
                    min = width[j];
                }
            }
            arr[i] = min;
        }

        System.out.println(Arrays.toString(arr));

    }
}
