package org.example;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class ReadFile {
    public static void main(String[] args) throws IOException {
        // Создаем объект класса File для работы с файлом
        File fileGet = new File("test 18 Get.txt");

        if (fileGet.exists()) {
            Scanner scanner = new Scanner(fileGet);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } else {
            System.out.println("Файл не найден.");
        }
        File filePost = new File("test 18 Post.txt");

        if (filePost.exists()) {
            Scanner scanner = new Scanner(filePost);

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