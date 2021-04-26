package com.Khandelwal.product.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IframeDemo {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        String Url = "https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();

        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

   // @Test
    public void TestCase1() throws InterruptedException {

        String parent = driver.getWindowHandle();
        System.out.println(parent);
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        Thread.sleep(1000);
        Set<String> allWindow = driver.getWindowHandles();
            System.out.println(allWindow);
        for(String child : allWindow ){
            if(!parent.equals(child)){
                System.out.println(child);
                driver.switchTo().window(child);
                driver.findElement(By.id("search-courses")).sendKeys("learn python");

            }
        }

        driver.switchTo().window(parent);


    }

    @Test
    public void TestCase2() throws InterruptedException {

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        driver.switchTo().frame("courses-iframe");
        driver.findElement(By.id("search-courses")).sendKeys("learn python");
        Thread.sleep(1000);

    }




    @After
    public void tearDown(){
    driver.quit();
    }


}
