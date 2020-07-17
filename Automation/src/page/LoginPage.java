package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 

	{
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbtn;
	@FindBy(css=".\\_1vp5")
	private WebElement profile;
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void setcredentials(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginbtn.click();	
	}
	public void profile()
	{
		profile.click();
	}
	
	}


