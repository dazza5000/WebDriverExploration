package com.whereisdarran.webdriver.chapter4;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.IOException;

/**
 * Created by daz on 1/23/16.
 */
public class FrozenPreferences {
    public static void main(String... args){
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.shell.checkDefaultBrowser", true);

        FirefoxDriver driver = new FirefoxDriver(profile);
        driver.get("http://www.google.com");

    }
}