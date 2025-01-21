package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FirstSeleniumTest {
    public static void main(String[] args) {
        // Укажите путь к WebDriver (для ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win32\\chromedriver.exe");

        // Инициализация драйвера
        WebDriver driver = new ChromeDriver();

        try {
            // Открытие страницы Google
            driver.get("https://www.google.com");

            // Поиск элемента ввода
            WebElement searchBox = driver.findElement(By.name("q"));

            // Ввод текста в поисковую строку
            searchBox.sendKeys("Selenium WebDriver");

            // Отправка формы
            searchBox.submit();

            // Ожидание и вывод заголовка страницы
            Thread.sleep(2000); // В реальных тестах используйте WebDriverWait вместо Thread.sleep
            System.out.println("Title of the page: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрытие браузера
            driver.quit();
        }
    }
}