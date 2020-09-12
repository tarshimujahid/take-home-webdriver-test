package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptError {

    public static String url = "http://localhost:7080/javascript_error";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement errorMessage = driver.findElement(By.xpath("//title[text()='Page with JavaScript errors on load']"));
        Assert.assertEquals(false, errorMessage.isDisplayed());
        System.out.println("Error Message is displayed");

        driver.quit();
    }
}
