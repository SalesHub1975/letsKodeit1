package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestNumbers {

    public static void main(String[] args) {

        int[] arr = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int difference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            inner:
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue inner;
                }
                if (Math.abs(arr[i] - arr[j]) < difference) {
                    difference = Math.abs(arr[i] - arr[j]);
                    list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                } else if (arr[i] - arr[j] == difference && !list.contains(arr[i]) && !list.contains(arr[j])) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }

        System.out.println(Arrays.toString(result));

    }
}
