package org.pages;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

import static helpermethods.Wait.customWait;

public class ProductsPage {
    WebDriver driver;
    private WebElement cartLink;
    private String removeText;
    public ProductsPage(WebDriver driver){
        this.driver=driver;
    }
public void addBag(){
        // WebElement e= driver.findElement(By.xpath("//img[@data-test='inventory-item-sauce-labs-backpack-img']"));e.click();
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
customWait(driver,1) ;
removeText  = driver.findElement(By.id("remove-sauce-labs-backpack")).getText();

}
    public void addbikeLight(){
        // WebElement e= driver.findElement(By.xpath("//img[@data-test='inventory-item-sauce-labs-backpack-img']"));e.click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        customWait(driver,1) ;
        removeText=driver.findElement(By.id("remove-sauce-labs-bike-light")).getText();

    }

    public String getRemoveText() {

        return removeText.trim().toLowerCase();
    }
    public CartPage goToCart(){
        driver.findElement(By.cssSelector("a[class*='shopping']")).click();
        return new CartPage(driver);
    }







}
