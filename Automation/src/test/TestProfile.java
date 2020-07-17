package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import page.LoginPage;
import page.ProfilePage;

public class TestProfile 
{

	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driverss\\ChromeDriver1.exe");
		
	}
	@Test
	public  void mainMethod() throws InterruptedException, IOException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

	ChromeDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	LoginPage l1=new LoginPage(driver);
	l1.setcredentials("radhikabadai96@gmail.com","Radhika@1996");
	l1.clicklogin();
	l1.profile();
	Thread.sleep(2000);
	ProfilePage p1=new ProfilePage(driver);
	p1.edit();
	Thread.sleep(2000);
	p1.editbutton();
	p1.upload();
	Thread.sleep(3000);
	File f=new File("C:\\Users\\satis\\Desktop\\Auto2.exe");
	Runtime.getRuntime().exec(f.getAbsolutePath());
	Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)");	
    p1.save();
    Thread.sleep(5000);
   p1.close();
    p1.drop();
    Thread.sleep(2000);
    p1.logout();
    }}
