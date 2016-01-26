package com.whereisdarran.webdriver.chapter6;

import org.openqa.selenium.io.Zip;

import java.io.File;
import java.io.IOException;

/**
 * Created by darrankelinske on 1/26/16.
 */
public class ZipDir {
    public static void main(String... args){
        Zip zip = new Zip();
        try {
            zip.zip(new File("/Users/darrankelinske/source/WebDriverExploration/sourceDirectory"), new File("/Users/darrankelinske/source/WebDriverExploration/sourceDirectoryTest.zip"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
