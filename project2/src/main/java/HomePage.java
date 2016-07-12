import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends Page{

    public HomePage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(id = "search")
    public WebElement searchField;

    @FindBy(xpath = "//div[@class = 'login-block']/div[1]/a[contains(text(),'Логин')]")
    public WebElement loginButton;

//    @FindBy(xpath = "//div[@class = 'login-block']/div[1]/a[contains(text(),'Выход')]")
//    private WebElement logoutButton;

    @Step("Fill text in search field ")
    public SearchPage fillText(String flower){
        searchField.sendKeys(flower);
        searchField.sendKeys(Keys.ENTER);
        return PageFactory.initElements(webDriver, SearchPage.class);
    }

    @Step("Click on login button")
    public LoginPage clickLoginButton(){
        loginButton.click();
        return PageFactory.initElements(webDriver, LoginPage.class);
    }

//    @Step("Click on logout button")
//    public HomePage clickLogoutButton(){
//        logoutButton.click();
//        return PageFactory.initElements(webDriver, HomePage.class);
//    }

}
