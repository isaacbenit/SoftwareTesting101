package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Homepage;

public class BaseTests {
    WebDriver driver;
    protected Homepage homepage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP-\\IdeaProjects\\TestingGate1\\resources\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        homepage = new Homepage(driver);


    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://www.lambdatest.com/selenium-playground/");
        homepage = new Homepage(driver);
        }

}
