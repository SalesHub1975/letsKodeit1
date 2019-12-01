package ramis;

public class FancyNumber {

    public static void main(String[] args) {
        String number = "32348348530";
        String doubleSpace = "  ";
        String num = number + doubleSpace;

       outer: for(int i = 0; i < num.length(); i++){
            int count = 0;
            char c = num.charAt(i);
            if(c == num.charAt(i+1) && c == num.charAt(i+2)){
                System.out.println("Number contains three consecutive num");

            }else if(c+1 == num.charAt(i+1) && c+2 == num.charAt(i+2)){
                System.out.println("Three consecutive digits in increasing fashion");

            }else if(c-1 == num.charAt(i+1) && c-2 == num.charAt(i+2)){
                System.out.println("Three consecutive digits in decreasing fashion");

            }else{
                for(int j = 0; j < num.length(); j++){
                    if(num.charAt(i) == num.charAt(j)){
                        count++;
                    }
                    if(count >= 4){
                        System.out.println("A single digit occurs 4 or more times");
                        break outer;
                    }
                }
            }
            System.out.println("Number is not fancy");
        }




    }
}
