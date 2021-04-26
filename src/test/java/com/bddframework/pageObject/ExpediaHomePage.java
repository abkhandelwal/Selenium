package com.bddframework.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//Page Factory type uses @FindBy
//There is action menthods as well in each page factory method
//
public class ExpediaHomePage {

    WebDriver driver;

    @FindBy(xpath = "//div[text()='Sign in']")
    public WebElement signInButton;


  // @FindBy(xpath = "//a[text()='Sign in']")
    @FindBy(xpath="//div[@class='actions']/a")
    public WebElement signInButtonNav;

   public ExpediaHomePage(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }

}
