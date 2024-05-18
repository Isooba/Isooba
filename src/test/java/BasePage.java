import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private By acceptCookieButton = By.xpath("//button[@id='onetrust-accept-btn-handler']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        
        try{
            waitAndReturnElement(acceptCookieButton).click();
        } catch (NoSuchElementException e) {
            // skip it
        } catch (TimeoutException e) {
            // skip it
        } 
    }

    protected WebElement waitAndReturnElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
