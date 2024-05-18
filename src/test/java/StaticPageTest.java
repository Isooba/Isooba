import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class StaticPageTest {
    private WebDriver driver;
    private static final String BASE_URL = "https://www.root-me.org";
    private static final List<String> PAGES = Arrays.asList(
            "/en/Capture-The-Flag/",
            "/en/Challenges/",
            "/en/Community/",
            "/en/Information/"
    );
    private static final List<String> TITLES = Arrays.asList(
            "Capture The Flag",
            "Challenges",
            "Community",
            "Information"
    );

    @Before
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "latest");
        options.setCapability("platformName", "LINUX");
        driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), options);
        driver.get(BASE_URL + "?page=login&lang=en");
        
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
    public void testStaticPages() {
        StaticPage staticPage = new StaticPage(driver);
        for (int i = 0; i < PAGES.size(); i++) {
            staticPage.navigateTo(BASE_URL + PAGES.get(i));
            assertTrue("Page title does not match " + TITLES.get(i), staticPage.getPageTitle().contains(TITLES.get(i)));
        }
    }
}
