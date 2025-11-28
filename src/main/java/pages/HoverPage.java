package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;
    By hoverElement = By.className("container");
    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }
    public void getElements(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(hoverElement)).perform();
    }

}
