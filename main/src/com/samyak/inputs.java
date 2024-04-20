package com.samyak;

import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter some numbers");
        int rollno= input.nextInt();
        System.out.println("your rollno is:" +rollno);

       String name = input.nextLine();
        System.out.println(name);



    }
}
