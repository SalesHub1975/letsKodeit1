package ramis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BraviantTask {

    public static void main(String[] args) {

        readFirstLine("path");


    }



    static String readFirstLine(String path){
        BufferedReader file = null;
        String buffer = null;
        try{
            System.out.println("first calling");
            file = new BufferedReader(new FileReader(path)); // this will throw exception
            System.out.println("second calling");
            buffer = file.readLine();                           // will not be executed
        }catch (IOException e){
            System.out.println("Error reading from " + path + ". Message = " + e.getMessage()); //error message
        }finally {
            if(file != null){   // file is null
                try {
                    System.out.println("file.close is called");
                    file.close();   // method is not called
                    System.out.println("file.close is called");
                }catch (IOException ex){

                }
            }
        }
        System.out.println("OUTPUT");
        System.out.println(file);
        System.out.println(buffer);
        System.out.println("result");
        return buffer;
    }

    
}
