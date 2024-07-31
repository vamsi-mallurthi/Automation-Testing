package PageObject;

import org.openqa.selenium.By;

public class TimesheetLocator {
	//Encapsulation   : private variable provide public methods
	
	private By TimesheetButton=By.xpath("//button[@title='My Timesheet']");
	
	public By Timesheetstudent() {
		
		return TimesheetButton;
	}
}
