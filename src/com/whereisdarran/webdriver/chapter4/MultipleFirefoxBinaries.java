package com.whereisdarran.webdriver.chapter4;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

/**
 * Created by daz on 1/23/16.
 */
public class MultipleFirefoxBinaries {
    public static void main(String... args){
        FirefoxBinary binary = new FirefoxBinary(new File("/home/daz/Desktop/firefox/firefox"));
        FirefoxProfile profile = new FirefoxProfile();

        FirefoxDriver driver = new FirefoxDriver(binary, profile);
        driver.get("http://www.google.com");
        System.out.println("Success!");
    }
}