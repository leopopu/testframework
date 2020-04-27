package utils;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {

    public static WebDriver generateDriver(){
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        String driverurl = "http://localhost:4444/wd/hub";
        RemoteWebDriver driver = null;
        try{
            return driver = new RemoteWebDriver(new URL(driverurl), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException("No se encontro Selenium Server");
        }
    }
}