package PageObject;

import org.openqa.selenium.By;

public class ApplyLeaveLocator {

	//Design pattern >1.Page Object model 2.Page factory
	//assume 20 testcases
	//Encapsulation   : private variable provide public methods
	private By ApplyLeaveButton=By.xpath("//button[@title='Apply Leave']");
	private By ReportsbyButton=By.xpath("//*[text()='reports']");
	
	public By ApplyLeaveee() {
		return  ApplyLeaveButton;
	}
	public By ReportsbyButtonn() {
		return ReportsbyButton;
	}
}
