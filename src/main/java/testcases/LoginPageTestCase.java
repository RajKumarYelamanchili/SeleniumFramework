package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.TestBase;


public class LoginPageTestCase extends TestBase {
	final Logger logger = LogManager.getLogger(LoginPageTestCase.class);
	@Test
	void TC_01_verifyEmailTextbox() throws InterruptedException
	{
	ExtentTest test = extent.createTest("TC_01_verifyEmailTextbox");
	test.log(Status.INFO,"chrome launched");
	logger.info("url opened");
	 loginPageObj.getEmailTxtBox().sendKeys("RajKumar");
	 Thread.sleep(2000);
	 test.log(Status.INFO,"username entered for extent report");
	 logger.info("username entered in log");
	 loginPageObj.getPasswordTxtBox().sendKeys("abcdefghij");
	 Thread.sleep(2000);
	 test.log(Status.INFO,"password entered in FB");
	 logger.info("password entered");
	 loginPageObj.getLoginButton().click();
	 Thread.sleep(2000);
	 test.log(Status.INFO,"button clicked in FB");
	 logger.info("login button clicked");
	String Expected = "The password that you've entered is incorrect. Forgotten password?1";
	String Actual = loginPageObj.getErrorMessage().getText();
	System.out.println(Actual);
	Assert.assertEquals(Expected,Actual,"NOT MATCHING");
	  		 
}
	@Test
    public void TC_02_verifyTittleTest2() throws InterruptedException {
		ExtentTest test = extent.createTest("TC_02_verifyTittleTest2");
		logger.info("url opened");
		 loginPageObj.getEmailTxtBox().sendKeys("rohan");
		 Thread.sleep(2000);
		 test.log(Status.INFO,"username entered");
		 logger.info("username entered");
		 loginPageObj.getPasswordTxtBox().sendKeys("abcdefghij");
		 Thread.sleep(2000);
		 test.log(Status.INFO,"password entered");
		 logger.info("password entered");
		 loginPageObj.getLoginButton().click();
		 Thread.sleep(2000);
		 test.log(Status.INFO,"login button clicked");
		 logger.info("login button clicked");
		 Assert.assertTrue(false);
	}
    
 
    @Test
	   public void TC_03_testcase() throws InterruptedException{
    	ExtentTest test = extent.createTest("TC_03_testcase");
    	logger.info("url opened");
   	 loginPageObj.getEmailTxtBox().sendKeys("abcdefg");
   	 Thread.sleep(2000);
   	 logger.info("username entered");
   	 loginPageObj.getPasswordTxtBox().sendKeys("abcdefghij");
   	 Thread.sleep(2000);
   	 logger.info("password entered");
   	 loginPageObj.getLoginButton().click();
   	 Thread.sleep(2000);
   	 logger.info("login button clicked");
		   int i = 5;
	      System.out.println("Test Case2 - Conditional Skip");
	      if(i< 7)
	      throw new SkipException("Skipping this exception");
	      System.out.println("Executed Successfully");
	      Assert.assertTrue(false);
    }
	   
    @Test
    public void TC_04_verifyTittleTest4() throws InterruptedException {
    	ExtentTest test = extent.createTest("TC_02_verifyTittleTest2");
    	logger.info("url opened");
   	 loginPageObj.getEmailTxtBox().sendKeys("pqrstuvw");
   	 Thread.sleep(2000);
   	 logger.info("username entered");
   	 loginPageObj.getPasswordTxtBox().sendKeys("abcdefghij");
   	 Thread.sleep(2000);
   	 logger.info("password entered");
   	 loginPageObj.getLoginButton().click();
   	 Thread.sleep(2000);
   	 logger.info("login button clicked");
    	 logger.info("tc3 started");
                Assert.assertTrue(false);
    }
    @Test
    public void TC_04_verifyTittleTest() throws InterruptedException {
    	ExtentTest test = extent.createTest("TC_02_verifyTittleTest2");
    	logger.info("url opened");
   	 loginPageObj.getEmailTxtBox().sendKeys("efghijklmn");
   	 Thread.sleep(2000);
   	 logger.info("username entered");
   	 loginPageObj.getPasswordTxtBox().sendKeys("abcdefghij");
   	 Thread.sleep(2000);
   	 logger.info("password entered");
   	 loginPageObj.getLoginButton().click();
   	 Thread.sleep(2000);
   	 logger.info("login button clicked");
    	 logger.info("tc4 started");
    	 Assert.assertTrue(true);
    }
    @Test
    public void TC_05_verifyTittleTest() throws InterruptedException {
    	ExtentTest test = extent.createTest("TC_02_verifyTittleTest2");
    	logger.info("url opened");
   	 loginPageObj.getEmailTxtBox().sendKeys("dharmendra");
   	 Thread.sleep(2000);
   	 logger.info("username entered");
   	 loginPageObj.getPasswordTxtBox().sendKeys("abcdefghij");
   	 Thread.sleep(2000);
   	 logger.info("password entered");
   	 loginPageObj.getLoginButton().click();
   	 Thread.sleep(2000);
   	 logger.info("login button clicked");
    	 logger.info("tc5 started");
    	 Assert.assertTrue(false);
    }
}
