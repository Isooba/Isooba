import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        // options.setCapability("browserVersion", "latest");
        // options.setCapability("platformName", "LINUX");
        driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        driver.manage().window().maximize();
        driver.get("https://www.root-me.org/?page=login&lang=en");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testLoginForm() {
        LoginPage loginPage = new LoginPage(driver);

        assertTrue(loginPage.isLoginPage());

        loginPage.login("sanoxisooba@gmail.com", "SanoxUganda");

        assertTrue("Login was not successful", loginPage.getSuccess().contains("Recently"));
    }
}
