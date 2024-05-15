import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private By footerBy = By.className("footer-block");
    private By searchBarTogglerBy = By.xpath("//a[@class='search-bar-toggler']/i");
    private By searchBarBy = By.name("search");

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.brightermonday.co.ug");
    }

    public String getFooterText() {
        return waitAndReturnElement(footerBy).getText();
    }

    public LoginPage clickLogin() {
        // Implement click login
        return new LoginPage(driver);
    }

    public FormPage clickFormPage() {
        // Implement click form page
        return new FormPage(driver);
    }

    public StaticPage clickStaticPage() {
        // Implement click static page
        return new StaticPage(driver);
    }

    public void logout() {
        // Implement logout action
    }
}

