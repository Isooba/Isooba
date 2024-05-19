import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameField = By.xpath("//input[@name='var_login']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//input[@class='btn submit']");
    private By successText = By.xpath("//h1[@itemprop='givenName']");
    private By profileElement = By.xpath("//li[@class='has-dropdown']");
    private By logoutButton = By.xpath("//ul[@class='dropdown']//a[@class='gris']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        waitAndReturnElement(usernameField).sendKeys(username);
        waitAndReturnElement(passwordField).sendKeys(password);
        waitAndReturnElement(loginButton).click();
    }

    public boolean isLoginPage() {
        return waitAndReturnElement(usernameField).isDisplayed();
    }

    public void hoverOverProfile() {
        waitAndReturnElement(closeButton).click();
        actions.moveToElement(waitAndReturnElement(profileElement)).perform();
        waitAndReturnElement(logoutButton).click();
    }

    public String getSuccess() {
        return waitAndReturnElement(successText).getText();
    }
}

