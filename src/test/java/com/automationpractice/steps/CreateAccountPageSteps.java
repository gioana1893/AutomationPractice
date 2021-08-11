package com.automationpractice.steps;


import com.automationpractice.pages.CreateAccountFormPage;
import com.automationpractice.util.webdriver.WebDriverUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;


public class CreateAccountPageSteps {

  private CreateAccountFormPage createAccountForm = new CreateAccountFormPage();


  @Given("^The user completes form with data with:$")
  public void createAccountForEmail (List<String> values) {

    WebDriverUtil.waitForPresenceOfElement(createAccountForm.getFirstNameInput());
    createAccountForm.fillAccountForm(values);
  }


  @Then("^the user submits the form$")
  public void theUserSubmitsTheForm () {

    createAccountForm.getRegisterButton().click();

  }
}
