package hackerrank;

public class StrongPassword {

    public static void main(String[] args) {


        String password = "Ab1";

        int length = 6;
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digit = "0123456789";
        String special = "!@#$%^&*()-+";

        int upperIndex = 0;
        int lowerIndex = 0;
        int digitIndex = 0;
        int specialIndex = 0;

        for(int i = 0; i < password.length(); i++){
            String s = password.charAt(i) + "";
            if(upperIndex == 0){
                if(upper.contains(s)){
                    upperIndex = 1;
                }
            }
            if(lowerIndex == 0){
                if(lower.contains(s)){
                    lowerIndex = 1;
                }
            }
            if(digitIndex == 0){
                if(digit.contains(s)){
                    digitIndex = 1;
                }
            }
            if(specialIndex == 0){
                if(special.contains(s)){
                    specialIndex = 1;
                }
            }
        }

        int mandatoryChange = 4 - upperIndex - lowerIndex - digitIndex - specialIndex;
        int l = password.length() + mandatoryChange - length;

        if(l < 0){
            mandatoryChange = (mandatoryChange - l);
        }

        System.out.println(mandatoryChange);


    }
}
