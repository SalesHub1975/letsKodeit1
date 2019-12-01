package ramis;

public class JumpingOnTheClouds {

    public static void main(String[] args) {

    int [] c = {0,0,1,0};
    int k = 2;

    int power = 100;

    if(c[0] == 0){
        power = 99;
    }else{
        power = 97;
    }

    for(int i = k; i < c.length; i+=k){
       // System.out.println(i);
        if(c[i] == 0){
            power--;
        }else{
            power = power - 3;
        }
    }

        System.out.println(power);
    }
}
