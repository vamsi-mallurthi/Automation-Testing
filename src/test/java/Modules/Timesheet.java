package Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageObject.TimesheetLocator;

public class Timesheet {
	WebDriver driver;
	TimesheetLocator tb;
	
	Timesheet() throws IOException{
		BaseTest bt=new BaseTest(); 
	driver=	bt.LoginIntoApplication();
	 tb=new TimesheetLocator();
	}
	@Test
	public void TimeSheetIcon() {
		driver.findElement(tb.Timesheetstudent()).click();
	}

}
