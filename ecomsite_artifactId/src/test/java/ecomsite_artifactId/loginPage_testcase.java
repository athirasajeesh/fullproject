package ecomsite_artifactId;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomsite_artifactId.baseClass.baseClass;
import ecomsite_artifactId.pageObjects.HomePage;
import ecomsite_artifactId.pageObjects.IndexPage;
import ecomsite_artifactId.pageObjects.loginPage;
import ecomsite_artifactId.utility.Log;

public class loginPage_testcase extends baseClass{
	IndexPage index;
	loginPage login;
	HomePage home;
	@BeforeMethod
	public void setup() {
		System.out.print("------Calling Before Method------");
		System.out.print("------Calling launchApp() method------");
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		System.out.print("------Calling After Method------");
//		getDriver().close();
		
	}
	
	@Test
	public void login() {
		Log.startTestCase("From LOG: Starting ...LoginPage");
		index= new IndexPage();
		login=index.clickOnSign();
		Log.info("From LOG: Info: Clicked SIgn");
		home= login.login(prop.getProperty("username"), prop.getProperty("password"));
		String actualUrl= home.getcurrentURL();
		Log.info("From LOG: Info: current URL:"+actualUrl + "-------"+ prop.getProperty("homePageUrl"));
		Assert.assertEquals(actualUrl, prop.getProperty("loginHomePageUrl"));
	}
}
