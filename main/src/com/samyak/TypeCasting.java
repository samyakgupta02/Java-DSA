package com.samyak;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //typecasting
        int num = (int)(67.56f);
        System.out.println(num);

        //automatic type promotion in expressions

        int a = 257;
        byte b = (byte)(a);  //here the limit is 256 so it will give the diiference as the output.
        System.out.println(b);

    }
}
