package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    WebDriver driver;
    By dropdown = By.id("select-demo");
    By groupOfOptions = By.id("multi-select");

    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    public void selectedFromDropdown(String value){
        Select dropDownElement = new  Select(driver.findElement(dropdown));
        dropDownElement.selectByVisibleText(value);
    }
    public List<String> getSelectedOption(){
        List<WebElement> options = findDropDownElement().getAllSelectedOptions();
        return  options.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public void getMultipleElements(){
        System.out.println(driver.findElement(groupOfOptions));
    }
    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }

}
