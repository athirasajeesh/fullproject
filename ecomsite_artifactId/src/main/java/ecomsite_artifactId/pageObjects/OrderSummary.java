package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class OrderSummary extends baseClass {
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	WebElement confrimOrder;
	
	public OrderSummary(){
		PageFactory.initElements(getDriver(), this);
	}

	public OrderConfirmation clickOrderSummary() {
		action.click(getDriver(), confrimOrder);
		return new OrderConfirmation();
	}
}
