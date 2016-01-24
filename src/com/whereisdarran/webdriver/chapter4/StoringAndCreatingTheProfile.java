package com.whereisdarran.webdriver.chapter4;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.IOException;

/**
 * Created by daz on 1/23/16.
 */
public class StoringAndCreatingTheProfile {

    public static void main(String... args){
        FirefoxProfile profile = new FirefoxProfile();
        String json="";
        try {
            profile.addExtension(new File("/home/daz/Desktop/firebug-2.0.13-fx.xpi"));
            json = profile.toJson();
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            FirefoxDriver driver = new FirefoxDriver(FirefoxProfile.fromJson(json));
            driver.get("http://www.google.com");
            System.out.println("We have the following title: "+driver.getTitle());
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}