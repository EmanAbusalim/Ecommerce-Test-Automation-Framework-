package parsingelementtest;

import elementInterActions.BaseElements;
import helpermethods.ElementParsing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
//this class is not realted to the real tests it s just for check the concept of parsing elements to its types
public class ParsingTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test() {
        ElementParsing p = new ElementParsing();
        List<BaseElements> list = p.loadFormElements(driver);
        for (BaseElements elemnt : list) {
            elemnt.interact();
        }
    }
}