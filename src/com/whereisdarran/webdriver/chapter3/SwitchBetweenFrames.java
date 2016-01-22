package com.whereisdarran.webdriver.chapter3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class SwitchBetweenFrames{
	
	  public static void main(String... args) {
		  
		  WebDriver driver = new FirefoxDriver();
	      driver.get("file:///home/daz/Downloads/WebDriver/8850OS_Code/Chapter%203/HTML/Frames.html");

	      driver.switchTo().frame(0);
	      WebElement txt = driver.findElement(By.name("1"));
	      txt.sendKeys("I'm Frame One");

	      driver.switchTo().defaultContent();

	      driver.switchTo().frame(1);
	      txt = driver.findElement(By.name("2"));
	      txt.sendKeys("I'm Frame Two");
	  }
	}