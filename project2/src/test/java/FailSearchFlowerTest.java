import listener.OnFailure;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

public class FailSearchFlowerTest extends TestBase{

    @Title("Fail in Florium")
    @Parameters({"browser"})
    @Test(dataProvider = "floriumUser1")
    public void failSearchFlower(String login, String password){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.fillLogin(login);
        loginPage.fillPassword(password);
        AccountPage accountPage = loginPage.clickSendButton();
        Assert.assertTrue(accountPage.personInfo.getText().contains("test"));
        SearchPage searchPage = homePage.fillText("Бонсай");
        FlowerPage flowerPage = searchPage.clickOnFlower();
        ResultFlowerPage resultFlowerPage = flowerPage.clickOnSearchFlower();
//        String currentFlowerName = resultFlowerPage.nameFlower.getText();
       Assert.assertFalse(resultFlowerPage.nameFlower.getText().contains("Бонсай"));
    }
}
