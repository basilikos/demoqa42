package tests.hardcode;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    @Test
    public void testElementsPage() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://demoqa.com/");
//        https://demoqa.com/elements

//        WebElement elementText = driver.findElement(By.xpath("//h5[text()='Elements']"));
//        elementText.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\".card-body\").click();");

        String urlExpectedActual = driver.getCurrentUrl();
        Assert.assertEquals(urlExpectedActual, "https://demoqa.com/elements", "url assert");
        driver.quit();
    }
}
