package com.cydeo.tests.HWP.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP4_PracticeCydeo {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link by using CSS selector:
        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        //WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //homeLink.click();

        //3.1-Click to “Home” link by using XPath locator:
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        //driver.findElement(By.xpath("//a[.='Home']")).click();
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        Thread.sleep(2000);
        homeLink.click();

        Thread.sleep(2000);



        //4- Verify title is as expected: Expected: Practice //tagName[@attribute='value']

        String expectedTitle = "Practice";
        String actualTitle = driver.findElement(By.xpath("//h1[@class='h1']")).getText();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Title verification: Passed");
        }else {
            System.out.println("Title verification: Failed");
        }



       driver.navigate().back();

       Thread.sleep(2000);
       driver.quit();


        }

    }

/*
HWP #4: Practice Cydeo – xpath locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “xpath” locator
 */