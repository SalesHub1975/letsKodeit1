package myWorkSpace;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class GetAge {

    public static void main(String[] args) {

        String DOB = "1/10/2000";
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = LocalDate.parse(DOB, formatter);

        Period p = Period.between(date, today);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());

    }
}
