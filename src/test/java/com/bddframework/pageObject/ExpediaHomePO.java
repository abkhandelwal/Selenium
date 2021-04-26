package com.bddframework.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//this is without factory method
public class ExpediaHomePO extends BaseClass{


    public ExpediaHomePO() {
        super();
    }

    public  WebElement signInButton(){
         return this.driver.findElement(By.xpath("//div[text()='Sign in']"));
    }



    public  void clicksignInButton(){
        signInButton().click();
    }

    public  String getsignInText(){
        signInButton().click();
       return  this.driver.findElement(By.xpath(" //h3[text() ='You could be getting lower prices']")).getText();

    }

}
