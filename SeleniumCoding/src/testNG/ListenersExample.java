package testNG;

import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestNGListener {

	public void onTestStart(ITestResult result) {
System.out.println("Test case is going to execute");
	}
}