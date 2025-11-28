package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        ClickLink("Ajax Form Submit");
        return  new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        ClickLink("Select Dropdown List");
        return new DropDownPage(driver);
    }
    public HoverPage clickHoverPage(){
        ClickLink("Hover Demo");
        return new HoverPage(driver);
    }
    public KeysPage clickKeysPage(){
        ClickLink("Key Press");
        return new KeysPage(driver);
    }
    private void ClickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
