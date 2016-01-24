package com.whereisdarran.webdriver.chapter4;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.IOException;

/**
 * Created by daz on 1/23/16.
 */
public class AddExtensionToProfile {
    public static void main(String... args){
        FirefoxProfile profile = new FirefoxProfile();

        try {
            profile.addExtension(new File("/home/daz/Desktop/firebug-2.0.13-fx.xpi"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        FirefoxDriver driver = new FirefoxDriver(profile);
    }
}
