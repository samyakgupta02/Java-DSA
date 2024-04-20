package com.samyak.introduction;

public class Main {
    public static  void main(String[] args) {
        Student Samyak = new Student();
        Samyak.rno= 12;
        Samyak.name= "gupta";
        Samyak.marks = 88.6f;

        System.out.println(Samyak.rno);
        System.out.println(Samyak.name);
        System.out.println(Samyak.marks);





    }
}

class Student{
    int rno;
    String name;
    float marks = 90;
}