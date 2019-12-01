package polymorphism;

import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {

//        Flower f = new Flower("Rose");
//        f.color = "red";
        // Reference type of <f> is Flower.
        // Object type of <f> is Flower.

        Trainable huskey = new Huskey();
        huskey.sit();
        huskey.bring("Remote controller");
        ((Dog)(huskey)).bite();
        ((Animal)huskey).eat();
        Trainable d = new Huskey();
        ArrayList<Animal> animals = new ArrayList<>();

        Animal a1 = new Dog();
        Cat c = new Cat();
        animals.add(a1);
        animals.add(c);
        Huskey h = new Huskey();
        animals.add(h);

        // System.out.println(animals); will print hashcodes for objects
        System.out.println(animals.size());

        for(Animal a: animals){
            a.makeNoise();
        }






        // huskey.bite();
        // huskey.eat();
        // huskey.makeNoise();






    }

}
