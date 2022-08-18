package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class AddressPage extends baseClass{
	
	@FindBy(xpath="//span[text()=\"Proceed to checkout\"]")
	WebElement proceed_to_checkout;
	
	public AddressPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	public ShippingPage clickProceedToCheckout() {
		action.click(getDriver(), proceed_to_checkout);
		return new ShippingPage();
	}
	

}
