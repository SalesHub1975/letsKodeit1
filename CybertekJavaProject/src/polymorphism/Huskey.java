package polymorphism;

public class Huskey extends Dog implements Trainable {


    int age = 10;

    @Override
    public void makeNoise(){
        System.out.println("Huskey is barking");
    }

    @Override
    public void sit() {
        System.out.println("Huskey is sitting");
    }

    @Override
    public void bring(String item) {
        System.out.println("Huskey is bringing " + item);
    }
}
