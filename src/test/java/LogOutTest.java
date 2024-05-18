import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;

public class LogoutTest {
    private WebDriver driver;
    private static final String BASE_URL = "https://www.root-me.org";

    @Before
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
       // options.setCapability("browserVersion", "latest");
       // options.setCapability("platformName", "LINUX");
        driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        driver.get(BASE_URL + "https://www.root-me.org/?page=news&lang=en");
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("sanoxisooba@gmail.com", "SanoxUganda");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testLogout() {
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();

        // Verify logout success
        assertTrue("Logout was not successful", logoutPage.isLogoutPage());
        assertTrue("Login was not successful", logoutPage.getSuccess().contains("the root is long but the way is free"));
    }
}
