package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyProject {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		clickoncustomer();
		modifyproject();
		deleteproject();
		clickoncustomeragain();
		deletecustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
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
			oPage.getTasks().click();
			Thread.sleep(3000);
			oPage.getAddTasks().click();
			Thread.sleep(3000);
			oPage.getCustomer().click();
			Thread.sleep(3000);
			oPage.getCustomername().sendKeys("Customer1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void clickoncustomer()
	{
		try
		{
			oPage.getclickoncretecustomer().click();
			Thread.sleep(3000);
			oPage.getAddTasks().click();
			Thread.sleep(3000);
			oPage.getClickonTasksagain().click();
			Thread.sleep(3000);
			oPage.getProjectName().sendKeys("Project1");
			oPage.getProjectButton().click();
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
			oPage.getClickonprojectbutton().click();
			Thread.sleep(3000);
			oPage.getProejectButton().click();
			Thread.sleep(3000);
			oPage.getProjectModify().clear();
			Thread.sleep(3000);
			oPage.getProjectModify().sendKeys("NewProject");
			oPage.getClickonprojectbutton().click();
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
		oPage.getClickonprojectbutton().click();
		Thread.sleep(3000);
		oPage.getProjectAction().click();
		Thread.sleep(3000);
		oPage.getProjectDelete().click();
		Thread.sleep(3000);
		oPage.getProjectDeletePermanently().click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void clickoncustomeragain()
	{
		try
		{
			oPage.getlCickcustomer().click();
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
			oPage.getActions().click();
			Thread.sleep(3000);
			oPage.getDeleteCustomer().click();
			Thread.sleep(3000);
			oPage.getConfirmdeletecustomer().click();
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
			oPage.getLogout().click();
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
