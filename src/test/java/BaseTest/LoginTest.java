package BaseTest;

import org.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin(){

        LoginPage l=new LoginPage(driver);
        l.login("standard_user");

    }
    


}
