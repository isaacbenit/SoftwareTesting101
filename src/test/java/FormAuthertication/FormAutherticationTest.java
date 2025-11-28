package FormAuthertication;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class FormAutherticationTest extends BaseTests {

    @Test
    public void FormAutherticationTest() {
       var loginPage = homepage.clickFormAuthentication();
       loginPage.enterInputs("isaac","Benit");
       loginPage.clickSubmitButton();
       assertEquals(loginPage.Checkmessage(),"Ajax Request is Processing!","wrong message");

    }

}
