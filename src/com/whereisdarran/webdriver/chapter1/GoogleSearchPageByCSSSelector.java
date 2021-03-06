package com.whereisdarran.webdriver.chapter1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchPageByCSSSelector {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.cssSelector("a[href*='about.html']"));
		System.out.print(searchButton.getText());
	}

}
