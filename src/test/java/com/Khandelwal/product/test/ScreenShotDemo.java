package com.Khandelwal.product.test;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShotDemo {


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
    public void testScreen() throws IOException {

        TakesScreenshot scrShot =((TakesScreenshot) driver);
        File srcFile=scrShot.getScreenshotAs(OutputType.FILE);

        String directory = System.getProperty("user.dir") + "//screenshot//";

        FileUtils.copyFile(srcFile, new File( directory +"xyz"));

    }


    @After
    public void tearDown(){
        driver.quit();
    }
}


