package ramis;

import inputs.TimeCalculator;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LibraryFine {

    public static void main(String[] args) {


        //2 7 2015
        //1 2 2014

        int d1 = 28;
        int m1 = 2;
        int y1 = 2015;
        int d2 = 15;
        int m2 = 4;
        int y2 = 2015;
        String time = "12:00 pm";

        String s1 = "" + y1 + "-" + m1 + "-" + d1 + " 12:00 PM";
        String s2 = "" + y2 + "-" + m2 + "-" + d2 + " 12:00 PM";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d h:mm a");

        LocalDateTime returnDate = LocalDateTime.parse(s1, formatter);
        LocalDateTime dueDate = LocalDateTime.parse(s2, formatter);

        Duration result = Duration.between(dueDate, returnDate);
        long days = result.getSeconds() / 3600 / 24;
        int i = (int)days;
        if(i < 0){
            i = 0;
        }

        if(y1 > y2){
            i = 10000;
            if(m1 > m2){
                i = i*2;
            }
        }else if(y2 == y1){
            if(m1 > m2){
                i = (m1-m2)*500;
            }else if(m2 == m1){
                i = i * 15;
            }else{
                i = 0;
            }
        }else{
            i = 0;
        }

        System.out.println(i);





    }
}
