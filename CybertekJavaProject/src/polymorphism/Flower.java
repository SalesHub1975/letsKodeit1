package polymorphism;

public class Flower {

    String name;
    String color;
    String type;

    public Flower(String name){
        this.name = name;
    }

    public void grow(){
        System.out.println(name + " is growing");
    }

    public void smell(){
        System.out.println(name + " is smelling nice");
    }

}
