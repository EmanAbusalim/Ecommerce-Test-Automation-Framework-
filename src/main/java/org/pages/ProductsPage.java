package org.pages;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver=driver;
    }
public void add(){

    WebElement e= driver.findElement(By.xpath("//img[@data-test='inventory-item-sauce-labs-backpack-img']"));
    e.click();

    }







}
