package com.automationpractice.steps;


import com.automationpractice.util.webdriver.WebDriverUtil;
import cucumber.api.java.en.Given;


public class BaseSteps {

  @Given("^The user opens (chrome|firefox) browser$")
  public void openBrowser(String browser) {
    if (browser.equals("chrome")) {
     WebDriverUtil.openChromeBrowser(); }
    else if (browser.equals("firefox")) {
      WebDriverUtil.openFirefoxDriver();
    }
  }

  @Given("^The user closes the browser$")
  public void closeBrowser() {
    WebDriverUtil.closeDriver();
    WebDriverUtil.quitDriver();
  }

  @Given(
      "^navigates to the application (.*)$")
  public void navigateTo (String url) {
      WebDriverUtil.navigateTo(url);
  }
}

