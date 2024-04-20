package com.Samyak;

import java.util.Scanner;

public class Petya_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //this can be done directly or we can convert lower case to upper case by doing -32 and then comparing the strings.
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();
        int result = str1.compareTo(str2); //compareTo is here used to compare the two strings. 

        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}
