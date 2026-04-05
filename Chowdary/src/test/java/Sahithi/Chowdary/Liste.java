package Sahithi.Chowdary;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Liste implements ITestListener {
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success:" + result.getName() +result.getStartMillis() +result.getTestName() +result.getStatus() +result.getEndMillis() +result.getHost() +result.getInstanceName() +result.getMethod() +result.getClass() );
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Success:" + result.getName() +result.getStartMillis() +result.getTestName() +result.getStatus() +result.getEndMillis() +result.getHost() +result.getInstanceName() +result.getMethod() +result.getClass() );
	}
	public void onTestStart(ITestResult result) {
		System.out.println("Test Success:" + result.getName() +result.getStartMillis() +result.getTestName() +result.getStatus() +result.getEndMillis() +result.getHost() +result.getInstanceName() +result.getMethod() +result.getClass() );
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Success:" + result.getName() +result.getStartMillis() +result.getTestName() +result.getStatus() +result.getEndMillis() +result.getHost() +result.getInstanceName() +result.getMethod() +result.getClass() );
	}
	public void onStart(ITestResult result) {
		System.out.println("Test Success:" + result.getName() +result.getStartMillis() +result.getTestName() +result.getStatus() +result.getEndMillis() +result.getHost() +result.getInstanceName() +result.getMethod() +result.getClass() );
	}
	public void onFinish(ITestResult result) {
		System.out.println("Test Success:" + result.getName() +result.getStartMillis() +result.getTestName() +result.getStatus() +result.getEndMillis() +result.getHost() +result.getInstanceName() +result.getMethod() +result.getClass() );
	}

}
