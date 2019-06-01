package com.TestDevWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestWeb {
private static WebDriver browser = null;
public void setDriverPath(String path) {
	System.setProperty("webdriver.chrome.driver", path);
}
public static void setBrowser(String browserNane) {
	if(browserNane.contains("chrome"))
			browser = new ChromeDriver();
	else if(browserNane.contains("firefox"))
		browser = new FirefoxDriver();
	else if(browserNane.contains("safari"))
		browser = new SafariDriver();
	else if(browserNane.contains("internet explorer"))
		browser = new InternetExplorerDriver();
}
public static WebDriver getBrowser() {
	return browser;
}
public void openPage(String url) {
	browser.get(url);
}
public void maximizeWindowSize() {
	browser.manage().window().maximize();
}
public void click(String locatorType , String locatorValue) {	
	if(locatorType.equalsIgnoreCase("id"))
		browser.findElement(By.id(locatorValue));
	else if(locatorType.equalsIgnoreCase("xpath"))
		browser.findElement(By.xpath(locatorValue)).click();
}
public void enterText(String locatorType , String locatorValue) {	
	if(locatorType.equalsIgnoreCase("id"))
		browser.findElement(By.id(locatorValue));
	else if(locatorType.equalsIgnoreCase("xpath"))
		browser.findElement(By.xpath(locatorValue)).click();
}
public void switchToWindow(String title) {
	
}
}
