package listener;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;
import webDriver.WebDriverFactory;


public class OnFailure extends TestListenerAdapter {

    WebDriver webDriver;




    @Step("Hi, I'm step in your testng listener")
    @Override
    public void onTestFailure(ITestResult tr) {
        createAttachment();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] createAttachment() {
        byte[] scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES);
        return scrFile;
    }
}
