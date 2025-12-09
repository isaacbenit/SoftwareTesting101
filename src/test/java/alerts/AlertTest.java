package alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTests {

@Test
    public  void AlertTest()
    {
        var alertPage = homepage.clickAlert();
        alertPage.getAlert(0);
        assertEquals(alertPage.getAlertTest(),"I am an alert box!");
        alertPage.testAlertAccept();
    }
    @Test
    public  void AlertTest2()
    {
        var alertPage = homepage.clickAlert();
        alertPage.getAlert(1);
        alertPage.testAlertCancel();
        assertEquals(alertPage.getAlertMessage(),"You pressed Cancel!");
    }
}

