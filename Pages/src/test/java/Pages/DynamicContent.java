package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContent {

    public static String url = "http://localhost:7080/dynamic_content";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement dynamicContent = driver.findElement(By.xpath("//*[contains(@class,'row')]"));
        dynamicContent.getText();
        System.out.println();

        driver.quit();
    }
}
