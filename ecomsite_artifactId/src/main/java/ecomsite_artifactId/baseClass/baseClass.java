package ecomsite_artifactId.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import ecomsite_artifactId.actionDriver.action;
import ecomsite_artifactId.utility.ExtentManager;

public class baseClass {
	public static Properties prop;
	//public static WebDriver driver;
	
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	static String baseUrl;
	
public static WebDriver getDriver() {
	return driver.get();
}	

@BeforeSuite
public void logconfig() {
	ExtentManager.setExtent();
	DOMConfigurator.configure("log4j.xml");
}

@AfterSuite
public void afterSuite() {
	ExtentManager.endReport();
}
	
@BeforeTest
public void loadConfig() {
	try {
		System.out.println("---Before every testcase ---Open Property File");
		File file = new File(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		FileInputStream fileInput = null;
		prop = new Properties();
		fileInput = new FileInputStream(file);
		prop.load(fileInput);	
		}
	catch(Exception E){
		System.out.println("unable to find property file");
	}
}

public void launchApp() {
    // System Property for Chrome Driver 
    // WebDriverManager.chromedriver().setup();
	System.out.println("---Inside launchApp method()");
	String browsername =prop.getProperty("browser");
	
    // ChromeOptions options = new ChromeOptions();
    //options.addArguments("--diable--notifications");
  
    // Instantiate a ChromeDriver class.     
    if(browsername.contains("Chrome")) {
    	//driver=new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver", "E:\\Athira-WorkSpace\\Softwares\\Browsers\\chromedriver.exe");
    	driver.set(new ChromeDriver());
    	System.out.println("---Set Browser COmpleted");
    }else if (browsername.contains("FireFox")) {
    	System.setProperty("webdriver.gecko.driver", "E:\\Athira-WorkSpace\\Softwares\\Browsers\\geckodriver.exe");
    	driver.set(new FirefoxDriver());
    	System.out.println("---Set Browser COmpleted");
    }else if (browsername.contains("Safari")) {
    	//driver=new ChromeDriver();
    	//for the momnet i m commenting it --driver.set(new SafariDriver());
    }
    getDriver().manage().window().maximize();
    action.implicitWait(getDriver(),5);
    getDriver().get(prop.getProperty("url"));
   action.pageLoadTimeOut(getDriver(), 15);
   
} 

@Parameters("browserFromXML")
public void getparameters(String browser) {
	System.out.println("--- Browser --"+browser);
}

/*


public static void launchApp() { 
	System.out.println("----Inside launchApp  method!----");
	try {
	// Setting the Webdriver
	setWebdriver();
	
	// Calling implicit wait method
	manageImplicitWait();

	// launch Fire fox and direct it to the Base URL
	driver.get(baseUrl);

	}
	catch (Exception e) {
	System.out.println("Error" + e.getMessage());
	}
}

public static void setWebdriver() {
	// Declaration and instantiation of Chrome
	System.out.println("/n----Waiting setwebdriver-----");
	System.setProperty("webdriver.chrome.driver","E:\\Athira-WorkSpace\\Softwares\\Browsers\\chromedriver.exe");
	driver = new ChromeDriver();
    baseUrl = prop.getProperty("url");
    System.out.println("----instantiation of Chrome Passed!----");
}

public void maximiseWindow() {
	driver.manage().window().maximize();
}

public void mandatorySleep() throws InterruptedException {
	//Adding mandatory sleep for 2 seconds 
	//This will pause the execution for 2 seconds , thts all! This will slows down automation time generally
	Thread.sleep(2000);
}


public static void manageImplicitWait() {
	//This wait is applicable to all webelements after this statement .We just need to put this statement only ones
	//Wait for 3 Seconds, if it found the elements within 3 seconds , it will move to next step. maximum amount of time it will wait is 3 seconds
	System.out.println("---Waiting for 3 Seconds!---");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}

public void quitBrowser() {
	// close Fire fox
	//driver.close();
	System.out.println("Closed Chrome Browser!");
}

*/

}
