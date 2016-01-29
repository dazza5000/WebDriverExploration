package com.whereisdarran.webdriver.chapter9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by daz on 1/29/16.
 */
public class TestPostsCountUsingPageObjects {
    public static void main(String... args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_2.2\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        AdminLoginPageUsingLoadableComponent loginPage= new AdminLoginPageUsingLoadableComponent(driver).get();
        AllPostsPage allPostsPage = loginPage.login();
        System.out.println(allPostsPage.getAllPostsCount());
    }
}
