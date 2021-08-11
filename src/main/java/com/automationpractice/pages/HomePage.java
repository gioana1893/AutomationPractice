package com.automationpractice.pages;


import com.automationpractice.util.webdriver.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

  @FindBy(css = ".login")
  private WebElement signInButton;

  public HomePage() {

    PageFactory.initElements(WebDriverUtil.getWebdriver(),this);
  }

  public WebElement getSignInButton () {
    return signInButton;
  }

  public boolean isSignInButtonDisplayed() {
    return signInButton.isDisplayed();
  }

  public void clickOnSignIn() {
    signInButton.click();
  }
}
