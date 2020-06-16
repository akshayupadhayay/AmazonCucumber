package com.bigpay.BasePackage;

import com.bigpay.Utils.ConfigsReader;
import com.bigpay.Utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static WebDriver setUp() {

        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");

        if ("chrome".equals(ConfigsReader.getProperty("browser").toLowerCase())) {
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();

        } else {
            throw new RuntimeException("Browser not supported");
        }

        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.get(ConfigsReader.getProperty("url"));
        PageLaunch.initialize();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        return driver;

    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
