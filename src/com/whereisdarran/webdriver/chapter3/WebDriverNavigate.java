package com.whereisdarran.webdriver.chapter3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class WebDriverNavigate{
	
	  public static void main(String... args) {
		  
		  	WebDriver driver = new FirefoxDriver();
		    driver.navigate().to("http://www.google.com");
		    
		    WebElement searchBox = driver.findElement(By.name("q"));
		    searchBox.sendKeys("Selenium WebDriver");
		    WebElement searchButton = driver.findElement(By.name("btnG"));
		    searchButton.click();
		    searchBox.clear();
		    searchBox.sendKeys("Packt Publishing");
		    searchButton.click();

		    driver.navigate().back();
		    driver.navigate().forward();
		    driver.navigate().refresh();
	  }
	}