package oca;

public class A2 {

    char c;
    boolean b;
    float f;
    void printAll(){
        System.out.println("c " + c);
        System.out.println("b " + b);
        System.out.println("f " + f);
    }

    public static void main(String[] args) {
        A2 a = new A2();
        a.printAll();
    }

}
