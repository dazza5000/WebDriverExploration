package com.whereisdarran.webdriver.chapter1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {
    public static void main(String... args) {
      WebDriver driver = new FirefoxDriver();
      driver.get("file:///home/daz/Downloads/WebDriver/8850OS_Code/Chapter%202/HTML/Selectable.html");
      WebElement three = driver.findElement(By.name("three"));
      System.out.println("X coordinate: "+three.getLocation().getX()+
      		  " Y coordinate: " +three.getLocation().getY());
      Actions builder = new Actions(driver);
      builder.moveByOffset(three.getLocation().getX()+1, three.getLocation().getY()+1);
      builder.perform();
      }
   }



