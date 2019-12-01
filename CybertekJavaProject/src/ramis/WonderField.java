package ramis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WonderField {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {



    }

    public static void test1() {
        String targetWord = "";
        String word1 ="GARBAGE COLLECTOR";
        String[] word2 = {"[]", "[]", "[]", "[]", "[]", "[]", "[]"," ", "[]","[]","[]", "[]", "[]", "[]","[]", "[]","[]"};
//        System.out.println(word1.length());
//        System.out.println(word2.length);


        do {
            System.out.println("Please say a letter:");
            String s = sc.nextLine();

            for (int i = 0; i < word1.length(); i++) {
                targetWord = "";
                if (s.equalsIgnoreCase(word1.charAt(i) + "")) {
                    word2[i] = s;
                }
                for (int j = 0; j < word2.length; j++) {
                    targetWord += word2[j];
                    targetWord = targetWord.toUpperCase();
                }

            }
            System.out.println(targetWord);


        } while (targetWord.contains("[]"));
        System.err.println("Congratulations!!!");
    }

    public static void test2(){

            String targetWord = "";
            String word1 = "SELENIUM LOCATORS";
            String[] word2 = {"[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", " ", "[]","[]", "[]", "[]", "[]","[]", "[]","[]"};
//        System.out.println(word1.length());
//        System.out.println(word2.length);




            do {
                System.out.println("Please say a letter:");
                String s = sc.nextLine();

                for (int i = 0; i < word1.length(); i++) {
                    targetWord = "";
                    if (s.equalsIgnoreCase(word1.charAt(i) + "")) {
                        word2[i] = s;
                    }
                    for(int j = 0; j < word2.length; j++){
                        targetWord += word2[j];
                        targetWord = targetWord.toUpperCase();
                    }

                }
                System.out.println(targetWord);


            }while (targetWord.contains("[]"));
            System.err.println("Congratulations!!!");
        }
    }






