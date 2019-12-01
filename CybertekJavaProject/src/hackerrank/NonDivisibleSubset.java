package hackerrank;

import ramis.Int;

import java.util.*;

public class NonDivisibleSubset {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{19, 10, 12, 24, 25, 22};
        List<Integer> s = Arrays.asList(arr);
        int k = 4;


        List<Integer> check = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int max = 0;

        outer:
        for (int i = 0; i < s.size(); i++) {
            if(check.contains(s.get(i))){
                continue outer;
            }
            list = new ArrayList<>();
            check.add(s.get(i));
            list.add(s.get(i));
            middle:
            for (int j = 0; j < s.size(); j++) {
                if (i == j) {
                    continue middle;
                }
                int kCounter = 0;
                inner:
                for (int l = 0; l < list.size(); l++) {
                    if ((list.get(l) + s.get(j)) % k != 0) {
                        kCounter++;
                    } else {
                        continue middle;
                    }
                }
                if (kCounter == list.size()) {
                    list.add(s.get(j));
                    check.add(s.get(j));
                }
            }
            System.out.println(list);
            if (max < list.size()) {
                max = list.size();
            }
        }

        System.out.println(max);


    }
}
