package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage
{
	@FindBy(xpath="//div[@aria-label='Edit Profile']")
	private WebElement edit;
	@FindBy(xpath="//span[text()='Edit'][1]")
	private WebElement editbutton;
	@FindBy(xpath="//span[text()='Upload Photo']")
	private WebElement upload;
	@FindBy(xpath="//div[@aria-label='Save']")
	private WebElement save;
   @FindBy(css="body > div.uiLayer._3qw > div:nth-child(2) > div.l9j0dhe7.h3gjbzrl > div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div > div > div.cypi58rs.pmk7jnqg.fcg2cn6m.tkr6xdv7 > div > i")
   private WebElement close;
   @FindBy(id="userNavigationLabel")
   private WebElement drop;
   @FindBy(xpath="//li[@data-gt='{\"ref\":\"async_menu\",\"logout_menu_click\":\"menu_logout\"}']")
   private WebElement logout;
   	public ProfilePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
   	public void edit()
	{
		edit.click();
	}
	public void editbutton()
	{
		editbutton.click();
	}
	public void upload()
	{
		upload.click();
	}
	public void save()
	{
		save.click();
	}
	 public void close()
	 {
		 close.click();
	 }
	 public void drop()
	 {
		 drop.click();
	 }
	 public void logout()
	 {
		 logout.click();
	 }
}



