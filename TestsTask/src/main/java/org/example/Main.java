package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = in.nextInt();
        System.out.println("Введите второе число:");
        int num2 = in.nextInt();
        int res = num1 + num2;
        System.out.println("Результат = " + res);
    }
    
    public static int Sum(int a, int b) {
        return a + b;
    }
}