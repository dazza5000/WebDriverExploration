package com.whereisdarran.webdriver.chapter6;

import org.openqa.selenium.io.FileHandler;

import java.io.File;

/**
 * Created by darrankelinske on 1/26/16.
 */
public class DeleteFileOrDirectory {
    public static void main(String... args){
        FileHandler.delete(new File("/Users/darrankelinske/source/WebDriverExploration/newDirectory"));
    }
}