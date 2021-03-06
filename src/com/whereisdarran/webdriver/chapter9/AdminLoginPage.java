package com.whereisdarran.webdriver.chapter9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by daz on 1/28/16.
 */
public class AdminLoginPage{
    WebDriver driver;
    @FindBy(how=How.ID, using="user_login")
    WebElement email;

    @FindBy(how=How.ID, using="user_pass")
    WebElement password;

    @FindBy(how=How.ID, using="wp-submit")
    WebElement submit;


    public AdminLoginPage(WebDriver driver){
        this.driver = driver;
        driver.get("http://whereisdarran.com/wp-admin");
    }

    public AllPostsPage login(){
        email.sendKeys("testUser");
        password.sendKeys("testUser!");
        submit.click();
        return PageFactory.initElements(driver,
                AllPostsPage.class);
    }
}