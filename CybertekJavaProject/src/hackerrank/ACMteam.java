package hackerrank;

public class ACMteam {

    public static void main(String[] args) {

        String[] topic = {"10101", "11100", "11010", "00101"};

        int counter = 0;
        int max = 0;
        int currentHighest = 0;


        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                max = 0;
                for(int c = 0; c < topic[i].length(); c++){
                    if(topic[i].charAt(c) != '0' || topic[j].charAt(c) != '0'){
                        max++;
                    }
                }
                if(currentHighest < max){
                    currentHighest = max;
                    counter = 1;
                }else if(currentHighest == max){
                    counter++;
                }
                System.out.println(max);
            }
        }

        int [] result = new int[2];
        result [0] = currentHighest;
        result [1] = counter;


    }
}
