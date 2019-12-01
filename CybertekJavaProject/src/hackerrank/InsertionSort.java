package hackerrank;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        int n = 10;

        int index = n;
        int number = arr[n - 1];
        boolean done = false;

        int cursor = n-1;


        try{
            outer: while(arr[index-2] > number){
                for(int i = 0; i < n; i++){

                    int temp = arr[n-2-i];
                    if(temp < number){
                        arr[n-1-i] = number;
                        done = true;
                    }else{
                        arr[n-1-i] = temp;
                    }
                    cursor--;
                    for(int j = 0; j < n; j++){
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    if(done == true){
                        break outer;
                    }
                }
                index--;
            }

        }catch (Exception e){
            arr[cursor] = number;
            for(int i = 0; i < 1; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();

            }
        }







    }
}
