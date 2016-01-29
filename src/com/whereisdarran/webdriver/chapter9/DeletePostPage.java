package com.whereisdarran.webdriver.chapter9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by daz on 1/29/16.
 */
public class DeletePostPage {
    WebDriver driver;

    @FindBy(how= How.LINK_TEXT, using="Move to Trash")
    WebElement moveToTrash;

    public DeletePostPage(WebDriver driver){
        this.driver = driver;
        System.out.println(driver.getCurrentUrl());
    }

    public void delete(){
        moveToTrash.click();
    }
}
