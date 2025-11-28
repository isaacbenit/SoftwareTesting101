package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    WebDriver driver;
    By alertButton = By.xpath("//button[text()='Click Me']");
    By alertMessage = By.id("confirm-demo");
    AlertPage(WebDriver driver){
        this.driver=driver;
    }
    public void getAlert(int index){
        driver.findElements(alertButton).get(index).click();
    }
    public String getAlertTest(){
        return driver.switchTo().alert().getText();
    }
    public void submitAlert(){
        driver.switchTo().alert().accept();
    }
    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getAlertMessage(){
        return driver.findElement(alertMessage).getText();
    }

}
