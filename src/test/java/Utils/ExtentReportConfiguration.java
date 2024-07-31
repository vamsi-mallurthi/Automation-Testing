package Utils;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportConfiguration {
 //ExtentSparkReporter >setting configuration details like file location ,report name
	
	static ExtentReports extent;
	@Test(priority=1)
	public static ExtentReports getExtentReport() {
String path=System.getProperty("user.dir")+"\\testreport\\report.html";  //it will create own  path automatically in project 
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("This is automation extent report");
//ExtentReport> Generating Reports
	 extent=new ExtentReports();
	extent.attachReporter(reporter);
	return extent;
}
	@Test(priority=2)
public void testcase1() {
	extent.createTest("testcase1");
	System.out.println("testcase1 will be execute");
}
	@Test(priority=3)
	public void testcase2() {
		extent.createTest("testcase2");
		System.out.println("testcase2 will be execute");
	}
	
	//flush >close the testcase
	@Test(priority=4)
	public void close() {
		extent.flush();
		System.out.println("close the testcases");

	}
}
