package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FormFilling {
    public static void main(String[] args) {
        // Замените 'url' на URL вашей формы
        String url = "https://airsoftsports.ru";

        // Инициализируйте драйвер Chrome
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Перейдите на страницу формы
        driver.get(url);

        // Найдите поля формы
        // Ожидаем переход по ссылке
        WebDriverWait waitReg = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement regInput = waitReg.until(ExpectedConditions.elementToBeClickable(By.className("register-icon")));
        regInput.click();
        
        // Введите имя пользователя
        WebElement userName = driver.findElement(By.name("name"));
        userName.sendKeys("Георгий");

        // Введите почту пользователя
        WebElement userEmail = driver.findElement(By.name("email"));
        userEmail.sendKeys("malina.tester@gmail.com");

        // Ожидаем доступность поля
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Ввод номера телефона
        WebElement phoneInput = wait.until(ExpectedConditions.elementToBeClickable(By.name("phone")));

        // Очистка и ввод телефона с учетом маски
        Actions actions = new Actions(driver);
        phoneInput.click();
        actions.sendKeys("9999999999").perform();

        // Введите пароль
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Password152");

        // Подтвердите пароль
        WebElement confirmPasswordInput = driver.findElement(By.id("is_password"));
        confirmPasswordInput.sendKeys("Password152");

        // Нажмите кнопку регистрации
        WebElement registrationButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.className("register_button"))
        );
        registrationButton.click();
    }
}