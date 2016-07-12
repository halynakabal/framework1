import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import sikuli.SikuliImageRecognition;

public class AccountPage extends Page{

    public AccountPage(WebDriver webDriver){
        super(webDriver);
    }

//    @FindBy(xpath = "//div[contains(@class,'logo')]/a/img")
//    public WebElement logo;

    @FindBy(css = "ul.person-info li:first-child")
    public WebElement personInfo;

//    @Step("Return on Home Page Florium")
//    public HomePage returnOnHomePage(){
//        logo.click();
//        return PageFactory.initElements(webDriver, HomePage.class);
//    }

}
