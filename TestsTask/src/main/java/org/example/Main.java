package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        scanner.close();

        int maxValue = numbers[0];
        for (int num : numbers) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        System.out.println("Максимальное значение в массиве: " + maxValue);
    }
}