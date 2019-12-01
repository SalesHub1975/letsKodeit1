package oca;

public class Creditcard {

    public static void main(String[] args) {

        System.out.println(mask("1234-1234-3456-3562"));




    }

    public static String mask(String creditcard){
        String x = "XXXX-XXXX-XXXX-";
//        StringBuilder sb = new StringBuilder(creditcard);
//        sb.substring(15,19);
//        return x + sb;

        return x + creditcard.substring(15,19); //correct

//        StringBuilder sb = new StringBuilder(x);  correct
//        sb.append(creditcard, 15, 19);
//        return sb.toString();

//        StringBuilder sb = new StringBuilder(creditcard);
//        StringBuilder s = sb.insert(0,x);
//        return s.toString();



    }
}
