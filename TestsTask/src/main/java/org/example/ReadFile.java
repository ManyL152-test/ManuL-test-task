package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        // Создаем объект класса File для работы с файлом
        File file = new File("test 15.txt");

        if (file.exists()) {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } else {
            System.out.println("Файл не найден.");
        }
    }
}