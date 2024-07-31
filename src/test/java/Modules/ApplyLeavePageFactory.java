package Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;

public class ApplyLeavePageFactory {
 WebDriver driver;
 
 //Page Factory Model..................
 @FindBy(xpath="//button[@title='Apply Leave']")
 private WebElement ApplyleaveButton; 
 
//................
	 ApplyLeavePageFactory() throws IOException {  //constructor
		BaseTest bt=new BaseTest();
	driver=	bt.LoginIntoApplication();
	PageFactory.initElements(driver, this);
	 }
	
	 @Test
	public void ClickOnApply() {
		 ApplyleaveButton.click(); 
	 }
	}

