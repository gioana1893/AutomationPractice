package com.automationpractice.util.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public enum Browser {
    FIREFOX, CHROME, IE, LOCAL_CHROME, LOCAL_FIREFOX;

    public WebDriver getDriver() {
        try {
            switch (this) {
                case LOCAL_CHROME:
                    WebDriverUtil.setChromeWebDriverProperty();
                    return new ChromeDriver(WebDriverUtil.getChromeOptions());
                case LOCAL_FIREFOX:
                    WebDriverUtil.setFirefoxWebDriverProperty();
                    return new FirefoxDriver();
                default:
                    return new RemoteWebDriver(new URL(System.getProperty("grid.hub")), getDesiredCapabilities());
            }
        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    private void setCapabilities(DesiredCapabilities desiredCapabilities) {
        switch (this) {
            case FIREFOX:
                desiredCapabilities.setBrowserName("firefox");
                break;
            case CHROME:
                desiredCapabilities.setBrowserName("chrome");
                break;
            case IE:
                desiredCapabilities.setBrowserName("internet explorer");
                break;
        }
    }

    private DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = null;

        switch (this) {
            case FIREFOX:
                desiredCapabilities = DesiredCapabilities.firefox();
                setCapabilities(desiredCapabilities);
                break;
            case CHROME:
                desiredCapabilities = DesiredCapabilities.chrome();
                desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, WebDriverUtil.getChromeOptions());
                setCapabilities(desiredCapabilities);
                break;
            case IE:
                desiredCapabilities = DesiredCapabilities.internetExplorer();
                setCapabilities(desiredCapabilities);
        }

        return desiredCapabilities;
    }
}
