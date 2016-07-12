import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends Page{

    public BasketPage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(xpath = "//div[contains(@class, 'float-r')]/button[contains(@class, 'btn-checkout')]")
    public WebElement continueOrderButton;

    public boolean isContinueOrderButtonDisplayed(){
        return continueOrderButton.isDisplayed();
    }

}
