package com.whereisdarran.webdriver.chapter9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by daz on 1/29/16.
 */
public class TestEditPostUsingPageObjects {
    public static void main(String... args){
        System.setProperty("webdriver.chrome.driver", "/home/daz/Downloads/chromedriver");
        WebDriver driver = new FirefoxDriver();
        AdminLoginPageUsingLoadableComponent loginPage= new AdminLoginPageUsingLoadableComponent(driver).get();
        AllPostsPage allPostsPage = loginPage.login();
        allPostsPage.editAPost("Creating New Post using PageObjects",
                "Editing Post using PageObjects","Test framework low maintenance");
    }
}