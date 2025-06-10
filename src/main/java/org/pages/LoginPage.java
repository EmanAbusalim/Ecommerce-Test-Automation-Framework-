package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
  //constructor to get the driver from the test

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //web elements in the login page
    public void login(String user){
        String password=driver.findElement(By.xpath("//div[@data-test='login-password']")).getText();
        String [] text=password.split(":");
        String s=text[1].trim();
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(s);
        System.out.println(password);
        driver.findElement(By.id("login-button")).click();









    }










}
