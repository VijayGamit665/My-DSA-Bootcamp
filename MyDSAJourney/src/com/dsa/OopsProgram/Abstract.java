package com.dsa.OopsProgram;

public class Abstract {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walks();
        System.out.println(h.Color);
        Chicken c = new Chicken();
        c.eat();
        c.walks();

    }
}

abstract class Animal5 {

    String Color;

    Animal5() {
        Color = "brouwn";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walks();

}

class Horse extends Animal5 {
    void changeColor() {
        Color = "Dark Brouwn";
    }

    void walks() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal5 {
    void changeColor() {
        Color = "Blue";
    }

    void walks() {
        System.out.println("walks on 4 legs");
    }
}
