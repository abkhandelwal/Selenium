package com.Khandelwal.product.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeTest {


    public static void main(String[] args) {

        //Since we have set the property of webdriver.chrome.driver in environment so w can comment the below line
        // System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
        // String  BaseURl = "http://www.letskodeit.com";
        // String  BaseURl = "https://letskodeit.com/automationpractice/";

        //String  BaseURl ="https://letskodeit.teachable.com/p/practice";
        String BaseURl = "https://letskodeit.teachable.com/";
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //for maximizin the screen
        driver.get(BaseURl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //Find by ID
        //driver.findElement(By.id("menu-item-1450")).clear();
        //Find by Classname
        // driver.findElement(By.className("search-field")).sendKeys("table");
        // Find by xpath
        //   driver.findElement( By.xpath("//input[@id ='name']")).sendKeys("Abhishek");
        //input[@id ='alertbtn']

//        driver.findElement( By.xpath("//input[@id ='alertbtn']")).click();

        //Find by link text

//     driver.findElement(By.linkText("Open Tab")).click();

        //Find by partial link text
        //driver.findElement(By.partialLinkText("Open ")).click();

        //Find by css selector
/*
      # for id
      . for class

*/
//        driver.findElement(By.cssSelector(".btn-style.class1.class2")).click();

        // driver.findElement(By.cssSelector("fieldset>#opentab")).click();


        //Advance Xpath
        //driver.findElement(By.xpath("//div[@id='navbar']/div/div/div/ul/li[2]/a")).click();
        //Find the price of the cource  "Python Programming Language"


        //https://dhtmlx.com/docs/products/dhtmlxGrid/
        //div[@class='dhx_grid_data']/div//div[text()='Social Media app']/..//following-sibling::div[@dhx_col_id='owner']/div


        //


    }
}
