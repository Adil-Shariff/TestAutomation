package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {
	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonuser")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonaddusers")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("firstnameofuser")).sendKeys("Demo");
			oBrowser.findElement(objectmap.getLocator("lastnameofusers")).sendKeys("User1");
			oBrowser.findElement(objectmap.getLocator("emailofusers")).sendKeys("DemoUser1@gamil.com");
			oBrowser.findElement(objectmap.getLocator("logindetails")).sendKeys("DemoUser1");
			oBrowser.findElement(objectmap.getLocator("passwordfield")).sendKeys("12345");
			oBrowser.findElement(objectmap.getLocator("retypepasswordfield")).sendKeys("12345");
			oBrowser.findElement(objectmap.getLocator("createuserbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonfirstuser")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("firstnameofuser")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("firstnameofuser")).sendKeys("New Demo");
			oBrowser.findElement(objectmap.getLocator("clickonsavechanges")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonfirstuser")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickondeletebutton")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
