package org.stepdefenition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pomclass.POJOClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefenitionClass extends BaseClass {
	

	@Given("User has to be there in adactin.com login page")
	public void user_has_to_be_there_in_adactin_com_login_page() {
	   launchBrowser();
	}

	@When("User has to enter UN and PW")
	public void user_has_to_enter_UN_and_PW(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    Thread.sleep(4000);
		List<String> li = dataTable.asList(String.class);
		POJOClass pojo=new POJOClass();
	    fill(pojo.getUN(), li.get(0));
	    fill(pojo.getPW(), li.get(1));
	    
	}

	@When("User has to enter login button")
	public void user_has_to_enter_login_button() {
		POJOClass pojo1=new POJOClass();
		click(pojo1.getButton());
		System.out.println("done");
	  
	}

	@Then("User has to be navigated to adactin.com home page")
	public void user_has_to_be_navigated_to_adactin_com_home_page() {
	   Assert.assertTrue("Assert passed",driver.getCurrentUrl().contains("SearchHotel"));
	}

	@When("User has to login with valid username and password")
	public void user_has_to_login_with_valid_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys("jaig4999");
	    driver.findElement(By.id("password")).sendKeys("74452Q");
	    click(driver.findElement(By.xpath("//input[@type='Submit']")));
	}

	@When("User has to fill the details asked")
	public void user_has_to_fill_the_details_asked() {
	  
		select(driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]")), "London");
		select(driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]")), "Hotel Sunshine");
		select(driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]")), "Double");
		select(driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]")), "2 - Two");
		fill(driver.findElement(By.xpath("(//input[@type='text'])[2]")), "03/06/2020");
		fill(driver.findElement(By.xpath("(//input[@type='text'])[3]")), "04/06/2020");
		select(driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]")), "2 - Two");
		select(driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]")), "0 - None");
		
	}

	@When("User has to click the search button")
	public void user_has_to_click_the_search_button() {
		POJOClass pojo0=new POJOClass();
	    click(pojo0.getSearch());
	}

	@When("User has to click the hotel which they want to select")
	public void user_has_to_click_the_hotel_which_they_want_to_select() {
	    click(driver.findElement(By.id("radiobutton_0")));
	}

	@When("User has to enter the continue button")
	public void user_has_to_enter_the_continue_button() {
	    click(driver.findElement(By.xpath("(//input[@class='reg_button'])[1]")));
	}

	@When("User has to fil the payment details")
	public void user_has_to_fil_the_payment_details(io.cucumber.datatable.DataTable dataTable) {
	  List<String> li = dataTable.asList(String.class);
		fill(driver.findElement(By.xpath("(//input[@maxlength='25'])[1]")), li.get(0));
		fill(driver.findElement(By.xpath("(//input[@maxlength='25'])[2]")), li.get(1));
		fill(driver.findElement(By.xpath("//textarea[@class='txtarea']")), li.get(2));
		fill(driver.findElement(By.xpath("//input[@maxlength='16']")), li.get(3));
		select(driver.findElement(By.id("cc_type")), "VISA");
		select(driver.findElement(By.id("cc_exp_month")), "February");
		select(driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]")), "2020");
		fill(driver.findElement(By.id("cc_cvv")), "040");
	}

	@When("User has to click the booknow button")
	public void user_has_to_click_the_booknow_button() {
	    click(driver.findElement(By.name("book_now")));
	}

	@Then("User must be able to get the Order number in hand")
	public void user_must_be_able_to_get_the_Order_number_in_hand() throws InterruptedException {
	   JavascriptExecutor jk=(JavascriptExecutor)driver;
	   Thread.sleep(6000);
	   WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
	   Object obj = jk.executeScript("return arguments[0].getAttribute('value')", ele);
	   String text=(String)obj;
	   System.out.println("Order number: "+text);
	   
	}

}
