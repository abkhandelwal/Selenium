package com.Khandelwal.product.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.StringReader;
import java.util.concurrent.TimeUnit;

public class ActionClassDemo {

    WebDriver driver;
    JavascriptExecutor jse;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        jse = (JavascriptExecutor) driver;
        String Url = "https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(Url);


    }

    //@Test
    public void testCase1() throws InterruptedException {

       WebElement dummyText = driver.findElement(By.xpath("//h1[text()= 'Practice Page']"));

        Actions action = new Actions(driver);

        action.doubleClick(dummyText).build().perform();
        Thread.sleep(1000);
    }



    //Mouse hover example
    @Test
    public void testCase2() throws InterruptedException {

        //to Scroll the window down
        jse.executeScript("window.scrollBy(0,800)");

        WebElement mainElement = driver.findElement(By.xpath("//button[@id='mousehover']"));
          Actions action = new Actions(driver);
          action.moveToElement(mainElement).perform();
          Thread.sleep(20000);
         driver.findElement(By.xpath("//a[text()='Top']")).click();


    }


    @After
    public void teardown(){
        driver.quit();
    }


}
