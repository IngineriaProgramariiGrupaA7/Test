package ip.project.interfaceProject.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static String url = "localhost:8080";
	static FirefoxDriver driver;
	public static WebDriverWait wait; 

	public static WebElement element(By xpath) {
		return driver.findElement(xpath);
	}
	

	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver, 10);
	}
	
	@AfterClass
	public void driverQuit(){
		driver.quit();
	}
	
}
