package ecomsite_artifactId;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomsite_artifactId.baseClass.baseClass;
import ecomsite_artifactId.dataProvider.DataProviders;
import ecomsite_artifactId.dataProvider.dataproviderFromSample;
import ecomsite_artifactId.pageObjects.AccountCreationPage;
import ecomsite_artifactId.pageObjects.IndexPage;
import ecomsite_artifactId.pageObjects.loginPage;

public class accountCreation_testCaseDataProvider extends baseClass {
	IndexPage indexPage;
	loginPage loginPage;
	AccountCreationPage accountCreationPage;
	@BeforeMethod
	public void setup() {
		System.out.print("------Calling Before Method------");
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		System.out.print("------Calling After Method------");
		//driver.close();
	}
	
	@Test (dataProvider="email", dataProviderClass = DataProviders.class)
	public void accountCreation(String email) throws Throwable {
		indexPage=new IndexPage();
	    loginPage = indexPage.clickOnSign();
	    accountCreationPage=loginPage.createaccount(email);
	//    boolean isCreateAccountTitleDisplayed=accountCreationPage.validateAcountCreatePage();
	  //  Assert.assertTrue(isCreateAccountTitleDisplayed);
	    
	}

}
