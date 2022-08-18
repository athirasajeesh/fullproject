package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class Payment extends baseClass {

	@FindBy(xpath="//a[contains(text(),'Pay by bank wire')]")
	WebElement payByWire ; 
	
	public Payment(){
		PageFactory.initElements(getDriver(), this);
	}
	
	public OrderSummary clickOnPayByWire() {
		action.click(getDriver(), payByWire);
		return new OrderSummary();
	}
}
