package base;

import com.aventstack.extentreports.App;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class BaseTest {
    WebDriver driver = null;
    WebDriverWait wait;
    @BeforeClass
    public void setup(String browser) throws MalformedURLException {
        browser = System.getProperty("browser","chrome");

        if (browser.contains("chrome")) {
            ChromeOptions coptions = new ChromeOptions();
        }
        else if (browser.contains("firefox")){
            FirefoxOptions foptions = new FirefoxOptions();
        }
        PageDriver.setDriver(driver);
    }
}
