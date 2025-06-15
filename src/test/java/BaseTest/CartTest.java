package BaseTest;

import org.pages.CartPage;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
     CartPage c= new CartPage(driver);
     @Test
    public void RemoveItemTest(){
         c.removeItem("Test.allTheThings() T-Shirt (Red)");
         c.checkout();

     }





}
