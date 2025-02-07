package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator mainClass = new Calculator();
        System.out.println("Result: " + mainClass.add(5, 3));
    }
}
