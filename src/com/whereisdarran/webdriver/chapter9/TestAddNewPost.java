package com.whereisdarran.webdriver.chapter9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by daz on 1/28/16.
 */
public class TestAddNewPost {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        // Login to Admin portal
        AdminLoginPageUsingLoadableComponent loginPage= new AdminLoginPageUsingLoadableComponent(driver).get();
        loginPage.login();
        // Go to AllPosts page
        driver.get("http://whereisdarran.com/wp-admin/edit.php");
        // Add New Post
        WebElement addNewPost = driver.findElement(By.linkText("Add New"));
        addNewPost.click();
        // Add New Post's Content
//        driver.switchTo().frame("content_ifr");
        WebElement postBody = driver.findElement(By.id("content"));
        postBody.sendKeys("This is description");
        driver.switchTo().defaultContent();
        WebElement title = driver.findElement(By.id("title"));
        title.click();
        title.sendKeys("My First Post");
        // Publish the Post
        WebElement publish = driver.findElement(By.id("publish"));
        publish.click();
    }
}