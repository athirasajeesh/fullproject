package ecomsite_artifactId.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.baseClass.baseClass;

public class AddToCart extends baseClass {
	
	@FindBy(id="quantity_wanted")
	WebElement quantity_wanted;
	
	@FindBy(id="group_1")
	WebElement size;
	
	
	@FindBy(xpath="//span[text()=\"Add to cart\"]")
	WebElement add_to_cart;
	
	@FindBy(xpath="//i[(@class='icon-ok')]")
	WebElement product_Succesful_Txt;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement proceed_To_Checkout;
	
	public AddToCart(){
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterQty(String Qty) {
		action.type(quantity_wanted, Qty);
	}
	
	
	public void select_size(String size_needed) {
		action.selectByVisibleText(size_needed ,size);

	}
	
	public void cickOnCart() {
		action.click(getDriver(), add_to_cart);
	}
	
	public Orderpage clickonProceedtoCheckout() throws Exception {
		action.JSClick(getDriver(), proceed_To_Checkout);
		return new Orderpage();
	}
}
