import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    LoginFormTest.class,
    UserFormTest.class,
    LogoutTest.class,
    StaticPageTest.class,
    MultiplePageTest.class,
    ComplexXPathTest.class
})
public class TestSuite {
    // This class doesn't have any code
}

