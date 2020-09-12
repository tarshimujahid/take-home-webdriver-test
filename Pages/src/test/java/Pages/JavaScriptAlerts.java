package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

    public static String url = "http://localhost:7080/javascript_alerts";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement clickforJSAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        clickforJSAlert.click();
        Alert JavascriptAlert = driver.switchTo().alert();
        JavascriptAlert.accept();

        driver.quit();

    }
}