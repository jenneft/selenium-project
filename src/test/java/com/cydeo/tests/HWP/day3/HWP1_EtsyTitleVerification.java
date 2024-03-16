package com.cydeo.tests.HWP.day3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP1_EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //2- Go to: https://www.etsy.com
        driver.get("https://www.etsy.com/");

        //3- Search for “wooden spoon”
        WebElement etsySearchBox=driver.findElement(By.id("global-enhancements-search-query"));
        etsySearchBox.sendKeys("wooden spoon");
        etsySearchBox.sendKeys(Keys.ENTER);

        //4- Verify title: Expected: “Wooden spoon - Etsy”
        String expectedTitle="Wooden spoon - Etsy";
        String actualTitle=driver.getTitle();
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification: Passed");
        }else{
            System.out.println("Title verification: Failed");
        }

        Thread.sleep(2000);
        driver.quit();




    }
}
/*
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy”
 */