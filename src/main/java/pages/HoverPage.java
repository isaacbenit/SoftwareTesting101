package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoverPage {
    WebDriver driver;
    By hoverElement = By.xpath("//div[@class = 's__column m-15']");
    By textMessage = By.xpath("//p[text()='Hover']");
    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }
    public void hoverOnImage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(hoverElement)).perform();
    }
    public String getText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textMessage)));
       return driver.findElement(textMessage).getText();
    }

}
