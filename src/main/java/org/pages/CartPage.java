package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static helpermethods.Wait.customWait;

public class CartPage {
    WebDriver driver;
    By productNameLoc = By.xpath("//div[@class='inventory_item_name']");
    By removeButtonLoc=By.xpath("//button[contains(@id,'remove')]");
    By checkOutLoc=By.id("checkout");
    public CartPage(WebDriver driver){
        this.driver= driver;
    }

public void removeItem(String productName){
    List<WebElement> orders= driver.findElements(productNameLoc);
    for(WebElement order:orders){
        if(order.getText().equalsIgnoreCase(productName)){
          driver.findElement(removeButtonLoc).click();
        }}}
    public void checkout(){
        driver.findElement(checkOutLoc).click();
        customWait(driver,3);
    }}
