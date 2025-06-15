package BaseTest;

import org.pages.LoginPage;
import org.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{
    ProductsPage p;
    @Test
    public void test(){
         p=new ProductsPage(driver);
        p.add();
    }
    @Test
    public void validateButtonText(){
       Assert.assertEquals(p.getRemoveText(),"Remove");
    }
    @BeforeMethod
    public void  loginFirst(){
        LoginPage l= new LoginPage(driver);
        l.login("standard_user");
    }
}
