package com.whereisdarran.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;

public class WhereIsDarran {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.whereisdarran.com");
		WebElement searchToggle = driver.findElement(By.className("search-toggle"));
		searchToggle.click();
		WebElement searchField = driver.findElement(By.name("s"));
		searchField.sendKeys("7272wil");
		searchField.sendKeys(Keys.RETURN);
		WebElement searchResult = driver.findElement(By.className("entry-date"));
		System.out.println(searchResult.getText());
		System.out.println(String.valueOf("MAY 30, 2009").equalsIgnoreCase(searchResult.getText()));
		
		WebElement musicProductionLink = driver.findElement(By.linkText("MUSIC PRODUCTION"));
		musicProductionLink.click();
		WebElement exploringSynthesizer = driver.findElement(By.xpath("//*[@id='post-8581']/header/h1"));
		exploringSynthesizer.click();
		
		
	}

}
