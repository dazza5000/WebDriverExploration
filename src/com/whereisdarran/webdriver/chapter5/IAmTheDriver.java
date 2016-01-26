package com.whereisdarran.webdriver.chapter5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by darrankelinske on 1/25/16.
 */
public class IAmTheDriver {
    public static void main(String... args){
        WebDriver driver = new FirefoxDriver();

        EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
        IAmTheEventListener eventListener = new IAmTheEventListener();
        eventFiringDriver.register(eventListener);

        eventFiringDriver.get("http://www.google.com");
        eventFiringDriver.get("http://www.facebook.com");
        eventFiringDriver.navigate().back();

    }
}