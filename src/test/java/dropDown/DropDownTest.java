package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTests {

    @Test
    public void dropDownTest(){
        var dropDownPage = homepage.clickDropDown();
        String selectedOption = "Sunday";
        dropDownPage.selectedFromDropdown(selectedOption);
        dropDownPage.getSelectedOption();
        dropDownPage.getMultipleElements();
    }
}
