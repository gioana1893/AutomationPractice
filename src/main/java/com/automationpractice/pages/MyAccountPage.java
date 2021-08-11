package com.automationpractice.pages;


import com.automationpractice.util.webdriver.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAccountPage {

  @FindBy(css = ".info-account")
  private WebElement infoAccountMessage;


  public MyAccountPage () {

    PageFactory.initElements(WebDriverUtil.getWebdriver(), this);
  }


  public WebElement getInfoAccountMessage () {

    return infoAccountMessage;
  }

}
