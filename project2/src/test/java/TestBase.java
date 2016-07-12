import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import webDriver.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver webDriver;
    protected HomePage homePage;

    @BeforeMethod
    @Parameters({ "browser" })
    public void setup(String browser) throws Exception {
        webDriver = WebDriverFactory.getInstance(browser);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://florium.ua/");
        homePage = PageFactory.initElements(webDriver, HomePage.class);
    }

    @DataProvider
    public Object[][] floriumUser1(){
        return new Object[][]{{"florium.testmail.1@gmail.com", "floriumtestmail1"}};
    }

    @DataProvider
    public Object[][] floriumUser2(){
        return new Object[][]{{"mytestjavamail@gmail.com", "test123456789"}};
       
    }


    @AfterMethod
    public void tearDown() throws Exception {
        if (webDriver != null) {
            WebDriverFactory.killDriverInstance();
        }
    }

}
