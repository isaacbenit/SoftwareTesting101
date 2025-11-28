package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTests {
@Test
    public  void AlertTest()
    {
        var alertPage = homepage.clickAlert();
        alertPage.getAlert(0);
        assertEquals(alertPage.getAlertTest(),"I am an alert box!");
        alertPage.submitAlert();
    }
    @Test
    public  void AlertTest2()
    {
        var alertPage = homepage.clickAlert();
        alertPage.getAlert(1);
        alertPage.cancelAlert();
        assertEquals(alertPage.getAlertMessage(),"You pressed Cancel!");
    }
}

