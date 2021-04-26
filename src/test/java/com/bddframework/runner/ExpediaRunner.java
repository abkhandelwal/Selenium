package com.bddframework.runner;

import com.bddframework.pageObject.BaseClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//Use plugin = {"pretty", "summary"}, snippets = CAMELCASE for printing ll the steps in log
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                  glue = {"com.bddframework.stepDefination", "com.bddframework.utilities"},
                  tags = "@Sanitytest",
                  publish = true,
                  monochrome = true,
                  plugin = {"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml"}
        )

public class ExpediaRunner extends BaseClass {

}
