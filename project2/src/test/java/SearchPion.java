import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import ru.yandex.qatools.allure.annotations.Title;

public class SearchPion extends TestBase{

    @Title("Search a flower in florium")
    @Test
    public void searchFlower(){
        SearchPage searchPage = homePage.fillText("пион");
        FlowerPage flowerPage = searchPage.clickOnFlower();
        ResultFlowerPage resultFlowerPage = flowerPage.clickOnResultFlower("pion-double-mix.png");
        Assert.assertTrue(resultFlowerPage.nameFlower.getText().contains("Пион"));
    }

}