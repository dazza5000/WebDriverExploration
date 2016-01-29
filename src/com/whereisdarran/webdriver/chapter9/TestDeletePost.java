package com.whereisdarran.webdriver.chapter9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by daz on 1/28/16.
 */
public class TestDeletePost {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        // Login to Admin portal
        AdminLoginPageUsingLoadableComponent loginPage= new AdminLoginPageUsingLoadableComponent(driver).get();
        loginPage.login();
        // Go to a All Posts page
        driver.get("http://whereisdarran.com/wp-admin/edit.php");
        // Click on the post to be deleted
        WebElement post = driver.findElement(By.linkText("My First Post"));
        post.click();
        // Delete Post
        WebElement publish = driver.findElement(By.linkText("Move to Trash"));
        publish.click();
    }
}
