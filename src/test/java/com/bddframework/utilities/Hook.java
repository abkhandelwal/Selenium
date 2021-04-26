package com.bddframework.utilities;

import com.bddframework.pageObject.BaseClass;
import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;


//import cucumber.api.java.After;
//import cucumber.api.java.Before;




public class Hook extends BaseClass implements En {

    Hook(){
        Before(1, () -> {
            // Do something before each scenario
            System.out.println("This is before");
        });
        ;

        After( (Scenario scenario) -> {
            System.out.println("This is after test");
        });
    }



    //    public void setUp(){
//        initialization();
//        System.out.println("Before test");
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//        System.out.println("After test");
//    }


}
