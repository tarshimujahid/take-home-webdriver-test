package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static String url = "http://localhost:7080/dropdown";
@Test

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");

        driver.quit();
    }
}
