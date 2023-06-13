package com.headless.phanthom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class headlessbrowserusingPhanthom {
	static WebDriver driver;
	
	public static void main(String args[])
	{
		
		System.setProperty("phantomjs.binary.path", "A:\\crm\\chromedriver_win32\\phantomjs.exe");
		
		driver = new PhantomJSDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		System.out.println("login page title : "+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("Bharath3696");
		driver.findElement(By.name("password")).sendKeys("crmpro1234567890");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("home page title : "+driver.getTitle());
		
		
		
	}
	
	

}
