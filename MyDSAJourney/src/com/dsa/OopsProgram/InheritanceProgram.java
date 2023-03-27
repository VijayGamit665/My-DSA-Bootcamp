package com.dsa.OopsProgram;

public class InheritanceProgram {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        Bird Mammal = new Bird();
        Mammal.fly();

    }
}

class Animal {
    String color;

    Void eat() {
        System.out.println("eat");
        return null;
    }

    void Breathe() {
        System.out.println("Breathe");
    }
}

//Single level Inheritance
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

// multi level Inheritance
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

// Hierarchial Inheritance

class Mammal1 extends Animal {
    void walk() {
        System.out.println("Walks");

    }
}

class Fish1 extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
