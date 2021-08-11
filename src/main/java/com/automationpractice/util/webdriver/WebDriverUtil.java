package com.automationpractice.util.webdriver;


import com.automationpractice.config.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;


public class WebDriverUtil {

  private static WebDriver webdriver;

  private static WebDriverWait webDriverWait = null;


  static void setChromeWebDriverProperty () {

    System.setProperty(
        "webdriver.chrome.driver",
        System.getProperty("user.dir") + "/driver/chromedriver.exe"
    );
  }


  static void setFirefoxWebDriverProperty () {

    System.setProperty(
        "webdriver.gecko.driver",
        System.getProperty("user.dir") + "/driver/geckodriver.exe"
    );
  }


  public static ChromeOptions getChromeOptions () {

    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<>();
    prefs.put("credentials_enable_service", false);
    prefs.put("profile.password_manager_enabled", false);
    options.setExperimentalOption("prefs", prefs);

    return options;
  }


  public static WebDriver getWebdriver () {

    return webdriver;
  }


  public static void openChromeBrowser () {

    setChromeWebDriverProperty();
    webdriver = new ChromeDriver();
    webdriver.manage().window().maximize();

  }


  public static void openFirefoxDriver () {

    setFirefoxWebDriverProperty();
    webdriver = new FirefoxDriver();
    webdriver.manage().window().maximize();
  }


  public static void navigateTo (String url) {

    webdriver.get(url);
  }


  public static void closeDriver () {

    if (getWebdriver() != null) {
      getWebdriver().close();
      webdriver = null;
    }
  }


  public static void quitDriver () {

    if (getWebdriver() != null) {
      getWebdriver().manage().deleteAllCookies();
      getWebdriver().quit();
      webdriver = null;
    }
  }


  public static WebDriverWait getWaitDriver () {

    if (webDriverWait == null) {
      webDriverWait = new WebDriverWait(getWebdriver(), Constants.TIMEOUT);
    }

    return webDriverWait;
  }

  public static void waitForElementNotToBePresent (WebElement element) {

    getWaitDriver().until(ExpectedConditions.invisibilityOf(element));
  }


  public static void waitForPresenceOfElement (WebElement element) {

    getWaitDriver().until(ExpectedConditions.visibilityOf(element));
  }


  public static void waitForElementToBeClickable (WebElement element) {

    getWaitDriver().until(ExpectedConditions.elementToBeClickable(element));
  }


}
