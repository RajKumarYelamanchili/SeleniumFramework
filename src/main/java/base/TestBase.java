package base;


import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.LoginPage;
import utilities.ReadConfig;


public class TestBase {
	
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String chromepath = readconfig.getChromePath();
	public String firefoxpath = readconfig.getFirefoxPath();
	public WebDriver driver;
	protected LoginPage loginPageObj;
	public static Logger logger;
	
	protected ExtentReports extent;
    ExtentSparkReporter sparkReporter;
    ExtentTest test;
	
    @BeforeSuite
    public void beforeSuite()
    {
    	extent = new ExtentReports();
    	sparkReporter = new ExtentSparkReporter("report.html");
    	extent.attachReporter(sparkReporter);
    }
    
    @AfterSuite
    public void afterSuite()
    {
      extent.flush();
    }
    
    @BeforeTest
    public void startTest() {
    	
                sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//test-output//Extentreport.html");
                extent.attachReporter(sparkReporter);
                extent.setSystemInfo("Facebook", "Login");
                extent.setSystemInfo("Env", "QA");
                extent.setSystemInfo("Build", "1.0.1");
                extent.setSystemInfo("Browser", "Chrome");
    }
	
	@Parameters("browser")
	@BeforeMethod	
	public void setup(String br)
	{
		
		
		if (br.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		 driver = new ChromeDriver();
		
	
		}
		else if (br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		 
	
	String baseURL = readconfig.getApplicationURL();
	 driver.get(baseURL);
	// logger.info("url opened");
	 
	 loginPageObj = new LoginPage(driver);
	// forgotPasswordPageObj = new ForgotPasswordPage(driver);
	
}

@AfterMethod

	public void setTestResult(ITestResult result) throws IOException {
        //String screenShot = CaptureScreenShot.captureScreen(driver);
        if (result.getStatus() == ITestResult.FAILURE) {
                    test.log(Status.FAIL, result.getName());
                    test.log(Status.FAIL,result.getThrowable());
        //          test.fail("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
        } else if (result.getStatus() == ITestResult.SUCCESS) {
                    test.log(Status.PASS, result.getName());
                    //test.pass("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
        } else if (result.getStatus() == ITestResult.SKIP) {
                    test.skip("Test Case : " + result.getName() + " has been skipped");
        }
       extent.flush();
        driver.close();
}
	



@AfterTest
public void endTest() {
           
	extent.flush();
}
}
