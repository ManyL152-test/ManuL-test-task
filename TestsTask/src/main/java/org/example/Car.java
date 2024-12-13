package org.example;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void printDescription() {
        System.out.printf("Марка: %s\nМодель: %s\nГод выпуска: %d\n", brand, model, year);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2023);
        car.printDescription();
    }
}
