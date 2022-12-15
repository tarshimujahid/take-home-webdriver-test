package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenue {

    public static String url = "http://localhost:7080/context_menu";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement rightclick = driver.findElement(By.id("hot-spot"));
        Actions action = new Actions(driver);
        action.contextClick(rightclick).perform();

        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

        driver.quit();
    }
}
