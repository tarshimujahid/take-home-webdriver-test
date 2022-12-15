package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationMessage {

    public static String url = " http://localhost:7080/notification_message_rendered";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement clickHereButton = driver.findElement(By.xpath("//a[text()='Click here']"));
        clickHereButton.click();

        WebElement NotificationMessage = driver.findElement(By.id("flash"));
        String NotificationM = driver.getTitle();

        driver.quit();


    }

}
