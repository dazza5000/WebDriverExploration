package com.whereisdarran.webdriver.chapter3b;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class TakesScreenShotExample{
	
	  public static void main(String... args) {
		  
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.packtpub.com/");
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(scrFile.getAbsolutePath());
	  }
	}