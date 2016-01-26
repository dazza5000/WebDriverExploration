package com.whereisdarran.webdriver.chapter6;

import org.openqa.selenium.io.FileHandler;

/**
 * Created by darrankelinske on 1/26/16.
 */
public class IsZipped {
    public static void main(String... args){
        System.out.println(FileHandler.isZipped("/Users/darrankelinske/source/WebDriverExploration/destinationDirectory.zip"));
    }
}