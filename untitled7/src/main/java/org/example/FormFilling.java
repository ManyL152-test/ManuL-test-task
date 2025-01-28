package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FormFilling {
    public static void main(String[] args) {
        // Замените 'url' на URL вашей формы
        String url = "https://airsoftsports.ru/auth/register/";

        // Инициализируйте драйвер Chrome
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Перейдите на страницу формы
        driver.get(url);

        // Найдите поля формы
        // Введите имя пользователя
        WebElement UserName = driver.findElement(By.name("name"));
        UserName.sendKeys("Георгий");

        // Введите почту пользователя
        WebElement UserEmail = driver.findElement(By.name("email"));
        UserEmail.sendKeys("malina.tester@gmail.com");

        // Ввод номера телефона, хуй знает как этому говно коду объяснить хули тут не так (ожидание нахуй тут не надо)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement phoneInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("phone")));

        WebElement UserPhoneNum = driver.findElement(By.name("phone"));
        UserPhoneNum.sendKeys("9999999999");

        // Введите пароль
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Password152");

        // Подтвердите пароль
        WebElement confirmPasswordInput = driver.findElement(By.id("is_password"));
        confirmPasswordInput.sendKeys("Password152");

        // Нажмите кнопку регистрации
        // внести данные, я хуй знает как...
    }
}