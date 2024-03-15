package com.cydeo.tests.HWP.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_ZeroBankHeader {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //WebElement headerText=driver.findElement(By.xpath("//h3"));
       WebElement headerText=driver.findElement(By.cssSelector("h3"));
        String expectedHeaderText="Log in to ZeroBank";
        String actualHeaderText=headerText.getText();
        if(actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text verification: Passed");
        }else {
            System.out.println("Header text verification: Failed");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
/*
HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */