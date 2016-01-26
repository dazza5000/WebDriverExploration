package com.whereisdarran.webdriver.chapter6;

import org.openqa.selenium.io.TemporaryFilesystem;

import java.io.File;

/**
 * Created by darrankelinske on 1/26/16.
 */
public class ChangeTmpFS {
    public static void main(String... args) {
        TemporaryFilesystem tmpFS = TemporaryFilesystem.getTmpFsBasedOn(new File("/Users/darrankelinske/source/WebDriverExploration/"));
        File f = tmpFS.createTempDir("prefix1", "suffix1");
        System.out.println(f.getAbsolutePath());
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
