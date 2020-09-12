package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static String url = "http://localhost:7080/drag_and_drop";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement draggable = driver.findElement(By.id("column-a"));
        WebElement droppable = driver.findElement(By.id("column-b"));
        Actions action = new Actions(driver);
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

        driver.quit();
    }
}
