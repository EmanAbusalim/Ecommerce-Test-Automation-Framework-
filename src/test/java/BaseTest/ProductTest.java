package BaseTest;

import org.pages.LoginPage;
import org.pages.ProductsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{
    @Test
    public void test(){
        ProductsPage p=new ProductsPage(driver);
        p.add();
    }
    @BeforeMethod
    public void  loginy(){
        LoginPage l= new LoginPage(driver);
        l.login("standard_user");
    }
}
