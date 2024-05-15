import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginFormTest extends BaseTest {

    @Test
    public void testLoginForm() {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLogin();
        loginPage.login("sanoxisooba@gmail.com", "SanoxUganda");

        // Verify login success
        assertEquals("Expected Title After Login", "Successfully Logged in", driver.getTitle());
    }
}





    
    
              
       

        
