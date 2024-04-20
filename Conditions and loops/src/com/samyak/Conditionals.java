package com.samyak;

public class Conditionals{

    public static void main(String[] args) {
        /*
            syntax of if statement:
            if(boolean expressioms T or F){
                //Body
            } else {
                //do this
            }
         */

        int salary = 90000;
//        if(salary > 10000){
//            salary = salary + 2000;
//
//        }else{
//            salary = salary  +1000;
//        }
//        System.out.println(salary);

        //multiple if else statement

        if (salary > 10000 && salary < 20000){
            salary = salary + 2000;

        }else if (salary >= 20000){
            salary = salary + 3000;

        } else{
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}