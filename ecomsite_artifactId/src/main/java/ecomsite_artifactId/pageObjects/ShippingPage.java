package ecomsite_artifactId.pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class ShippingPage extends baseClass {

	@FindBy(id="cgv")
	WebElement agree_chk;
	
	@FindBy(xpath="//button/span[contains(text(),\"Proceed to checkout\")]")
	WebElement proceed_Btn;
	
	public ShippingPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickOnAgree(){
		action.click(getDriver(), agree_chk);
	}
	
	public Payment clickOnProceed() {
		action.click(getDriver(), proceed_Btn);
		return new Payment();
	}
	
}
