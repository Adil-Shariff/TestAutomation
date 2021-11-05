package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		users();
		CreateUsers();
		firstname();
		lastname();
		email();
		username();
		password();
		retypepassword();
		clickonsubmitbutton();
		clickonuser1();
		ModifyUser();
		savechanges();
		clickonuser1();
		deletebutton();
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
	static void users()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateUsers() 
	{
		try
		{
			oPage.getCreateUser().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void firstname()
	{
		try
		{
			oPage.getFirstName().sendKeys("Demo");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void lastname()
	{
		try
		{
			oPage.getLastName().sendKeys("User");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void email()
	{
		try
		{
			oPage.getEmail().sendKeys("DemoUser@gmail.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void username()
	{
		try
		{
			oPage.getUserNameField().sendKeys("User1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void password()
	{
		try
		{
			oPage.getPassWord().sendKeys("12345");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void retypepassword()
	{
		try
		{
			oPage.getRetypePassWord().sendKeys("12345");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void clickonsubmitbutton()
	{
		try
		{
			oPage.getCreateSubmitButton().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void clickonuser1()
	{
		try
		{
			oPage.getUser1().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void ModifyUser()
	{
		try
		{
			oPage.getFirstName().clear();
			Thread.sleep(3000);
			oPage.getFirstName().sendKeys("NewDemoUser");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void savechanges()
	{
		try
		{
			oPage.getSavechanges().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletebutton()
	{
		try
		{
			oPage.getDeleteButton().click();
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
