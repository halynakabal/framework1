import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

public class LoginPageTest extends TestBase{

    @Title("Login to Florium")
    @Test(dataProvider = "floriumUser1")
    public void signIn(String login, String password){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.fillLogin(login);
        loginPage.fillPassword(password);
        AccountPage accountPage = loginPage.clickSendButton();
        Assert.assertTrue(accountPage.personInfo.getText().contains("test"));
    }

}
