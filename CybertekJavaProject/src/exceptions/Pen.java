package exceptions;

import java.util.Scanner;

public class Pen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word:");
        String s = input.nextLine();
        String ss = null;
        try {
            System.out.println(s.charAt(7));
            System.out.println(ss.length());
            System.out.println(s.charAt(7));
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid word");
        }catch(NullPointerException e){
            System.out.println("ss is pointing to a null");
        }
        System.out.println("End of Program");

    }
}
