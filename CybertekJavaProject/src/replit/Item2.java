package replit;

import java.lang.annotation.Target;

public class Item2 extends TJMaxx{

    public static void main(String[] args) {

        Item laptop = new Item("Asus",5, 2013, 1299 );
        Item printer = new Item("sony",2,123,49.99);
        OnSaleItem mouse = new OnSaleItem("apple",1,1234,195,15);



        TJMaxx tj = new TJMaxx();
        tj.addRegularItem(printer);
        tj.addRegularItem(laptop);
        tj.addOnSaleItem(mouse);

        System.out.println(tj.getOnSaleItem("apple"));
        System.out.println(tj.getOnSaleItem("asda"));

        System.out.println(Math.round(164.5999999));



    }

}
