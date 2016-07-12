import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.concurrent.TimeUnit;

public class Steps extends TestBase{

//    WebDriver webDriver;
//
//    public Steps(WebDriver webDriver){
//        this.webDriver = webDriver;
//    }


//    @Step("Fill field Login: \"{0}\" and Password: \"{1}\"")
//    public void loginToFlorium(String login, String password){
//        homePage = PageFactory.initElements(webDriver, HomePage.class);
//        LoginPage loginPage = homePage.clickLoginButton();
//        loginPage.fillLogin(login);
//        loginPage.fillPassword(password);
//        loginPage.clickSendButton();
//        AccountPage accountPage = PageFactory.initElements(webDriver, AccountPage.class);
//        Assert.assertTrue(accountPage.personInfo.getText().contains("test"));
//        accountPage.returnOnHomePage();

//    }

//    @Step("Search flower in florium")
//    public void searchFlower(String flower){
//        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
//        SearchPage searchPage = homePage.fillText(flower);
//        FlowerPage flowerPage = searchPage.clickOnFlower();
//        ResultFlowerPage resultFlowerPage = flowerPage.clickOnResultFlower("rose-sympathy-2.png");
//        Assert.assertTrue(resultFlowerPage.nameFlower.getText().contains("Роза"));
//    }

//    @Step("Buy flower in florium")
//    public void buyFlower(String flower){
////        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
//        SearchPage searchPage = homePage.fillText(flower);
//        FlowerPage flowerPage = searchPage.clickOnFlower();
//        flowerPage.clickOnBuyButton();
//        flowerPage.clickOnCloseOrderWindow();
//        flowerPage.clickOnBascetButton();
//        BasketPage basketPage = PageFactory.initElements(webDriver, BasketPage.class);
//        Assert.assertTrue(basketPage.priceFlower.getText().contains("53,95"));
//    }

//    @Step("Fail search flower in florium")
//    public void failSearchFlower(String flower){
//        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
//        SearchPage searchPage = homePage.fillText(flower);
//        FlowerPage flowerPage = searchPage.clickOnFlower();
//        String currentFlowerName = flowerPage.nameFlower.getText();
//        String expectedFlowerName = "Гиацинт";
//        Assert.assertEquals(currentFlowerName, expectedFlowerName, String.format("Expected flower name '%s', but found '%s'", currentFlowerName, expectedFlowerName));
//    }
}
