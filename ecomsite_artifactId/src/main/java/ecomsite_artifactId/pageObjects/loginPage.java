package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class loginPage extends baseClass{
	
	@FindBy(id="email")
	WebElement email_Txt;
	
	@FindBy(id="passwd")
	WebElement password_Txt;
	
	@FindBy(xpath="//button[@name='SubmitLogin']")
	WebElement signIn_Btn;
	
	@FindBy(id="email_create")
	WebElement email_Address_txt;
	
	
	@FindBy(xpath="//i[@class='icon-user left']")
	WebElement create_address_btn;
	
	

	public loginPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String username , String password) {
		action.type(email_Txt, username);
		action.type(password_Txt, password);
		action.scrollByVisibilityOfElement(getDriver(),signIn_Btn);
		action.click(getDriver(), signIn_Btn);
		return new HomePage();
	}
	
	public AddressPage login1(String username , String password) {
		action.type(email_Txt, username);
		action.type(password_Txt, password);
		action.click(getDriver(), signIn_Btn);
		return new AddressPage();
	}
	
	public AccountCreationPage createaccount(String emaillId) {
		action.type(email_Address_txt, emaillId);
		//action.click(driver, create_address_btn);
		return new AccountCreationPage();
	}
	
	
}
