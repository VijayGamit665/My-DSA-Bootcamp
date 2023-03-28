package com.dsa.OopsProgram;

public class StaticKeyWord {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.Schoolname = "JMV";

        Student1 s2 = new Student1();
        System.out.println(s2.Schoolname);

        Student1 s3 = new Student1();
        s3.Schoolname = "ABC";
        System.out.println(s1.Schoolname);

    }
}

class Student1 {
    String name;
    int roll;

    static String Schoolname;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
