package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListeners implements ITestListener {

	ExtentReports r;
	ExtentTest t;
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("onFinish");
		r.endTest(t);
		r.flush();
	}
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("onStart");
		r= new ExtentReports("C:\\Users\\pdc4-training.pdc4\\Desktop\\New folder\\framework\\src\\test\\java\\com\\accenture\\utilities\\report.html");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("onTestFailure");
		t.log(LogStatus.FAIL,result.getMethod().getMethodName()+"Has Failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
		t.log(LogStatus.INFO,result.getMethod().getMethodName()+"Has skipped");
	}
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("onTestStart");
		t= r.startTest(result.getMethod().getMethodName()+"has started");
		t.log(LogStatus.INFO,result.getMethod().getMethodName()+"Has Started");
		r.addSystemInfo("User","Sanjeev");
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess");
		t.log(LogStatus.PASS,result.getMethod().getMethodName()+"Has Passed");
	}

}