package com.whereisdarran.webdriver.chapter7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by daz on 1/27/16.
 */
public class UsingRemoteWebDriver {
    public static void main(String... args){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        RemoteWebDriver remoteWD = null;
        try {
            remoteWD = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        remoteWD.get("http://www.google.com");
        remoteWD.findElement(By.name("q")).sendKeys("Packt Publishing");
    }
}