package wait;

import base.BaseTests;
import org.testng.annotations.Test;

public class waitTest extends BaseTests {
    @Test
    public void waitTest()
    {
        var loadingPage = homepage.clickloading();
        loadingPage.StartLoading();
    }
}
