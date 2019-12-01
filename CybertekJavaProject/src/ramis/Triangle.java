package ramis;

public class Triangle {

    public static void main(String[] args) {


        printTriangle(15);

    }
    public static void printTriangle(int row){
        for(int i = 0; i <= row; i++){
            for(int j = row - i; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                if(k == i-1){
                    System.out.print("*");
                    break;
                }
                System.out.print("*-");
            }
            System.out.println();
        }
    }

}
