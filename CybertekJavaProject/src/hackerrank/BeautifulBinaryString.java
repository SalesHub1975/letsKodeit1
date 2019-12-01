package hackerrank;

public class BeautifulBinaryString {

    public static void main(String[] args) {

        String b = "1110011110001100010100000011011101100001101010001111101101000010111111001110110000010110010011100010";

        int counter = 0;
        String start = "";
        String end = "";
        String first = "";

        if (b.indexOf("010") == -1) {
            counter = 0;
        } else {
            for (int i = 3; i < b.length() + 1; i++) {
                start = b.substring(i - 3, i);
                end = b.substring(i);
                if (start.equals("010")) {
                    first = b.substring(0, i - 3);
                    b = first + "011" + end;
                    counter++;
                    i = 3;
                }
            }
        }


        System.out.println(counter);


    }
}
