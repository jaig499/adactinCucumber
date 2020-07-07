package org.stepdefenition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pomclass.POJOClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CancellingOrderStepdefenition extends BaseClass {
	
	@Given("User has to be there on adactin login page")
	public void user_has_to_be_there_on_adactin_login_page() {
		launchBrowser();
		POJOClass pom=new POJOClass();
		fill(pom.getUN(), "jaig4999");
		fill(pom.getPW(), "74452Q");
		click(pom.getButton());
	}

	@When("User has to click on Booked Itinerary")
	public void user_has_to_click_on_Booked_Itinerary() {
	    click(driver.findElement(By.xpath("//a[text()='Booked Itinerary']")));
	}
		
	@When("User has to copy and paste the order Id in search order ID")
	public void user_has_to_copy_and_paste_the_order_Id_in_search_order_ID() throws InterruptedException {
	   
		WebElement elem = driver.findElement(By.xpath("(//input[@onfocus='disable_ctrlV()'])[1]"));
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		String orderId = jk.executeScript("return arguments[0].getAttribute('value')", elem).toString();
		POJOClass pom5= new POJOClass();
		fill(pom5.getOrderid(), orderId);
		
		/*List<WebElement> tables = driver.findElements(By.tagName("table"));
		
	    for(int i=0; i<tables.size(); i++) {
			
	    	WebElement table5 = tables.get(4);
			
	    	List<WebElement> tRows = table5.findElements(By.tagName("tr"));
			 
	    	for(int j=0; j<tRows.size(); j++) {
			 		
	    		WebElement tR = tRows.get(j);
	    		
	    		List<WebElement> tData = tR.findElements(By.tagName("td"));
	    		
	    		for(int k=0; k<tData.size(); k++) {
	    			WebElement data = tData.get(k);
	    			JavascriptExecutor jk1 = (JavascriptExecutor) driver;
	    			
	    			System.out.println(jk1.executeAsyncScript("return arguments[0].getAttribute('value')", data).toString());
	    		}
	    	
	    	}
	    	break;
		 }*/
		
		
	}

	@When("User has to click on go")
	public void user_has_to_click_on_go() {
	    click(driver.findElement(By.id("search_hotel_id")));
	   
	}

	@When("User need to click on check box for cancelling an order")
	public void user_need_to_click_on_check_box_for_cancelling_an_order() {
	    click(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")));
		}

	@When("User need to click on Cancel Selected button")
	public void user_need_to_click_on_Cancel_Selected_button() {
	    click(driver.findElement(By.xpath("(//input[@type='submit'])[2]")));
	}

	@When("User need to handle the pop up to selecting either OK or Cancel")
	public void user_need_to_handle_the_pop_up_to_selecting_either_OK_or_Cancel() {
	    Alert a = driver.switchTo().alert();
	    a.accept();
	}

	@Then("User should be navigated back to Booked Itinerary page")
	public void user_should_be_navigated_back_to_Booked_Itinerary_page() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("Boerary"));
	}

}
