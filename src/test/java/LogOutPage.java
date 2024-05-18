import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogoutPage extends BasePage {

    private By logoutHoverElement = By.xpath("//img[@class='vmiddle logo_auteur logo_6forum']");
    private By logoutButton = By.xpath("//a[@class='gris' and @href='https://www.root-me.org/?action=logout&logout=public&url=https%3A%2F%2Fwww.root-me.org%3Flang%3Dfr']");

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        // Hover over the element to reveal the logout button
        Actions actions = new Actions(driver);
        WebElement hoverElement = waitAndReturnElement(logoutHoverElement);
        actions.moveToElement(hoverElement).perform();

        // Click the logout button
        waitAndReturnElement(logoutButton).click();
    }

    public boolean isLogoutPage() {
        return driver.getCurrentUrl().contains("https://www.root-me.org/?var_hasard=20876060136648ceed254a3");
    }
}
