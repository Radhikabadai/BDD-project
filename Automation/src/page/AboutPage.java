package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage 
{
	@FindBy(xpath="//span[text()='About']")
	private WebElement about;
	
@FindBy(xpath="//span[text()='Family and relationships']")
private WebElement relation;
@FindBy(xpath="//span[text()='Status']")
private WebElement status;

public AboutPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
public void about()
	{
		 about.click();
	}

public void relation()
{
	relation.click();
}
public void status()
{
	status.click();
}

}
