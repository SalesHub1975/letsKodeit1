package ramis;

import java.util.ArrayList;
import java.util.Arrays;

public class AlbinaTask {

    public static void main(String[] args) {

        String C = "Example";
        String S = "John Doe; Peter Benjamin Parker; David John Watson-Parker; Mary Jane Watson-Parker; " +
                "John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";

        ArrayList<String> list = new ArrayList<>();
        String result = "";
        String[] arr = S.split("; ");


        String twoName = "";
        String threeName = "";


        for(int i = 0; i < arr.length; i++){
            String [] indName = arr[i].split(" ");

            if(indName.length == 2){
                twoName = indName[0] + "." + indName[1];
                if(!list.contains(twoName)){
                    list.add(twoName);
                }else{
                    int counter = 1;
                    for(int j = 0; j < list.size(); j++){
                        if(list.get(i).contains(twoName)){
                            counter++;
                        }
                    }
                    list.add(twoName+counter);
                }
            }else if(indName.length == 3){
                threeName = indName[0] + "." + indName[2];
                if(threeName.contains("-")){
                    int index = threeName.indexOf("-"); // mary.watson-parker
                    String start = threeName.substring(0, index);
                    String end = threeName.substring(index+1,index+3);
                    threeName = start+end;
                }
                if(!list.contains(threeName)){
                    list.add(threeName);
                }else{
                    int counter = 1;
                    for(int j = 0; j < list.size(); j++){
                        if(list.get(j).contains(threeName)){
                            counter++;
                        }
                    }
                    list.add(threeName+counter);
                }
            }
        }

        for(int i = 0; i < list.size(); i++){
            result += list.get(i) + "@" + C + ".com; ";
        }

        result = result.toLowerCase();
        result = result.substring(0, result.length()-2);

        System.out.println(result);


    }
}
