package com.whereisdarran.webdriver.chapter3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class LoadCookieInfo{
	
	@SuppressWarnings("deprecation")
	public static void main(String... args){
	      WebDriver driver = new FirefoxDriver();
	      driver.get("http://www.facebook.com");
	      try{
	           File f = new File("browser.data");
	           FileReader fr = new FileReader(f);
	           BufferedReader br = new BufferedReader(fr);
	           String line;
	           while((line=br.readLine())!=null){
	               StringTokenizer str = new StringTokenizer(line,";");
	               while(str.hasMoreTokens()){
	                   String name = str.nextToken();
	                   String value = str.nextToken();
	                   String domain = str.nextToken();
	                   String path = str.nextToken();
	                   Date expiry = null;
	                   String dt;
	                   if(!(dt=str.nextToken()).equals("null")){
	                       expiry = new Date(dt);
	                   }
	                   boolean isSecure = new Boolean(str.nextToken()).booleanValue();
	                   Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
	                   driver.manage().addCookie(ck);
	               }
	           }
	           br.close();
	      }catch(Exception ex){
	           ex.printStackTrace();
	      }
	      driver.get("http://www.facebook.com");
	   }
	}