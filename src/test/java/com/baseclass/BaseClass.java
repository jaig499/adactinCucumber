package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jai\\eclipse-workspace\\AdactinCucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	}
	
	public static  void click(WebElement ele) {
		ele.click();
	}
	
	public static void select(WebElement ele, String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public static void fill(WebElement ele,String text) {
		ele.sendKeys(text);
	}
}
