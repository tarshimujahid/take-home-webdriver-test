package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static String url = "http://localhost:7080/hovers";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement mousehoverToUser1 = driver.findElement(By.xpath("//div[@class=\"figure\"][1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mousehoverToUser1);
        actions.click().build().perform();

        driver.quit();
    }
}
