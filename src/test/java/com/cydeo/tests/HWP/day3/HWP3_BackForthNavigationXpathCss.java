package com.cydeo.tests.HWP.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP3_BackForthNavigationXpathCss {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //First option: /tagName[@attribute='value']
        //3- Find gmail, Click to Gmail from top right using XPath locator.
        // WebElement gmailLink = driver.findElement(By.xpath("//a[@class='gb_H']"));
        //Second option: using the text of the webElement with XPath locator.
        // /tagName[text()='textValue'] --->tagName[.='textValue']
        //WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
        //WebElement gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));

        //3.1- Find gmail, Click to Gmail from top right using cSS selector.
        //tagName[attribute='value']
        WebElement gmailLink = driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']"));


        //4-Verify title contains: Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = gmailLink.getText();
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification: Passed");
        }else {
            System.out.println("Title verification: Failed");
        }

        gmailLink.click();

        //5- Go back to Google by using the.back();
        driver.navigate().back();

        //6- Verify title equals: Expected: Google

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if(actualGoogleTitle.equals(expectedGoogleTitle)) {
            System.out.println("Title verification: Passed");
        }else {
            System.out.println("Title verification: Failed");
        }


        Thread.sleep(2000);
        driver.quit();


    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */