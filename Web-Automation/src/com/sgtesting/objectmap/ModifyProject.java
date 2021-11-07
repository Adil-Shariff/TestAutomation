package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyProject {
	public static WebDriver oBrowser=null;

	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		createproject();
		modifyproject(); 
		deleteproject();
		deletecustomer();
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
	static void createcustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickontasks")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonaddnew")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonnewcustomer")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("customerdetails")).sendKeys("Customer1");
			oBrowser.findElement(objectmap.getLocator("clickonnewcustomerbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createproject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonaddnew")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonnewproject")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("projectdetail")).sendKeys("Project1");
			oBrowser.findElement(objectmap.getLocator("clickonprojectbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyproject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonprojectagain")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonprojecttomodify")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("projecttomodify")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("projecttomodify")).sendKeys("NewProject1");
			oBrowser.findElement(objectmap.getLocator("clickonprojectagain")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteproject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonprojectagain")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectactionbutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectdeletebutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectdeletebuttonpermanently")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletecustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickoncustomeragain")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonaction")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickoncustomerdeletebutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickondeletepermanently")).click();
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
