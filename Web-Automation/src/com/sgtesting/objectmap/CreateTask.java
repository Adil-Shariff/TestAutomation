package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTask {
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
		createtask();
		deletetask();
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
			oBrowser.manage().window().maximize();
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
	static void createtask()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonaddnewtask")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickonnewtask")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("task1")).sendKeys("NewTask1");
			oBrowser.findElement(objectmap.getLocator("task2")).sendKeys("NewTask2");
			oBrowser.findElement(objectmap.getLocator("task3")).sendKeys("NewTask3");
			oBrowser.findElement(objectmap.getLocator("task4")).sendKeys("NewTask4");
			oBrowser.findElement(objectmap.getLocator("task5")).sendKeys("NewTask5");
			oBrowser.findElement(objectmap.getLocator("clickonaddtaskbutton")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletetask()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonselecttask")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickondeletetaskbutton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("clickondeletetaskpermanently")).click();
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
