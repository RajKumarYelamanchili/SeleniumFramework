package extentreports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class FBTest {
	
	public WebDriver driver;
	public ExtentReporter htmlReporter;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent()
	{
		
	}

}
