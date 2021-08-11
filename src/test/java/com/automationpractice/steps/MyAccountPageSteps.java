package com.automationpractice.steps;


import com.automationpractice.pages.MyAccountPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class MyAccountPageSteps {

  private MyAccountPage myAccountPage = new MyAccountPage();


  @Then("^the user account was created$")
  public void accountIsCreated () {

    Assert.assertEquals(
        "Welcome to your account. Here you can manage all of your personal information and orders.",
        myAccountPage.getInfoAccountMessage()
            .getText()
    );

  }

}
