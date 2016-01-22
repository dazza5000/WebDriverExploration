package com.whereisdarran.webdriver.chapter3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class WindowHandling{
	
	  public static void main(String... args) {
		  
	    WebDriver driver = new FirefoxDriver();
	    driver.get("file:///home/daz/Downloads/WebDriver/8850OS_Code/Chapter%203/HTML/Window.html");
	    String window1 = driver.getWindowHandle();
	    System.out.println("First Window Handle is: " +window1);
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(scrFile.getAbsolutePath());
	    
	    WebElement link = driver.findElement(By.linkText("Google Search"));
	    link.click();
	    
	    String window2 = driver.getWindowHandle();
	    System.out.println("Second Window Handle is: "+window2);
	    System.out.println("Number of Window Handles so far: " +driver.getWindowHandles().size());
	    
	    driver.switchTo().window(window1);
	  }
	}