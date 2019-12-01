package inputs;

import java.util.Scanner;
public class TimeCalculator {
public static void main(String[] args) {
    
    System.out.println("Welcome to my Time Caclculator!\n");
    
    int sec,minutes,hours,remainderSec,reminderMin,reminderDays,reminderWeeks,days,weeks,years;
    
    
    
    Scanner  scn = new Scanner(System.in);
    
    System.out.println("Please enter total seconds:");
    
    sec = scn.nextInt();
    minutes = sec/60;
    hours = minutes/60;
    days = hours/24;
    weeks = days/7;
    years = weeks/52;
    remainderSec = sec%60;
    reminderMin = minutes%60;
    reminderDays = hours%24;
    reminderWeeks = days%52;
    
    System.out.println(sec + "seconds converted into minutes");
    
  
    System.out.println(years + "years");
    System.out.println(weeks + "weeks");
    System.out.println(reminderWeeks + "Days");
    System.out.println(reminderDays + "Hours");
    System.out.println(remainderSec + "minutes");
    System.out.println(reminderMin + "seconds");
    
    
}
}