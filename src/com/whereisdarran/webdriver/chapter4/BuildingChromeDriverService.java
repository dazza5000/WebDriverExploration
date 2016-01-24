package com.whereisdarran.webdriver.chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;


/**
 * Created by daz on 1/23/16.
 */
public class BuildingChromeDriverService {
    public static void main(String... args){

//Start the ChromeDriver Server
        System.setProperty("webdriver.chrome.driver", "/home/daz/Downloads/chromedriver");

        ChromeDriverService.Builder builder =  new ChromeDriverService.Builder();
        ChromeDriverService srvc = builder.usingDriverExecutable(new File("/home/daz/Downloads/chromedriver"))
                .usingPort(65423).build();
        try {
            srvc.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Execute your test-script commands
        WebDriver driver = new ChromeDriver(srvc);
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Chrome Driver");

        //Stop the Server
        driver.quit();
        srvc.stop();

    }
}