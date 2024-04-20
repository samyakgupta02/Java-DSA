package com.Samyak;
import java.util.Scanner;

public class Waytoolong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                word = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
            }
            System.out.println(word);
        }

        scanner.close();
    }
}
