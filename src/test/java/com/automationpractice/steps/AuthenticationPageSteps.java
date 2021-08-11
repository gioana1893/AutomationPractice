package com.automationpractice.steps;


import com.automationpractice.pages.AuthenticationPage;
import cucumber.api.java.en.Given;


public class AuthenticationPageSteps {

  private AuthenticationPage authenticationPage = new AuthenticationPage();


  @Given("^The user creates account with email (.*) and clicks on Submit button$")
  public void createAccountForEmail (String email)  {

    authenticationPage.enterNewEmailAdress(email);
    authenticationPage.clickOnCreateAccount();

  }
}
