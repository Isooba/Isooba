import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class MultiplePageTest extends BaseTest {

    private String[] pageUrls = {"url1", "url2", "url3"};

    @Test
    public void testMultiplePages() {
        MainPage mainPage = new MainPage(driver);
        for (String url : pageUrls) {
            driver.get(url);
            assertTrue("Page Loaded Successfully: " + url, driver.getTitle().contains("Expected Title"));
        }
    }
}

