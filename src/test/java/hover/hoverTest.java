package hover;

import base.BaseTests;
import org.testng.annotations.Test;

public class hoverTest extends BaseTests {
    @Test
    public void hoverTest(){
        var HoverPage =homepage.clickHoverPage();
        HoverPage.getElements();
    }
}
