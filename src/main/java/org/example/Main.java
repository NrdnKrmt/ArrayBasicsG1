package org.example;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] results = new int[numbers.length];
        //int[] results = new int[10];

        // 1
        System.out.println("Aufgabe 1");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        // 2
        System.out.println("Aufgabe 2");
        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum: " + sum + "\n");

        //3
        System.out.println("Aufgabe 3");
        int currentMax = 0;
        for (int number : numbers) {
            if (number > currentMax) {
                currentMax = number;
            }
        }
        System.out.println("Highest number: " + currentMax + "\n");

        //4 & 5
        System.out.println("Aufgabe 4 & 5");
        for (int i = 0; i < numbers.length; i++) {
            results[i] = numbers[i] + numbers2[i];
            System.out.println(results[i]);
        }
    }
}