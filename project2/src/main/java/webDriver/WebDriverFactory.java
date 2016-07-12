package webDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebDriverFactory {

    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";

    private static WebDriver webDriver;
//    private static DesiredCapabilities dc;

    private WebDriverFactory(){

    }

    public static WebDriver getInstance(String browser) throws Exception {
        if (webDriver == null) {
            if (CHROME.equals(browser)) {
                setChromeDriver();
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("test-type");
//                // set some options
//                dc = DesiredCapabilities.chrome();
//                dc.setCapability(ChromeOptions.CAPABILITY, options);

                webDriver = new ChromeDriver();

            } else if (FIREFOX.equals(browser)) {
//                FirefoxProfile fp = new FirefoxProfile();
//                dc = DesiredCapabilities.firefox();
//                dc.setCapability(FirefoxDriver.PROFILE, fp);

                webDriver = new FirefoxDriver();

            } else
                throw new Exception("Invalid browser property set in configuration file");

        }

        return webDriver;
    }

    public static void setChromeDriver() {
        String chromeBinary = "src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeBinary);
    }

    public static void killDriverInstance() throws Exception {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}
