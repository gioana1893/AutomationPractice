package com.automationpractice.steps;


import com.automationpractice.pages.HomePage;
import com.automationpractice.util.webdriver.WebDriverUtil;
import cucumber.api.java.en.Given;
import org.junit.Assert;


public class HomePageSteps {

  private HomePage homePage = new HomePage();


  @Given("^The user clicks on Sign In button$")
  public void clickOnSignIn () {

    WebDriverUtil.getWaitDriver().until(button -> homePage.getSignInButton().isDisplayed());
    Assert.assertTrue("The Sign In Button is not displayed! ", homePage.isSignInButtonDisplayed());
    homePage.clickOnSignIn();

  }

}
