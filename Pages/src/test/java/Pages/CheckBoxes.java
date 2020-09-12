package Pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

    public static String url = "http://localhost:7080/checkboxes";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);



        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        checkbox.click();

        WebElement uncheckbox = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        uncheckbox.click();


        WebElement boxischecked = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        Assert.assertEquals(true, boxischecked.isSelected());
        System.out.println("Box is checked");

        driver.quit();
    }
}
