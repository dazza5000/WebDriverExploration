package com.whereisdarran.webdriver.chapter6;

import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

/**
 * Created by darrankelinske on 1/26/16.
 */
public class CanExecute {
    public static void main(String... args){
        try {
            System.out.println(FileHandler.canExecute(new File("/Users/darrankelinske/source/WebDriverExploration/sourceDirectory/file1")));
            FileHandler.makeExecutable(new File("/Users/darrankelinske/source/WebDriverExploration/sourceDirectory/file1"));
            System.out.println(FileHandler.canExecute(new File("/Users/darrankelinske/source/WebDriverExploration/sourceDirectory/file1")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
