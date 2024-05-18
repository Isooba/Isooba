import org.openqa.selenium.WebDriver;

public class StaticPage extends BasePage {

    public StaticPage(WebDriver driver) {
        super(driver);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
