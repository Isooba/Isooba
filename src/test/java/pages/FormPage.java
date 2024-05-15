import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends BasePage {

    private By formBy = By.id("form");

    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void fillFormWithUser(String name, String email, String message) {
        // Implement fill form with user details
    }

    public void sendForm() {
        // Implement send form action
    }

    public String getConfirmationMessage() {
        // Implement get confirmation message
        return "Confirmation Message";
    }
}

