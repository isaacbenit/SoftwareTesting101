package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    By inputFile = By.id("file");
    By inputmessage = By.id("error");
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void uploadFile(String path){
        driver.findElement(inputFile).sendKeys(path);
    }
    public String getInputMessage(){
        return driver.findElement(inputmessage).getText();
    }

}
