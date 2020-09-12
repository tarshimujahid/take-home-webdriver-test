package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {

    public static String url = "http://localhost:7080/upload";

@Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement fileuploadlink = driver.findElement(By.name("file"));
        //fileuploadlink.click();
        fileuploadlink.sendKeys("/Users/Tarshi/Desktop/Test.pdf");

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        driver.quit();
    }
}
