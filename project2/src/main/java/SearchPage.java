import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.concurrent.TimeUnit;

public class SearchPage extends Page{

    public SearchPage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(xpath = "//div[@class = 'product-in']/a[@class = 'img-block']")
    public WebElement flower;

    @Step("Click on flower")
    public FlowerPage clickOnFlower(){
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("img-responsive")));
        flower.click();
        return PageFactory.initElements(webDriver, FlowerPage.class);
    }

}
