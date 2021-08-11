package com.automationpractice.tests;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    glue = "com/automationpractice/steps",
    features = "src/test/resources/AutomationPractice.feature",
    plugin = {"json:target/results/automationpractice.json"}
)
public class AutomationTest {

}
