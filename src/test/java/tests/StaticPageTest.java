import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class StaticPageTest extends BaseTest {

    @Test
    public void testStaticPage() {
        MainPage mainPage = new MainPage(driver);
        StaticPage staticPage = mainPage.clickStaticPage();

        // Verify static page loaded
        assertTrue("Static Page Loaded Successfully", staticPage.isStaticPageLoaded());
    }
}

