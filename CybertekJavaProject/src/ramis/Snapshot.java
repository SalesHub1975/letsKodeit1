package ramis;

import java.util.ArrayList;

public class Snapshot {


    private ArrayList<Integer> data;

    ArrayList<Integer> arr;
    ArrayList<Integer> arr2;

    public Snapshot(ArrayList<Integer>data) {
        arr = new ArrayList<>();
        for (int i=0; i<data.size(); i++) {
            arr.add(data.get(i));
        }
        this.data = arr;
    }

    public ArrayList<Integer> restore(){

        arr2 = new ArrayList<>();
        for(int i = 0; i < this.data.size(); i++){
            arr2.add(data.get(i));
        }

            return arr2;

//        int[] arr2 = new int[data.size()];
//        ArrayList<Integer>arr3 = new ArrayList<>();
//        for (int i=0; i<data.size(); i++) {
//            arr2[i]=data.get(i);
//        }
//
//        for (int i=0; i<arr2.length; i++) {
//            arr3.add(arr2[i]);
//        }
//        return arr3;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        Snapshot snap = new Snapshot(list);

        list.set(1, 3);
        list.add(4);
        list = snap.restore();
        System.out.println(list);
        list.add(4);
        list=snap.restore();
        System.out.println(list);
    }

}
