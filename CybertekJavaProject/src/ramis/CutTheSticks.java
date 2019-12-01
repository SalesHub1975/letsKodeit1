package ramis;

import java.util.ArrayList;
import java.util.Arrays;

public class CutTheSticks {

    public static void main(String[] args) {

        int [] arr = {5,4,4,2,2,8};             // 2 2 4 4 5 8
        Arrays.sort(arr);
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println(1/2);
        int min = arr[0];
        int s = 0;
        int counter = 0;



        System.out.println(Arrays.toString(arr));
        System.out.println(counter);

    }
    public static int findMin(int [] nums){
        int min = 0;
        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return min;
    }

}
