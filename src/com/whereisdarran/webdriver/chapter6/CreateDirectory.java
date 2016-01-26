package com.whereisdarran.webdriver.chapter6;

import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

/**
 * Created by darrankelinske on 1/26/16.
 */
public class CreateDirectory {
    public static void main(String... args){
        try {
            FileHandler.createDir(new File("/Users/darrankelinske/source/WebDriverExploration/newDirectory"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


