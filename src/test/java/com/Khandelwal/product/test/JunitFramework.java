package com.Khandelwal.product.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JunitFramework {

    WebDriver driver;

    @Before
    public void setup(){
        String BaseURl = "https://letskodeit.teachable.com/";
         driver = new ChromeDriver();

        driver.manage().window().maximize(); //for maximizin the screen
        driver.get(BaseURl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void testScreen(){

    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
