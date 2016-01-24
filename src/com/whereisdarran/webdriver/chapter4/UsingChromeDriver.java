package com.whereisdarran.webdriver.chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by daz on 1/23/16.
 */
public class UsingChromeDriver {
    public static void main(String... args){
        System.setProperty("webdriver.chrome.driver", "/home/daz/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Chrome Driver");
    }
}