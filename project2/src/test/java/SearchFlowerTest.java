import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

public class SearchFlowerTest extends TestBase{

    @Title("Search flower in florium")
    @Test
    public void searchFlower(){
        SearchPage searchPage = homePage.fillText("Rose");
        FlowerPage flowerPage = searchPage.clickOnFlower();
        ResultFlowerPage resultFlowerPage = flowerPage.clickOnResultFlower("rose-sympathy-1.png");
        Assert.assertTrue(resultFlowerPage.nameFlower.getText().contains("Роза"));
    }

}
