package ramis;

import java.util.ArrayList;

public class UpsideDownTree {

    public static void main(String[] args) {

        ArrayList<String> fName = new ArrayList<>();
        fName.add("James");
        fName.add("Adam");
        fName.add("Linus");
        fName.add("Bill");

        ArrayList<String> lName = new ArrayList<>();
        lName.add("Bond");
        lName.add("Smith");
        lName.add("Torwalds");
        lName.add("Gates");

       // System.out.println(combineNames(fName,lName));
        printTree(10);


        for(int i = 0; i < 10; i++){
            for(int j = 10-i; j > 0; j--){
                System.out.print("#");
            }
            System.out.println();
        }


    }
    public static void printTree(int rows){

        for(int i = 0; i < rows; i++){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for(int j = rows - i; j > 0; j--){
                System.out.print("# ");
            }
            System.out.println();
        }

    }
    public static ArrayList<String> combineNames(ArrayList<String> firstName, ArrayList<String> lastName){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < firstName.size(); i++){
            result.add(firstName.get(i) + " " + lastName.get(i));
        }

        return result;
    }
}

