package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Test");
        list.add("Сергей");
        list.add("Admin");

        Collections.sort(list);
        System.out.println("Отсортированный список: " + list);
    }
}