package polymorphism;

public class Dog extends Animal {

    @Override
    public void makeNoise(){
        System.out.println("Dog is barking");
    }

    public void bite(){
        System.out.println("Dog is biting");
    }
}
