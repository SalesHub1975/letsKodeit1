package ramis;

import java.util.Arrays;
import java.util.Scanner;

public class Geometry {



    public static void main(String[] args) {



        boolean isValid = false;
        String[] shipTypes = {"ss", "m", "dddd", "ccc"};
        String[][]  br = {
                {"w", "w", "w", "w"},
                {"w", "w", "w", "m"},    //0,0,1,3
                {"w", "w", "m", "w"},
                {"w", "w", "w", "w"}
                                    };
        int row = 0;
        int column = 0;
        int dir = 1;
        int shipT = 3;
        int a = br.length;
        int b = br[0].length;

        String sh = shipTypes[shipT];

        if(dir == 1){
            if(column + sh.length() > br[row].length){
                isValid = false;
            }else {
                isValid = true;
            }
        }else if(dir == 0){
            if(row + sh.length() > br.length){
                isValid = false;
            }else{
                isValid = true;
            }
        }

        String s = shipTypes[shipT].substring(0,1);
        boolean shipPlacement = false;

        if(isValid == true){
            if(numOfw(row,column,dir,shipT) == true){
                if(dir == 0){
                    for(int i = row; i < br.length; i++){
                        br[row][column] = s;
                            shipPlacement = true;
                    }
                }else if(dir == 1){
                    for(int i = column; i < br[row].length; i++){
                        br[row][column] = s;
                            shipPlacement = true;
                    }
                }
            }else{
                shipPlacement = false;
            }
        }else{
            shipPlacement = false;
        }

    }
    public static boolean numOfw(int row, int column, int dir, int shipT){
        String[] shipTypes = new String[]{"ss","m","dddd","ccc"};
        String[][]  br = {
                {"w", "w", "w", "w"},
                {"w", "w", "w", "m"},    //2,1,1,0  ss
                {"w", "w", "m", "w"},
                {"w", "w", "w", "w"}
        };

        int counter = 0;
        if(dir == 0){
            for(int i = row; i < br.length; i++){
                if(br[row][column].equals("w")){
                    counter++;
                }
            }
        }else if(dir == 1){
            for(int i = column; i < br[row].length; i++){
                if(br[row][column].equals("w")){
                    counter++;
                }
            }
        }

        if(counter == shipTypes[shipT].length()){
            return true;
        }else{
            return false;
        }

    }
}