package BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest {
    static WebDriver driver;
    @BeforeSuite
    protected void setup(){

         driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("login_logo"))));

    }









}
