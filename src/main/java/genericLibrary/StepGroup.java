package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepGroup {
	public WebDriver driver;
	public propertyFile pdata=new propertyFile();
	public WebDriverUtilities driverutilities=new WebDriverUtilities();
	
	@BeforeMethod
	
	public void openApp() throws IOException 
	{
	    WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@AfterMethod
	
	public void closeaApp(ITestResult res) throws IOException 
	{
		int status = res.getStatus();
		String name = res.getName();
		if(status==2) {
			Screenshot s=new Screenshot();
			s.getScreenshot(driver, name);
	
		}
		driver.quit();
	}
}



