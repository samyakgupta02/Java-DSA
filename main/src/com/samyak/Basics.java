package com.samyak;

import java.util.Scanner;

public class Basics {
    // if you are creating a class, make sure class name is written in capital.
    //whatever variable is used in java, if it is written in capital letters, then it means that it is class.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(input.nextInt());
        System.out.println("Hello world!");
    }
}

//public means that this class can be accessed from anywhere.
//class is a group of functions or methods
//name of the file and public class name should be same.


//main function is the entry point of the java program.
//main function need to be public as it should be available to be executed from anywhere.
//static is used because we want to run this main function without creating the object of the class demo.
//void this is the return type of the function.void does not give any value.