import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserFormTest extends BaseTest {

    @Test
    public void testUserForm() {
        MainPage mainPage = new MainPage(driver);
        FormPage formPage = mainPage.clickFormPage();

        // Fill and submit the form with user details
        formPage.fillFormWithUser("Isooba Sanon", "sanoxisooba@gmail.com", "Hello, this is a test message!");
        formPage.sendForm();

        // Verify form submission success
        assertEquals("Expected Confirmation Message", "You Have Successfully Subscribed To Our Jobseeker Newsletter", formPage.getConfirmationMessage());
    }
}

