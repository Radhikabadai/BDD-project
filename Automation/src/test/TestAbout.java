package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import page.AboutPage;
import page.LoginPage;

public class TestAbout 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driverss\\ChromeDriver1.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, IOException
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
	AboutPage a1=new AboutPage(driver);
    a1.about();
}}
