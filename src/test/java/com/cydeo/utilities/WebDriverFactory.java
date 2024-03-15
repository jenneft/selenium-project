package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {
        if(browserType.equalsIgnoreCase("chrome")) {
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriver driver2= new FirefoxDriver();
            return driver2;
        }else {
            System.out.println("Browser not supported");
            return null;
        }
    }
}
