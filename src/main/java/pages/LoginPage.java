package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver =null;
	
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
	private WebElement emailTxtBox;

public	WebElement getEmailTxtBox()
{
	return emailTxtBox;
}


@FindBy(xpath = "//input[@id='pass']")
private WebElement passwordTxtBox;

public	WebElement getPasswordTxtBox()
{
return passwordTxtBox;
}

	
@FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
private WebElement loginButton;

public	WebElement getLoginButton()
{
return loginButton;
}


@FindBy(xpath = "//div[@class='_9ay7']")
private WebElement errorMessage;

public	WebElement getErrorMessage()
{
return errorMessage;
}
}
