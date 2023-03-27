package com.dsa.OopsProgram;

import java.awt.desktop.SystemSleepEvent;

public class Polymorphism {
    public static void main(String[] args) {
        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 6));
        System.out.println(calc.sum((float) 5.5, (float) 6.6));
        System.out.println(calc.sum(5, 6, 5));

        // Method Overloading
        Deer d = new Deer();
        d.eat();


    }
}

// Method Overloading
class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding

class Animal1 {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer {
    void eat() {
        System.out.println("eats grass");
    }
}