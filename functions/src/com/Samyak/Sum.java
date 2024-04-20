package com.Samyak;

import java.util.*;
public class Sum {
    public static void main(String[] args)

    {
     // int ans =  sum2();   // "writing the name of the function"  and "brackets are used to call the function"
      //  System.out.println(ans);

       int ans = sum3(23,45);
        System.out.println(ans);
    }


    static int sum3(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

    //pass the value of numbers when you are calling the method in name
    
     //return the value
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter number 2:");
        int num2 = input.nextInt();
        int sum = num1+ num2;
        return sum;

        //once you write return it does not proceed further and come out of the function.
    }
      static void sum (){
        Scanner input = new Scanner(System.in);
          System.out.println("Enter number 1:");
          int num1 = input.nextInt();
          System.out.println("Enter number 2:");
          int num2 = input.nextInt();
          int sum = num1+ num2;
          System.out.println("the sum = " + sum);

      }
    /*
      return_type name(arguments){
     return statement;
     }

     */
}
