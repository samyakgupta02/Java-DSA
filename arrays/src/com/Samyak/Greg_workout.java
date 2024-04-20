package com.Samyak;

import java.util.*;

public class Greg_workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] exercises = new int[n];

        for (int i = 0; i < n; i++) {
            exercises[i] = scanner.nextInt();
        }

        int[] counts = new int[3]; // to store counts for chest, biceps, and back

        for (int i = 0; i < n; i++) {
            counts[i % 3] += exercises[i];
        }

        int maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }

        String[] exerciseTypes = {"chest", "biceps", "back"};
        System.out.println(exerciseTypes[maxIndex]);

        scanner.close();
    }
}
