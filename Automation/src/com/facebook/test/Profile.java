package com.facebook.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Profile

	{
		public static void main(String[] args) throws InterruptedException, IOException
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
		

	System.setProperty("webdriver.chrome.driver","C:\\Driverss\\ChromeDriver1.exe");
			ChromeDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://www.facebook.com/");
		      driver.findElement(By.id("email")).sendKeys("radhikabadai96@gmail.com");
		    driver.findElement(By.id("pass")).sendKeys("Radhika@1996");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector(".\\_1vp5")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@aria-label='Edit Profile']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Edit'][1]")).click();
			driver.findElement(By.xpath("//span[text()='Upload Photo']")).click();
			Thread.sleep(2000);
			File f=new File("C:\\Users\\satis\\Desktop\\Auto2.exe");
			Runtime.getRuntime().exec(f.getAbsolutePath());
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,200)");	
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//div[@aria-label='Save']")).click();
	         //Thread.sleep(2000);
	         //driver.findElement(By.xpath("//div[@aria-label='Close']")).click();
	         driver.findElement(By.xpath("//span[text()='Add'])[1]")).click();
		
	}
	
}
