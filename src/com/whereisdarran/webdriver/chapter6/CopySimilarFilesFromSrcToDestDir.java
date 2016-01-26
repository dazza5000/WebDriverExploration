package com.whereisdarran.webdriver.chapter6;

import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

/**
 * Created by darrankelinske on 1/26/16.
 */
public class CopySimilarFilesFromSrcToDestDir {
    public static void main(String... args){
        try {
            FileHandler.copy(new File("/Users/darrankelinske/source/WebDriverExploration/sourceDirectory/"), new File("/Users/darrankelinske/source/WebDriverExploration/destinationDirectory/", ".txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
