package com.automationpractice.util;


import java.io.IOException;
import java.util.Properties;


public class EnvironmentConfiguration {
  private Properties accountCredentials;

  private EnvironmentConfiguration() {
    try {
      accountCredentials = new Properties();
      accountCredentials.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
    } catch (IOException e) {
      throw new RuntimeException("Config properties not found", e);
    }
  }

  public static EnvironmentConfiguration getInstance() {
    return new EnvironmentConfiguration();
  }

  public String get(String key) {
    if (!accountCredentials.containsKey(key)) {
      throw new RuntimeException("Key " + key + " not found");
    }

    return accountCredentials.getProperty(key);
  }
}