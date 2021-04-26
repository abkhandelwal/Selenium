package com.Khandelwal.product.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragandDrop {

    WebDriver driver;


    @Before
    public void setup(){
        driver = new ChromeDriver();
        String Url = "https://jqueryui.com/droppable/";
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(Url);


    }


    @Test
    public void testCase2() throws InterruptedException {

        //since we have one frame so keeping the no 0
        driver.switchTo().frame(0);

        WebElement fromElement = driver.findElement(By.id("draggable"));
        WebElement toElement = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(fromElement,toElement).build().perform();
        Thread.sleep(20000);

    }

    @After
    public void teardown(){
        driver.quit();
    }
}
