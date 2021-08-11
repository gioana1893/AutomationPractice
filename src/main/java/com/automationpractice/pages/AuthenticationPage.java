package com.automationpractice.pages;


import com.automationpractice.util.webdriver.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AuthenticationPage {


  @FindBy(id = "email_create")
  private WebElement createEmailAdressInput;

  @FindBy(id = "SubmitCreate")
  private WebElement createAccountButton;


  public AuthenticationPage () {

    PageFactory.initElements(WebDriverUtil.getWebdriver(), this);
  }


  public WebElement getCreateEmailAdressInput () {

    return createEmailAdressInput;
  }


  public WebElement getCreateAccountButton () {

    return createAccountButton;
  }


  public void enterNewEmailAdress (String email) {

    WebDriverUtil.waitForPresenceOfElement(createEmailAdressInput);
    createEmailAdressInput.sendKeys(email);
  }


  public void clickOnCreateAccount () {

    WebDriverUtil.waitForElementToBeClickable(createAccountButton);
    createAccountButton.click();
  }

}
