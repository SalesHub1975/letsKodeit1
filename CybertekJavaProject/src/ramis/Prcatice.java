package ramis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prcatice {

    public static void main(String[] args) {


        int rows = 8;

        for(int i = 0; i < rows; i++){
            for(int j = rows-i-1; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                if(k == i){
                    System.out.print("*");
                    break;
                }
                System.out.print("*-");
            }
            System.out.println();
        }



    }
}
