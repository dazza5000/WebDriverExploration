package com.whereisdarran.webdriver.chapter9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by daz on 1/28/16.
 */
public class TestAddNewPostUsingPageObjects {
    public static void main(String... args){
        WebDriver driver = new FirefoxDriver();
        AdminLoginPageUsingLoadableComponent loginPage= new AdminLoginPageUsingLoadableComponent(driver).get();
        AllPostsPage allPostsPage = loginPage.login();
        allPostsPage.createANewPost("Creating New Post using PageObjects",
                "Its good to use PageObjects");
    }
}