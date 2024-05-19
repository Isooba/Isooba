import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    private By acceptCookieButton = By.xpath("//button[@id='onetrust-accept-btn-handler']");

    protected By closeButton = By.xpath("//a[@title='close']");
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
        this.actions = new Actions(driver);
        
        try{
            waitAndReturnElement(acceptCookieButton).click();
            waitAndReturnElement(closeButton).click();
        } catch (NoSuchElementException | TimeoutException e) {
            // skip it
        } 
    }

    protected WebElement waitAndReturnElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
