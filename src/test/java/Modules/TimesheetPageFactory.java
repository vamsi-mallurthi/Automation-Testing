package Modules;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;

public class TimesheetPageFactory {

	
	
	//PageFactory Method
	@FindBy(xpath="//button[@title='My Timesheet']")
	private WebElement  TimesheetpageClick;
	
	WebDriver driver;
	TimesheetPageFactory() throws IOException{
		BaseTest bt=new BaseTest();
	driver=	bt.LoginIntoApplication();
	PageFactory.initElements(driver, this);
	}
	@Test
	public void timesheet() {
		TimesheetpageClick.click();
	}
	
}
