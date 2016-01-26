package com.whereisdarran.webdriver.chapter6;

import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

/**
 * Created by darrankelinske on 1/26/16.
 */
public class ReadFileAsString {
    public static void main(String... args){
        try {
            String fileContent = FileHandler.readAsString(new File("/Users/darrankelinske/source/WebDriverExploration/sourceDirectory/file1"));
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}