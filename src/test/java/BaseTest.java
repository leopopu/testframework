import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WebDriverFactory;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = WebDriverFactory.generateDriver();
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
