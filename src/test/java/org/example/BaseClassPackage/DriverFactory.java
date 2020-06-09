package org.example.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver, this);
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.expedia.co.uk/?pwaLob=wizard-hotel-pwa-v2");
        driver.manage().window().maximize();
    }

    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
