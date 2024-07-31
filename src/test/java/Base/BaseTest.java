package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	Logger log=LogManager.getLogger(BaseTest.class);
 public static	WebDriver driver;
	@Test
 public WebDriver LoginIntoApplication() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\vamsi\\eclipse-workspace\\EndToEndFrameWork\\src\\test\\resources\\config.properties");
		Properties pt=new Properties();
		pt.load(fis);
		pt.getProperty("url");
	 if(pt.getProperty("browser").equalsIgnoreCase("chrome")) {
		  driver=new ChromeDriver();
		 WebDriverManager.chromedriver().setup();
	 }
	 else if(pt.getProperty("browser").equalsIgnoreCase("Edge")) {
		 driver=new EdgeDriver();
		 WebDriverManager.edgedriver().setup();
	 }
	 else if(pt.getProperty("browser").equalsIgnoreCase("Firefox")) {
		 driver=new FirefoxDriver();
		 WebDriverManager.firefoxdriver().setup();
	 }
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	 driver.manage().window().maximize();
	 driver.get(pt.getProperty("url"));
	 driver.findElement(By.name("username")).sendKeys(pt.getProperty("username"));
	log.info("...................username value entered..................");
	 driver.findElement(By.name("password")).sendKeys(pt.getProperty("password"));
	 log.info("...................password value entered..................");

	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 log.info("...................button value clicked..................");

	  return driver;
 }
}
