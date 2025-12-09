package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalPage {
    WebDriver driver;
    By modalButton = By.xpath("//button[text()='Launch Modal']");
    By modelText = By.xpath("//p[text()='This is the place where the content for the modal dialog displays']");
    By closeButton =  By.xpath("//button[text()='Close']");
    public ModalPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnModals(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalButton)));
        driver.findElements(modalButton).get(index).click();
    }
    public String getModalText(){
        return driver.findElement(modelText).getText();
    }
    public void closeModal(int index){
        driver.findElements(closeButton).get(index).click();
    }
}
