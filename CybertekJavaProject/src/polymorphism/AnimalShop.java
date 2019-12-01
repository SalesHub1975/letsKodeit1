package polymorphism;

public class AnimalShop {

    public static void main(String[] args) {

        Animal a = new Huskey();
        // Huskey, Dog, Animal, Trainable, Object
        // Casting
        Dog d = (Dog)a;
        d.bite();

        Huskey hh = new Huskey();
        Animal aa = hh;
        aa.makeNoise();




    }
}
