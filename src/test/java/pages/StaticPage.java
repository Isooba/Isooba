import org.openqa.selenium.WebDriver;

public class StaticPage extends BasePage {

    public StaticPage(WebDriver driver) {
        super(driver);
    }

    public boolean isStaticPageLoaded() {
        // Implement check if static page is loaded
        return true;
    }
}

