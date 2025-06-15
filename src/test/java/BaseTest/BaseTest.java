package BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    static WebDriver driver;
  // this line cause error because of exception handling conradict with the classes extend this clas

       // FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "Ecommerce-Test-Automation-Framework\\src\\test\\java\\Configuration\\global.properties");



    @BeforeSuite
    protected void setup(){

         driver = new ChromeDriver();
         //the next part is for preventing chrome browser from saving passwords
        ChromeOptions o=new ChromeOptions();
        Map<String,Object> setting=new HashMap<>();
        setting.put("profile.password_manager_enabled",false );
        setting.put("credentials_enable_service",false);
        o.setExperimentalOption("prefs",setting);

       //the next part is for intilaising the driver and getting the page
        driver.get("https://www.saucedemo.com/inventory.html");
        ///driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("login_logo"))));

    }









}
