import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogout() {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLogin();
        loginPage.login("sanoxisooba@gmail.com", "SanoxUganda");

        // Perform logout
        mainPage.logout();

        // Verify logout success
        assertTrue("User successfully logged out", loginPage.isLoginPage());
    }
}

