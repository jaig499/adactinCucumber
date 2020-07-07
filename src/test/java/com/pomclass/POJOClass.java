package com.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class POJOClass extends BaseClass {
	
	public POJOClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	private WebElement UN;

	@FindBy(id="password")
	private WebElement PW;
	
	@FindBy(id="login")
	private WebElement button;

	@FindBy(name="Submit")
	private WebElement search;
	
	@FindBy(id="order_id_text")
	private WebElement Orderid;

	public WebElement getUN() {
		return UN;
	}

	public WebElement getPW() {
		return PW;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getOrderid() {
		return Orderid;
	}
}
