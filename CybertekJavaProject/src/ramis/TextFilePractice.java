package ramis;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFilePractice {

    public static void main(String[] args) throws FileNotFoundException {

        String loanID = "1710";
        String fileName = "returnFile" + loanID + ".txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        PrintWriter pw = new PrintWriter(fos);

        String firstRow = "LBCejhgacyu1g371g27g18y2er81724861428612498164781te2781t2863816742t142813";

        pw.println("12312ensi1ugd2y1ufjd6712teg182uegd1762uyge12e12rd12e1d31");
        pw.println(firstRow);
        pw.close();


    }
}
