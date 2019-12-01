package ramis;

import java.util.ArrayList;

public class EqualizeArray {

    public static void main(String[] args) {


        int num = 0;  // 3 3 2 1 3
        int [] arr =    {1,2,2,3};


        ArrayList<Integer> b = new ArrayList<>();
        int total = 0;
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            num = 0;
                if(b.contains(arr[i])){
                    continue;
                }
            for(int j = 0; j < arr.length; j++){
               if(arr[i] == arr[j]){
                   num++;
               }
            }
            b.add(arr[i]);
            if(num > total){
                total = num;
                result = arr[i];
            }

        }

        int ramis = arr.length - total;

//        System.out.println(result);
//        System.out.println(total);
        System.out.println(ramis);
    }

}
