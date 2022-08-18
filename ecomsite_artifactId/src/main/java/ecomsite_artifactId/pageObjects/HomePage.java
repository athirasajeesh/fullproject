package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class HomePage extends baseClass {
	@FindBy(xpath="//span[text()='My wishlists']")
	WebElement myWishlist;
	
	@FindBy(xpath="//span[text()='Order history and details']")
	WebElement orderhistory;
	
	@FindBy(xpath="//h1[text()='Create an account']")
	WebElement create_an_account_Txt;

	
	public boolean validate_mywishlist() {
		return action.isDisplayed(getDriver(), myWishlist);
	}
	
	public boolean validate_orderhistory() {
		return action.isDisplayed(getDriver(), orderhistory);
	}
	
	public boolean validate_createaccounttilte() {
		return action.isDisplayed(getDriver(), create_an_account_Txt);
	}
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getcurrentURL() {
		return getDriver().getCurrentUrl();
	}

}
