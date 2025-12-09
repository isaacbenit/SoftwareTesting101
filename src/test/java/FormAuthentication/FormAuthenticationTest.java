package FormAuthentication;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FormAuthenticationTest extends BaseTests {

    @Test
    public void FormAuthenticationTest() {
       var loginPage = homepage.clickFormAuthentication();
       loginPage.enterInputs("isaac","Benit");
       loginPage.clickSubmitButton();
       assertEquals(loginPage.Checkmessage(),"Ajax Request is Processing!","wrong message");

    }

}
