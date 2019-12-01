package ramis;

public class BeautifulTriplets {

    public static void main(String[] args) {


        int [] arr = {1,2,4,5,7,8,10};
        int d = 3;
        int num = 0;


        for(int i = 0; i < arr.length; i++){
            int counter = 0;
            int temp = arr[i];
            for(int j = i; j < arr.length; j++){
               if(temp + d == arr[j]){
                   counter++;
                   temp = arr[j];
               }else{
                   continue;
               }
            }
            if(counter >= 2){
                num++;
            }
        }

      System.out.println(num);

    }
}
