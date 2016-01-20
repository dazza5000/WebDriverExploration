package com.whereisdarran.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main (String... args)
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///home/daz/Downloads/WebDriver/8850OS_Code/Chapter%202/HTML/DragAndDrop.html");
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement trgt = driver.findElement(By.id("droppable"));
	Actions builder = new Actions(driver);
	builder.dragAndDrop(src, trgt).perform();
	}

}
