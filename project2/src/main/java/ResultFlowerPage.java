import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;
import sikuli.SikuliImageRecognition;

public class ResultFlowerPage extends Page{

    public ResultFlowerPage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(xpath = "//div[contains(@class,'product-info')]/form[@id = 'product_addtocart_form']/h1")
    public WebElement nameFlower;

    public String getNameFlower(){
        new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
        return nameFlower.getText();
    }
}
