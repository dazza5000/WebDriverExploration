package com.whereisdarran.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	
	public static void main (String... args)
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///home/daz/Downloads/WebDriver/8850OS_Code/Chapter%202/HTML/ContextClick.html");
	WebElement contextMenu = driver.findElement(By.id("div-context"));
	Actions builder = new Actions(driver);
	builder.contextClick(contextMenu)
	.click(driver.findElement(By.name("Item 4")))
	.perform();
	}

}
