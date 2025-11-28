package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeysPage {
    WebDriver driver;
    By inputFiled = By.id("my_field");
    By result = By.id("result");
    public KeysPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterText(String text, Keys backSpace){
        driver.findElement(inputFiled).sendKeys(text);
    }
    public void enterPI(){
        enterText(Keys.chord(Keys.ALT, "p")+"=3.14", Keys.BACK_SPACE);
    }
    public String getResultText(){
        return driver.findElement(result).getText();
    }


}
