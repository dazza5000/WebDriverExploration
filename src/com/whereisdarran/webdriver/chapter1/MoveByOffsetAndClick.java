package com.whereisdarran.webdriver.chapter1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetAndClick {
    public static void main(String... args) {
      WebDriver driver = new FirefoxDriver();
      driver.get("file:///home/daz/Downloads/WebDriver/8850OS_Code/Chapter%202/HTML/Selectable.html");
      WebElement one = driver.findElement(By.name("one"));

      int border = 1;
      int tileWidth = 100;
      int tileHeight = 80;
      Actions builder = new Actions(driver);
      builder.moveByOffset(one.getLocation().getX()+border, one.getLocation().getY()+border).click();
      builder.build().perform();
      // Click on Eleven
      builder.moveByOffset(2*tileWidth+4*border, 2*tileHeight+4*border).click();
      builder.build().perform();
     //Click on Five
      builder.moveByOffset(-2*tileWidth-4*border,-tileHeight-2*border).click();
      builder.build().perform();
      }
   }



