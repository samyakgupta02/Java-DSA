package com.Samyak;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of friends
        int[] gifts = new int[n];

        // Reading the friends' preferences
        for (int i = 0; i < n; i++) {
            int friendIndex = scanner.nextInt();
            gifts[friendIndex - 1] = i + 1; // Friend at index friendIndex - 1 gets gift i+1
        }

        // Printing the result
        for (int i = 0; i < n; i++) {
            System.out.print(gifts[i] + " ");
        }

        scanner.close();
    }
}
