
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class ComplexXPathTest extends BaseTest {

    @Test
    public void testComplexXPath() {
        MainPage mainPage = new MainPage(driver);
        assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='2024 BrighterMonday']"));
	assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='Popular Searches']"));
        assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='View More Experience Levels']"));
	assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='Companies Hiring']"));
	assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='Privacy Policy']"));
	assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='Skills Assessments']"));
	assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='CV Review Services']"));
	assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='Banner Rate Card']"));
	assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='Terms']"));
	assertNotNull("Element Found", mainPage.findElementsByXPath("//div//a[@href='Companies Currently hiring in Uganda']"));


	
    }
}

