package com.dsa.OopsProgram;

public class CopyConstructor {
    public static void main(String[] args) {
        Std s1 = new Std();
        //  Std s2 = new Std("Vijay");
        //  Std s3 = new Std(123);
        s1.name = "Vijay";
        s1.Roll = 123;
        s1.Pass = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        Std s2 = new Std(s1);
        s2.Pass = " XyZA";

        System.out.println(s2.Pass + " " + s2.name + " " + s2.Roll + " ");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Std {
    String name;
    int Roll;
    String Pass;
    int marks[];

    // Shallow copy constructor
    //Std(Std s1) {
     //   marks = new int[3];
     //   this.name = s1.name;
     //   this.Roll = s1.Roll;
    //  this.marks = s1.marks;
    //}
    // Deep Copy constructor
      Std(Std s1){
        marks = new int[3];
        this.name = s1.name;
        this.Roll = s1.Roll;
        for (int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }

      }

    Std() {
        marks = new int[3];
        System.out.println("Conccccc...");
    }

    Std(String name) {
        marks = new int[3];
        this.name = name;
    }

    Std(int Roll) {
        marks = new int[3];
        this.Roll = Roll;
    }
}

