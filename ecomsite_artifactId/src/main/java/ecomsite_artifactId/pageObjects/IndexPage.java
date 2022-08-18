package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class IndexPage extends baseClass{
	//signup link
	@FindBy(xpath="//a[@class='login']")
	WebElement signInBtn;
	
	//logo 
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement myStoreLogo;
	
	//search Textbox
	@FindBy(id="search_query_top")
	WebElement searchProductBox;
	
	// search Btn
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchButton;
	
	public IndexPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	public loginPage clickOnSign() {
		action.fluentWait(getDriver(), signInBtn, 10);
		action.click(getDriver(), signInBtn);
		return new loginPage();
	}

	public boolean validateLogo() {
		return action.isDisplayed(getDriver(), myStoreLogo);
	}
	
	public String geMyStoreTitle() {
		return getDriver().getTitle();
	}
	
	public searchResultPage searchproduct(String searchText) {
		action.type(searchProductBox, searchText);
		action.click(getDriver(), searchButton);
		return new searchResultPage();
	}
}
