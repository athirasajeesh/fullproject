package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class Orderpage extends baseClass{

	@FindBy(xpath="//span[@id='product_price_1_1_0']")
	WebElement unitPrice;
	
	@FindBy(id="total_price")
	WebElement totalPrice;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement proceed_to_checkout;
	
	public Orderpage(){
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public double getUnitPrice() {
		String unitPrice_Txt= unitPrice.getText();
		String unit= unitPrice_Txt.replaceAll("[^a-z A-Z0-9_]", "");
		double unitPrice_double= Double.parseDouble(unit);
		return unitPrice_double/100;
	}
	
	public double getTotalPrice() {
		String totalPrice_Txt= totalPrice.getText();
		String total= totalPrice_Txt.replaceAll("[^a-z A-Z0-9_]", "");
		double totalPrice_double= Double.parseDouble(total);
		return totalPrice_double/100;
	}
	
	public loginPage clickOnProceed() {
		action.click(getDriver(), proceed_to_checkout);
		return new loginPage();
	}
	
}
