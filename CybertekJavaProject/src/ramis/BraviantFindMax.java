package ramis;

import java.util.Arrays;
import java.util.List;

public class BraviantFindMax {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(51, 111, 99, 7, 111);


        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;

        for(Integer i: list){
            if(i > maximum){
                secondMaximum = maximum;
                maximum = i;
            }else if(i <= maximum && i > secondMaximum){
                secondMaximum = i;
            }
        }
        System.out.println(maximum);
        System.out.println(secondMaximum);

    }
}
