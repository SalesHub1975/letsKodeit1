package ramis;

import java.util.ArrayList;

public class SequenceEquation {

    public static void main(String[] args) {


        int[] p = {4, 3, 5, 1, 2};         // [4,2,5,1,3]

        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[p.length];


        for (int i = 1; i <= p.length; i++) {
            for (int y = 0; y < p.length; y++) {
                if (i == p[y]) {
                    int temp = y + 1;
                    for (int j = 0; j < p.length; j++) {
                        if (temp == p[j]) {
                            list.add(j + 1);
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }


    }
}
