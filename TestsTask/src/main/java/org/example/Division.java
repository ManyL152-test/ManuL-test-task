package org.example;
import java.util.*;

class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Деление на ноль! Пожалуйста, введите другое число.");
        } else {
            double result = num1 / num2;
            System.out.printf("Результат деления: %.2f%n", result);
        }
    }
}