import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    private String baseurl = "http://www.google.com";

    @Test
    public void openGoogle(){
        driver.get(baseurl);
    }
}
