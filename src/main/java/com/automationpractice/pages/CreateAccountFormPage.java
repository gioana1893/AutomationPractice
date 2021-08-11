package com.automationpractice.pages;


import com.automationpractice.util.webdriver.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class CreateAccountFormPage {

  @FindBy(id = "customer_firstname")
  private WebElement firstNameInput;

  @FindBy(id = "customer_lastname")
  private WebElement lastNameInput;

  @FindBy(id = "email")
  private WebElement emailInput;

  @FindBy(id = "passwd")
  private WebElement passwordInput;

  @FindBy(id = "days")
  private WebElement selectDaysDropdown;

  @FindBy(id = "months")
  private WebElement selectMonthDropdown;

  @FindBy(id = "years")
  private WebElement selectYearDropdown;

  @FindBy(id = "firstname")
  private WebElement firstNameAddress;

  @FindBy(id = "lastname")
  private WebElement lastNameAddress;

  @FindBy(id = "address1")
  private WebElement addressInput;

  @FindBy(id = "city")
  private WebElement cityInput;

  @FindBy(id = "id_state")
  private WebElement stateDropdown;

  @FindBy(id = "postcode")
  private WebElement zipPostalCodeInput;

  @FindBy(id = "id_country")
  private WebElement countryDropdown;

  @FindBy(id = "phone_mobile")
  private WebElement mobilePhoneInput;

  @FindBy(id = "alias")
  private WebElement aliasInput;

  @FindBy(id = "submitAccount")
  private WebElement registerButton;


  public CreateAccountFormPage () {

    PageFactory.initElements(WebDriverUtil.getWebdriver(), this);
  }


  public WebElement getFirstNameInput () {

    return firstNameInput;
  }


  public WebElement getLastNameInput () {

    return lastNameInput;
  }


  public WebElement getEmailInput () {

    return emailInput;
  }


  public WebElement getPasswordInput () {

    return passwordInput;
  }


  public Select getSelectDaysDropdown () {

    return new Select(selectDaysDropdown);
  }


  public Select getSelectMonthDropdown () {

    return new Select(selectMonthDropdown);
  }


  public Select getSelectYearDropdown () {

    return new Select(selectYearDropdown);
  }


  public WebElement getFirstNameAddress () {

    return firstNameAddress;
  }


  public WebElement getLastNameAddress () {

    return lastNameAddress;
  }


  public WebElement getAddressInput () {

    return addressInput;
  }


  public WebElement getCityInput () {

    return cityInput;
  }


  public Select getStateDropdown () {

    return new Select(stateDropdown);
  }


  public WebElement getZipPostalCodeInput () {

    return zipPostalCodeInput;
  }


  public Select getCountryDropdown () {

    return new Select(countryDropdown);
  }


  public WebElement getMobilePhoneInput () {

    return mobilePhoneInput;
  }


  public WebElement getAliasInput () {

    return aliasInput;
  }


  public WebElement getRegisterButton () {

    return registerButton;
  }


  public void fillAccountForm (List<String> formData) {

    getFirstNameInput().clear();
    getFirstNameInput().sendKeys(formData.get(0));

    getLastNameInput().clear();
    getLastNameInput().sendKeys(formData.get(1));

    getPasswordInput().clear();
    getPasswordInput().sendKeys(formData.get(2));

    getSelectDaysDropdown().selectByValue(formData.get(3));
    getSelectMonthDropdown().selectByValue(formData.get(4));
    getSelectYearDropdown().selectByValue(formData.get(5));

    getFirstNameAddress().clear();
    getFirstNameAddress().sendKeys(formData.get(6));

    getLastNameAddress().clear();
    getLastNameAddress().sendKeys(formData.get(7));

    getAddressInput().clear();
    getAddressInput().sendKeys(formData.get(8));

    getCityInput().clear();
    getCityInput().sendKeys(formData.get(9));

    getStateDropdown().selectByVisibleText(formData.get(10));
    getZipPostalCodeInput().clear();
    getZipPostalCodeInput().sendKeys(formData.get(11));

    getCountryDropdown().selectByVisibleText(formData.get(12));

    getMobilePhoneInput().clear();
    getMobilePhoneInput().sendKeys(formData.get(13));

    getAliasInput().clear();
    getAliasInput().sendKeys(formData.get(14));

  }


}
