package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver initializeDriver(String browser) {
        if (browser.equals("chrome")) {
            driver = getDriver();
        } else {
            System.out.println("Chrome is not open");
        }
        return driver;
    }

    public static synchronized WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofDays(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        return driver;
    }


}
