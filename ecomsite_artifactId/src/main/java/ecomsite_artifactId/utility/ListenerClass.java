package ecomsite_artifactId.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ecomsite_artifactId.baseClass.baseClass;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import ecomsite_artifactId.actionDriver.action;

public class ListenerClass extends ExtentManager implements ITestListener  {
	action action= new action();

public void onTestStart(ITestResult result) {
	test = extent.createTest(result.getName());
}

public void onTestSuccess(ITestResult result) {
	if (result.getStatus() == ITestResult.SUCCESS) {
		test.log(Status.PASS, "Pass Test case is: " + result.getName());
	}
}

public void onTestFailure(ITestResult result) {
	if (result.getStatus() == ITestResult.FAILURE) {
	}
}

public void onTestSkipped(ITestResult result) {
	if (result.getStatus() == ITestResult.SKIP) {
		test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
	}
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
}

public void onStart(ITestContext context) {
	// TODO Auto-generated method stub

}

public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
}

}
