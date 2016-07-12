import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPage extends Page{

    public LoginPage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(id = "login")
    public WebElement login;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "send2")
    public WebElement sendButton;

    @Step("Fill user login")
    public void fillLogin(String userLogin){
        login.sendKeys(userLogin);
    }

    @Step("Fill user password")
    public void fillPassword(String userPassword){
        password.sendKeys(userPassword);
    }

    @Step("Click on send button")
    public AccountPage clickSendButton(){
        sendButton.click();
        return PageFactory.initElements(webDriver, AccountPage.class);
    }
}
