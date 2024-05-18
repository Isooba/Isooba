import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameField = By.xpath("//input[@name='var_login']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//input[@class='btn submit']");
    private By successText = By.xpath("//h1[@itemprop='givenName']");

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

    public String getSuccess() {
        return waitAndReturnElement(successText).getText();
    }
}
