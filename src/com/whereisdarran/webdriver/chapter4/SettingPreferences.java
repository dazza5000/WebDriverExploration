package com.whereisdarran.webdriver.chapter4;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.IOException;


/**
 * Created by daz on 1/23/16.
 */
public class SettingPreferences {

    public static void main(String... args){
        FirefoxProfile profile = new FirefoxProfile();

        profile.setPreference("general.useragent.override", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_0 like Mac OS X; en-us) AppleWebKit/532.9 (KHTML, like Gecko) Version/4.0.5 Mobile/8A293 Safari/6531.22.7");

        FirefoxDriver driver = new FirefoxDriver(profile);
        driver.get("http://www.google.com");
    }
}