package com.bddframework.stepDefination;

import com.bddframework.pageObject.BaseClass;
import com.bddframework.pageObject.ExpediaHomePO;
import io.cucumber.java8.En;
import io.cucumber.java8.Scenario;

//syntax whe we are using java 8 feature of lamda expression
//Global hook is not suppoted in java 8 ... cuke has @ before and after global
public class ExpediaHome extends BaseClass implements En {

    ExpediaHomePO expediaHomePO;
    public ExpediaHome(){
        super();

        Before(1, () -> {
            // Do something before each scenario
            System.out.println("This is before");
        });
        ;

        After( (Scenario scenario) -> {
            System.out.println("This is after test");
        });

        Given(": Access the Expedia website {string}",(String var)  -> {
            // Write code here that turns the phrase above into concrete actions

            System.out.println("Step 1 java 8"+ var);

        });



        When(": Click on the {int} button", (Integer xyz) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Step 2 java 8" +xyz);

        });
         Then(": verify desired {word}", (String variable) -> {
            // Write code here that turns the phrase above into concrete actions
             System.out.println("Step 3 java 8"+ variable );
        });

    }


//    @Given("^: Access the Expedia website 2$")
//    public void _go_the_expedia_website() throws Throwable {
//        System.out.println("Step 1 of ExpediaHome");
//        expediaHomePO = new ExpediaHomePO();
//    }
//
//
//    @When("^: Click on the (.+) button$")
//    public void _click_on_the_button(String xyz) throws Throwable {
//        System.out.println("Step 2 of ExpediaHome "+ xyz);
//        expediaHomePO.clicksignInButton();
//
//    }
//
//    @Then("^: verify desired output$")
//    public void _verify_desired_output() throws Throwable {
//        System.out.println("Step 3 of ExpediaHome");
//        String expected= expediaHomePO.getsignInText();
//        Assert.assertEquals("You could be getting lower prices",expected);
//
//    }





}
