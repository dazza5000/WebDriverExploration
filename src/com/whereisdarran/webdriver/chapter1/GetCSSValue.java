package com.whereisdarran.webdriver.chapter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCSSValue {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.name("btnK"));
		System.out.println(searchButton.getCssValue("font-family"));
		System.out.println(searchButton.getCssValue("background-color"));
		System.out.println(searchButton.getLocation());
		System.out.println(searchButton.getSize());
		System.out.println(searchButton.getText());
		System.out.println(searchButton.getTagName());
		System.out.println(searchButton.isDisplayed());
		System.out.println(searchButton.isEnabled());
		WebElement searchBox = driver.findElement(By.name("q"));
	    System.out.println(searchBox.isSelected());
	}

}
