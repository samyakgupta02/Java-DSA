package com.Samyak;
public class Main {
    public static void main(String[] args) {
        //Q: store a roll number
        int a =19;

        //q: store a persons name
        String name = "samyak";

        //Q: store 500 roll numbers, this cannot be done one by one. so we need to use arrays

        //Syntax
        //datatype[] variable_name = new datatype[size];
        //Q: store 5 roll numbers
 //       int[] roll = new int[5];
        //or directly
 //       int[] roll2 = {12,34,35,76,22};

        //All the elements in an array should have same data type.

        int []ros;
        ros = new int [5];
        System.out.println(ros[1]); //by default all the values in integer array are zero 0 .


        String[] arr;
        arr = new String[4];
        System.out.println(arr[0]); //here null is displayed, which means that there is nothing in the array. this is different fro zero.




    }
}