package ramis;

public class Dinara {

    public static void main(String[] args) {

        String erica = "EHH";
        String bob = "EME";

        System.out.println(winner("EHH", "MMM"));


    }
    public static String winner(String erica, String bob){
        long startTime = System.currentTimeMillis();
        int sumErica = 0;
        int sumBob = 0;
        String result = "";

        for(int i = 0; i < 3; i++){
            if(erica.charAt(i) == 'E'){
                sumErica += 1;
            }else if(erica.charAt(i) == 'M'){
                sumErica += 3;
            }else{
                sumErica += 5;
            }

            if(bob.charAt(i) == 'E'){
                sumBob += 1;
            }else if(bob.charAt(i) == 'M'){
                sumBob += 3;
            }else{
                sumBob += 5;
            }
        }

        if(sumErica > sumBob){
            result = "Erica";
        }else if(sumBob > sumErica){
            result = "Bob";
        }
        System.out.println("The total time for execution of this method is: " +
                (System.currentTimeMillis() - startTime) + " ms");
        return result;
    }

}
