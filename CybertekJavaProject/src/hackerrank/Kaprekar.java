package hackerrank;

public class Kaprekar {

    public static void main(String[] args) {

        int p = 1000;
        int q = 1100;

        for(int i = p; i <= q; i++){
            if(i == 1){
                System.out.println(i);
            }
            if(i %  100 == 0){
                continue;
            }
            if(i == 10 || i ==20 || i ==30 || i ==40 || i ==50 || i ==60 || i ==70 || i ==80 || i ==90 ){
                continue;
            }
            int sq = i*i;
            String s = sq+"";
           // System.out.println(s);
            for(int j = 1; j < s.length(); j++){
                String first = s.substring(0, j);
                String second = s.substring(j);
                if(second.startsWith("0")){
                    while(second.startsWith("0")){
                        second = second.substring(1);
                    }
                    int c = Integer.valueOf(second);
                    if(c > 7){
                        continue;
                    }
                }
                int a = Integer.valueOf(first);
                int b = Integer.valueOf(second);
               // System.out.println(b);
                String result = (a + b) + "";
              //  System.out.println(result);
                if(Integer.valueOf(result) == i){
                    //System.out.println(sq);
                    System.out.println(i + " is kaprekar. It gives " + a + " + " + b );
                    break;
                }
            }

        }

    }
}
