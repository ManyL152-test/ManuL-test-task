package org.example;

class Animal {
    public void speak() {
        System.out.println("Animal говорит...");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Собака лает... Гав-гав!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
}