package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFailure {

    public static String url = "http://localhost:7080/login";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmithe");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        WebElement loginbutton = driver.findElement(By.className("radius"));
        loginbutton.click();

        WebElement ErrorMessage = driver.findElement(By.id("flash"));
        Assert.assertEquals(true, ErrorMessage.isDisplayed());
        System.out.println("Error Message is displayed");

        driver.quit();
    }
}
