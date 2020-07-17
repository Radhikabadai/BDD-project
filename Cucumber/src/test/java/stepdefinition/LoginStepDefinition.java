package stepdefinition;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition 
{
	
	WebDriver driver;
	ChromeOptions options;
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Driverss\\ChromeDriver1.exe");
		
		}
	

	@Given("^the browser is launched$")
	public void the_browser_is_launched() throws Throwable {
		options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
	driver=new ChromeDriver(options); 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	

	   
	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
	    driver.get("https://www.facebook.com/");
	    
	}

	@When("^the user enter the valid username$")
	public void the_user_enter_the_valid_username() throws Throwable {
		 driver.findElement(By.id("email")).sendKeys("radhikabadai96@gmail.com");
	    
	}

	@When("^the user enter the valid password$")
	public void the_user_enter_the_valid_password() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("Radhika@mounika");
	    
	}

	@When("^the user click on login button$")
	public void the_user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(3000);
	}

	@Then("^Homepage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable {
		
	    Assert.assertEquals("","");
	    
	    }
	@When("^click on profile$")
	public void click_on_profile() throws Throwable
	{
	  driver.findElement(By.xpath("//span[text()='Radhika']")).click();
	  Thread.sleep(4000);
	}
	@When("^click on edit profile$")
	public void click_on_edit_profile() throws Throwable {
	  driver.findElement(By.xpath("//span[text()='Edit Profile']")).click();
	  Thread.sleep(4000);
	}

	@When("^click on edit$")
	public void click_on_edit() throws Throwable {
	  driver.findElement(By.xpath("//span[text()='Edit'][1]")).click();
	  Thread.sleep(4000);
	}
	@When("^click on updateprofile$")
	public void click_on_updateprofile() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Upload Photo']")).click();
		Thread.sleep(4000);
	}

	@When("^uploading a photo$")
	public void uploading_a_photo() throws Throwable {

		File f=new File("C:\\Users\\satis\\Desktop\\Auto2.exe");
		Runtime.getRuntime().exec(f.getAbsolutePath());
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");	
	    Thread.sleep(4000);
	   }
	@When("^save the uploaded photo$")
	public void save_the_uploaded_photo() throws Throwable 
	{
driver.findElement(By.xpath("//span[text()='Save']")).click();
Thread.sleep(4000);
}
	@When("^close the upload photo window$")
	public void close_the_upload_photo_window() throws Throwable {
		driver.findElement(By.cssSelector("body > div.uiLayer._3qw > div:nth-child(2) > div.l9j0dhe7.h3gjbzrl > div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div > div > div.cypi58rs.pmk7jnqg.fcg2cn6m.tkr6xdv7 > div > i")).click();
	Thread.sleep(2000);	
	}
	@When("^click on dropdown for logout$")
	public void click_on_dropdown_for_logout() throws Throwable {
	 driver.findElement(By.id("userNavigationLabel")).click();
	 Thread.sleep(4000);
	}

	@When("^click on logout$")
	public void click_on_logout() throws Throwable {
	    driver.findElement(By.xpath("//li[@data-gt='{\"ref\":\"async_menu\",\"logout_menu_click\":\"menu_logout\"}']")).click();
	}

	
	
	
	
}