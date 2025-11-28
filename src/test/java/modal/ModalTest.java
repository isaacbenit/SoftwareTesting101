package modal;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTest extends BaseTests {
    @Test
    public void modalTest(){
        var ModalPage = homepage.clickModalPage();
        ModalPage.clickOnModals(0);
        assertEquals(ModalPage.getModalText(),"This is the place where the content for the modal dialog displays",ModalPage.getModalText());
//        ModalPage.closeModal(2);
    }
}
