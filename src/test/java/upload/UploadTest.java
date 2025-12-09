package upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadTest extends BaseTests {
    @Test
    public void UploadTest(){
        var uploadPage=homepage.clickfileUpload();
        uploadPage.uploadFile("C:\\Users\\HP-\\IdeaProjects\\TestingGate1\\resources\\images\\wallpaper1.jpg");
        assertEquals(uploadPage.getInputMessage(),"File Successfully Uploaded");
    }
}
