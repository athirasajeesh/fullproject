package ecomsite_artifactId;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomsite_artifactId.baseClass.baseClass;
import ecomsite_artifactId.pageObjects.IndexPage;

public class indexPage_testcase extends baseClass{
	@BeforeMethod
	public void setup() {
		System.out.print("------Calling Before Method------");
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		System.out.print("------Calling After Method------");
		getDriver().close();
		
	}
	/*
	@Test
	public void verifyLogo() {
		System.out.print("Inside First Test");
		IndexPage index = new  IndexPage();
		boolean islogodisplyed = index.validateLogo();
		Assert.assertTrue(islogodisplyed);
	}
	@Test
	public void verifyLogo2() {
		System.out.print("Inside Second Method in Index page!");
		IndexPage index = new  IndexPage();
		boolean islogodisplyed = index.validateLogo();
		Assert.assertTrue(islogodisplyed);
	}*/
	@Test
	public void verifyLogo3() {
		System.out.print("Inside First Test");
		getparameters(getDriver().toString());
	}
	
	
}
