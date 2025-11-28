package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By inputName = By.id("title");
    By inputdescription = By.id("description");
    By submitButton = By.id("btn-submit");
    By submitmessage = By.id("submit-control");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterInputs(String name,String message){
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputdescription).sendKeys(message);

    }
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }
    public String Checkmessage(){
        return driver.findElement(submitmessage).getText();
    }


}
