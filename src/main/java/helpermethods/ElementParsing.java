package helpermethods;

import elementInterActions.BaseElements;
import elementInterActions.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ElementParsing {


    public List<BaseElements> loadFormElements(WebDriver driver){
        List<WebElement> rawElements= driver.findElements(By.className("formdata"));
        List<BaseElements> typedelements= new ArrayList<>();
     for(WebElement el:rawElements){
         String tagName= el.getText();
         if(tagName.equalsIgnoreCase("button")){
           typedelements.add(new Button(el));
         }
         else if(tagName.equalsIgnoreCase("textbox")){
             typedelements.add(new Button(el));
         }
         else if(tagName.equalsIgnoreCase("checkbox")){
             typedelements.add(new Button(el));
         }
         else if(tagName.equalsIgnoreCase("a")){
             typedelements.add(new Button(el));
         }
     }
    return typedelements;

    }






}
