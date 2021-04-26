package com.bddframework.pageObject;

import com.bddframework.utilities.TestUtill;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver ;
     public static Properties pro;

    public BaseClass(){
        try {

        pro = new Properties();

        FileInputStream ip = new FileInputStream(new File("C:\\Users\\HP\\IdeaProjects\\Selenium\\src\\test\\java\\com\\bddframework\\config\\config.properties"));
        pro.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void initialization(){
        String browserName  = pro.getProperty("browser");

        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICITE_WAIT, TimeUnit.SECONDS);
        driver.get(pro.getProperty("url") );
    }

}
