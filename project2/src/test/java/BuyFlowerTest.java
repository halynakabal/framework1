import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

public class BuyFlowerTest extends  TestBase{

    @Title("Buy flower in Florium")
    @Test(dataProvider = "floriumUser2")
    public void buyFlowerWithLogin(String login, String password){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.fillLogin(login);
        loginPage.fillPassword(password);
        AccountPage accountPage = loginPage.clickSendButton();
        Assert.assertTrue(accountPage.personInfo.getText().contains("test"));
        SearchPage searchPage = homePage.fillText("pion");
        FlowerPage flowerPage = searchPage.clickOnFlower();
        Assert.assertTrue(flowerPage.isBuyButtonDisplayed(), "Buy button is not displayed");
        flowerPage.clickOnBuyButton();
        Assert.assertTrue(flowerPage.isOrderButtonDisplayed(), "Order button is not displayed");
        BasketPage basketPage = flowerPage.clickOnOrderButton();
//        Assert.assertTrue(basketPage.isContinueOrderButtonDisplayed(), "Continue order button is not displayed");
    }
}
