package com.whereisdarran.webdriver.chapter9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.List;

/**
 * Created by daz on 1/28/16.
 */
public class AddNewPostPage extends LoadableComponent<AddNewPostPage> {
    WebDriver driver;
    @FindBy(how=How.ID, using="content_ifr")
    WebElement newPostContentFrame;
    @FindBy(how=How.ID, using="tinymce")
    WebElement newPostContentBody;
    @FindBy(how=How.ID, using="title")
    WebElement newPostTitle;
    @FindBy(how=How.ID, using="publish")
    WebElement newPostPublish;
    public AddNewPostPage(WebDriver driver){
        this.driver = driver;
        System.out.println(driver.getCurrentUrl());
    }
    public void addNewPost(String title, String descContent){
//        List<WebElement> frames = driver.findElements(By.tagName("iFrame"));
//
//        for(WebElement frame : frames) {
//            System.out.println("Found the following frame" + frame.getTagName() + " " + frame.getAttribute("id"));
//        }
        driver.switchTo().frame(newPostContentFrame);
        newPostContentBody.sendKeys(descContent);
        driver.switchTo().defaultContent();
        newPostTitle.click();
        newPostTitle.sendKeys(title);
        newPostPublish.click();
    }

    @Override
    protected void load() {
        System.out.println("load() was called");
    }
    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue(driver.getCurrentUrl().contains("post-new"));
    }
}
