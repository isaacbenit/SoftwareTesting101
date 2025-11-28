package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTests {
    @Test
    public void keysTest(){
        var KeysPage = homepage.clickKeysPage();
        KeysPage.enterText("A", Keys.BACK_SPACE);
        assertEquals(KeysPage.getResultText(), "You entered: A");
    }
    @Test
    public void testPI(){
        var KeysPage = homepage.clickKeysPage();
        KeysPage.enterPI();
    }
}
