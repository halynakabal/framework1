import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;
import sikuli.SikuliImageRecognition;


public class FlowerPage extends Page{

    public FlowerPage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(xpath = "//div[contains(@class,'no-margin-top')]/div[contains(@class,'col-lg-2')]/button[contains(@class,'button')]")
    public WebElement buyButton;

    @FindBy(xpath = "//div[@class = 'buttons-line']/a[contains(@class,'checkout')]")
    public WebElement orderButton;

    @FindBy(xpath = "//div[@class = 'ps-current']/ul/li[@class = 'elt_1']/img")
    public WebElement searchFlower;

    @Step("Click on flower from list")
    public ResultFlowerPage clickOnResultFlower(String flowerName){
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(By.tagName("img")));
        SikuliImageRecognition imageRecognition = new SikuliImageRecognition();
        imageRecognition.clickOnImage(flowerName);
        return PageFactory.initElements(webDriver, ResultFlowerPage.class);
    }

    @Step("Click on search flower")
    public ResultFlowerPage clickOnSearchFlower(){
        searchFlower.click();
        return PageFactory.initElements(webDriver, ResultFlowerPage.class);
    }

    @Step("Click on Buy Button")
    public FlowerPage clickOnBuyButton(){
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("button")));
        buyButton.click();
        return PageFactory.initElements(webDriver, FlowerPage.class);
    }

    @Step("Click on Basket Button")
    public BasketPage clickOnOrderButton(){
        orderButton.click();
        return PageFactory.initElements(webDriver, BasketPage.class);
    }

    public boolean isBuyButtonDisplayed(){
        return buyButton.isDisplayed();
    }

    public boolean isOrderButtonDisplayed(){
        return orderButton.isDisplayed();
    }
}
