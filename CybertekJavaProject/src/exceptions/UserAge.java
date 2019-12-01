package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = 0;

        try {
            age = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Entered value is not numeric");
            String s = "hi";
            try{
                System.out.println(s.charAt(5));
            }
            catch (StringIndexOutOfBoundsException ee){
                System.out.println("Not valid index of 5");
            }
        }catch (Exception e){
            System.out.println("Any other exception happened");
        }
        System.out.println("Age is: " + age);
        System.out.println("End of program");

    }
}
