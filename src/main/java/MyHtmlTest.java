import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MyHtmlTest {
    WebDriver driver;

    @BeforeMethod
    public void openMyHtml() {
        Path absolutePath = Paths.get("myHtml.html");
        String path = absolutePath.toUri().toString();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver 5");
        driver = new ChromeDriver();
        driver.get(path);
    }

    @Test
    public void tableIsDisplayed() {
        WebElement htmlTable = driver.findElement(By.xpath("//table"));
        Assert.assertTrue(htmlTable.isDisplayed());
    }

    @Test
    public void inputIsDisplayed() {
        WebElement htmlInput = driver.findElement(By.xpath("//*[@id='fname']"));
        Assert.assertTrue(htmlInput.isDisplayed());
    }

    @Test
    public void checkboxIsDisplayed() {
        WebElement htmlCheckbox = driver.findElement(By.xpath("//html/body/input"));
        Assert.assertTrue(htmlCheckbox.isDisplayed());
    }

    @Test
    public void dropDownIsDisplayed() {
        WebElement htmlDropDown = driver.findElement(By.xpath("//*[@id='cars']"));
        Assert.assertTrue(htmlDropDown.isDisplayed());
    }

    @Test
    public void imageIsDisplayed() {
        WebElement htmlImage = driver.findElement(By.xpath("/html/body/img"));
        Assert.assertTrue(htmlImage.isDisplayed());
    }

    @Test
    public void buttonIsDisplayed() {
        WebElement htmlButton = driver.findElement(By.xpath("/html/body/button"));
        Assert.assertTrue(htmlButton.isDisplayed());
    }

    @Test
    public void paragraphIsDisplayed() {
        WebElement htmlParagraph = driver.findElement(By.xpath("/html/body/p[6]"));
        Assert.assertTrue(htmlParagraph.isDisplayed());
    }

    @Test
    public void linkIsDisplayed() {
        WebElement htmlLink = driver.findElement(By.xpath("/html/body/a"));
        Assert.assertTrue(htmlLink.isDisplayed());
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
