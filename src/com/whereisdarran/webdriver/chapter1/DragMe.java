package com.whereisdarran.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMe {
	
	public static void main (String... args)
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///home/daz/Downloads/WebDriver/8850OS_Code/Chapter%202/HTML/DragMe.html");
	WebElement dragMe = driver.findElement(By.id("draggable"));
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(dragMe, 300, 200).perform();
	}

}
