package ramis;

public class CloudJump {

    public static void main(String[] args) {

        int[] c = {0,0,0,1,0,0}; // 0 0 1 0 0 1 0

        int counter = 0;

        try {
            for (int i = 0; i < c.length; ) {
                if (c[i + 2] == 0) {
                    i = i + 2;
                    counter++;
                } else {
                    i = i + 1;
                    counter++;
                }
                if(i == c.length - 1){
                    break;
                }
            }

        } catch (Exception e) {
            counter++;
        }

        System.out.println(counter);
    }
}
