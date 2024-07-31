package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import Base.BaseTest;

public class Listeners extends BaseTest implements ITestListener {
//unimplemented methods
//10 testcases >5 Testcases will be passed.
	ExtentReports extent;
	
	@Override
	public void onTestStart(ITestResult result) {
		//before executing each testcase this method will be triggered.
		if(extent==null) {
 extent=ExtentReportConfiguration.getExtentReport();
		}
		extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase got success" + result.getMethod().getMethodName());
		//Trigger when testcase is passed.
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//Trigger when testcase is failed
		//Takes a screenshot /jenkins CI/CD
		System.out.println("Testcase got failed" + result.getMethod().getMethodName());
		TakesScreenshot tks=(TakesScreenshot)driver;
		File SourceLocation =tks.getScreenshotAs (OutputType.FILE);
	String path=System.getProperty("user.dir")+"\\FailedScreenshots\\"+result.getMethod().getMethodName()+".png";
	File DestinationLocation =new File(path);
	try {
		FileUtils.copyFile(SourceLocation, DestinationLocation);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onStart(ITestContext context) {
		
		//before starting of 10 testcases
	}

	@Override
	public void onFinish(ITestContext context) {
		// after executing of 10 testcases
		
		extent.flush();
	}

}
