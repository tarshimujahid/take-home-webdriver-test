package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage{

    public static String url = "http://localhost:7080/login";

@Test
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        WebElement loginbutton = driver.findElement(By.className("radius"));
        loginbutton.click();

        WebElement WelcomeMessage = driver.findElement(By.xpath("//h4[@class='subheader']"));
        Assert.assertEquals(true, WelcomeMessage.isDisplayed());
        System.out.println("Welcome Message is displayed");

        driver.quit();


    }
}
