package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import page.LoginPage;

        public class TestLogin 
         {

	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driverss\\ChromeDriver1.exe");
		
	}
	public static void main(String[] args) throws InterruptedException
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
	// p1.save();
	  //  Thread.sleep(2000);
	   // js.executeScript("window.scrollBy(0,200)");
	    //Thread.sleep(2000);
	   //p1.add();
	    //p1.describe("Iam so honest person");
	// @FindBy(xpath="(//span[text()='Edit'])[3]")
	 //   private WebElement add;
	   // @FindBy(xpath="//textarea[@placeholder='Describe who you are']")
	    //private WebElement describe;
	    //@FindBy(xpath="//span[text()='Save']")
	    //private WebElement descsave;
	    //@FindBy(xpath="//span[text()='Share Now']")
	    //private WebElement share;
	    //@FindBy(xpath="(//span[text()='Add'])[1]")
	    //private WebElement addetails;
	    ///@FindBy(xpath="(//span[text()='Add a workplace'])[2]")
	    //private WebElement Workplace;
	   
	//public void add()
    //{
	//add.click();
      //}
    //public void describe(String who)
    //{
   	 //describe.sendKeys(who);
    //}
    //public void descsave()
    //{
   	 //descsave.click();
    //}
    //public void share()
    //{
   	 //share.click();
   // }
 // public void addetails()
 // {
	//   addetails.click();
  //}
  //public void workplace()
 // {
	//   Workplace.click();
  //}
	}
	}


