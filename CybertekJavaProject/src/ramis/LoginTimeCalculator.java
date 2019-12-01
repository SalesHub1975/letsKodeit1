package ramis;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LoginTimeCalculator {

    public static void main(String[] args) {


     loginTime("2019-10-03 07:00 PM", "2019-10-04 05:00 AM");
    }


    //yyyy-MM-dd hh:mm a 2019-07-18 9:00 am
    public static void loginTime(String loginTime, String logoutTime) {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        LocalDateTime loginDateTime = LocalDateTime.parse(loginTime, formatter);
        LocalDateTime logoutDateTime = LocalDateTime.parse(logoutTime, formatter);


        if(!logoutDateTime.isAfter(loginDateTime) ) {
            System.out.println("Go back to future");
            return;
        }
        Duration loginDuration = Duration.between(loginDateTime, logoutDateTime);
        long hours = loginDuration.getSeconds() / 3600;
        long timeLeft = 12 - hours;
        String output = timeLeft > 0 ?
                "You have "+ timeLeft+" hour(s) left.": "Please logout.";
        System.out.println(output);

    }

}
