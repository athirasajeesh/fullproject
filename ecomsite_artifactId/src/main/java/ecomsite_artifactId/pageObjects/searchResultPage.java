package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.baseClass.baseClass;

public class searchResultPage extends baseClass {

	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[1]")
	WebElement search_result;
	
	
	public searchResultPage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	
}
