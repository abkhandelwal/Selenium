package com.Khandelwal.product.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderDemo {

    WebDriver driver;

    @Before
    public void setup(){
        String BaseURl = "https://www.expedia.com/";
        driver = new ChromeDriver();

        driver.manage().window().maximize(); //for maximizin the screen
        driver.get(BaseURl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //@Test
    public void testCase1(){

        driver.findElement(By.xpath("//span[text()= \"Flights\"]")).click();
        //div[@class='uitk-date-picker date-picker-menu']//div[1]//table[1]
        //div[@class='uitk-date-picker-menu-months-container']//div[2]//table[1]
        //button[@aria-label='Apr 30, 2021.']
        //button[@aria-label='May 26, 2021.']
//span[text()= "Done"]
        //button[@id= "d1-btn"]
        driver.findElement(By.xpath("//button[@id= \"d1-btn\"]")).click();
        driver.findElement(By.xpath("//button[@aria-label='Apr 30, 2021.']")).click();
        driver.findElement(By.xpath("//button[@aria-label='May 26, 2021.']")).click();
        driver.findElement(By.xpath("//span[text()= \"Done\"]")).click();


    }


    @Test
    public void testCase2(){

        driver.findElement(By.xpath("//span[text()= \"Flights\"]")).click();
        //div[@class='uitk-date-picker date-picker-menu']//div[1]//table[1]
        //div[@class='uitk-date-picker-menu-months-container']//div[2]//table[1]
        //button[@aria-label='Apr 30, 2021.']
        //button[@aria-label='May 26, 2021.']
//span[text()= "Done"]
        //button[@id= "d1-btn"]
        driver.findElement(By.xpath("//button[@id= \"d1-btn\"]")).click();
        WebElement startDate = driver.findElement(By.xpath("//div[@class='uitk-date-picker date-picker-menu']//div[1]//table[1]"));
        List<WebElement> dates =startDate.findElements(By.tagName("button"));

        for(WebElement date :dates){
            System.out.println(date);
            if(date.findElement(By.xpath("//button[@data-day]")).equals("21")){
                System.out.println("Successsss");
            }



        }


        driver.findElement(By.xpath("//button[@aria-label='May 26, 2021.']")).click();
        driver.findElement(By.xpath("//span[text()= \"Done\"]")).click();

    }


    @After
    public void teardown(){
        driver.quit();
    }
}
