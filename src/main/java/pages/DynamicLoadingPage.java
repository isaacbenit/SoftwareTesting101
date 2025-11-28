package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingPage {
    WebDriver driver;
    By loadRandomUserbutton = By.id("save");
    By randomuser = By.id("loading");
    DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public void StartLoading(){
        driver.findElement(loadRandomUserbutton).click();
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(randomuser));
    }


}
