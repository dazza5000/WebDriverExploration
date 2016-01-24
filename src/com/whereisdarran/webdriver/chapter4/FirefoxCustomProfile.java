package com.whereisdarran.webdriver.chapter4;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * Created by daz on 1/23/16.
 */
public class FirefoxCustomProfile {

    public static void main(String... args){
        FirefoxProfile profile = new FirefoxProfile();

        FirefoxDriver driver = new FirefoxDriver(profile);
        driver.get("http://www.google.com");
    }
}