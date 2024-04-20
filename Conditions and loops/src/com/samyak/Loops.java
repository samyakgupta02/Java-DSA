package com.samyak;

public class Loops {
    public static void main(String[] args) {
        // print numbers from 1 to 5

        System.out.println(1);
        System.out.println(2);
        // and so on... but this is not an efficient way.

        /*
        syntax of for loop

        for(initialisation; condition; increment/decrement){
            //body
            }
         */

        //q: print numbers from 1 to 5
        for (int num=1;num<=5;num ++){
            System.out.print(num);
        }



        //while loops
        /*
        syntax:
        while(condition){
        //body
            }
            */

        int num=1;
        while(num<=5){
            System.out.println(num);
            num= num+1;
        }

        // do while loops
        /*
        Syntax:
        do{

       } while(condition);

         */

        int n=1;
        do{
            System.out.println(n);
            n++;
        } while(n<=5);

        //in do while loop the loop will execute ateast once.

    }
}
