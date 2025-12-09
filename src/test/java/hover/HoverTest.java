package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HoverTest extends BaseTests {
    @Test
    public void hoverTest(){
        var HoverPage =homepage.clickHoverPage();
        HoverPage.hoverOnImage();
        assertEquals(HoverPage.getText(),"Hover");
    }
}
