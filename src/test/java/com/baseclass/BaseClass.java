package com.baseclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

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
	
	public static void dropDown(WebElement ele,String text) {
		
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public static void screenShot(String loc) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File dest = tk.getScreenshotAs(OutputType.FILE);
		File sor=new File(loc);
		FileUtils.copyFile(dest, dest);
	}
	
	public static void frameID(int id) {
		driver.switchTo().frame(id);
	}
	
	public static void frameString(String text) {
		driver.switchTo().frame(text);
	}
	
	public static void ddfmWrite(String loc,String sheet, int row,int cell,String input) throws IOException {
		File f=new File(loc);
		FileOutputStream fout=new FileOutputStream(f);
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet(sheet);
		Row r = s.createRow(row);
		org.apache.poi.ss.usermodel.Cell c = r.createCell(cell);
		c.setCellValue(input);
		w.write(fout);
	}
	
	
	
	
}
