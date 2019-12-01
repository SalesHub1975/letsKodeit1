package ramis;

import java.util.Arrays;

public class Pairs {

    public static void main(String[] args) {

        int [] arr = {1,5,3,4,2};
        int k = 2;

        Arrays.sort(arr);

        int i=0,j=1,count=0;

        while(j < arr.length) {
            int diff = arr[j] - arr[i];

            if (diff == k) {
                count++;
                j++;
            } else if (diff > k) {
                i++;
            } else if (diff < k) {
                j++;
            }
        }
        System.out.println(count);

    }
}
