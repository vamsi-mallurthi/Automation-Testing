package Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageObject.ApplyLeaveLocator;

public class Applyleave {

	WebDriver driver;
	ApplyLeaveLocator object;
	Applyleave() throws IOException{  //constructor method will execute first later remaining executed.
		BaseTest bt=new BaseTest();
	 driver=bt.LoginIntoApplication();
	  object=new ApplyLeaveLocator();
	}
	@Test
	public void ClickOnapplyLeave() {
		driver.findElement(object.ApplyLeaveee()).click();
	}
}
