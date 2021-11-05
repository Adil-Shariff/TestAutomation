package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser1();
		createuser2();
		createuser3();
		loginasuser3logout();
		modifypasswordforuser3();
		loginasuser3logoutagain();
		modifypasswordforuser2();
		loginasuser2logoutagain();
		modifypasswordforuser1();
		loginasuser1logoutagain();
		deleteuser3();
		deleteuser2();
		deleteuser1();
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
	static void createuser1()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getCreateUser().click();
			Thread.sleep(3000);
			oPage.getFirstName().sendKeys("Demo1");
			oPage.getLastName().sendKeys("User1");
			oPage.getEmail().sendKeys("DemoUser1@gmail.com");
			oPage.getUserNameField().sendKeys("User1");
			oPage.getPassWord().sendKeys("12345");
			oPage.getRetypePassWord().sendKeys("12345");
			oPage.getCreateSubmitButton().click();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("12345");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getWelcomeWindow().click();
			Thread.sleep(3000);
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getCreateUser().click();
			Thread.sleep(3000);
			oPage.getFirstName().sendKeys("Demo2");
			oPage.getLastName().sendKeys("User2");
			oPage.getEmail().sendKeys("DemoUser2@gmail.com");
			oPage.getUserNameField().sendKeys("User2");
			oPage.getPassWord().sendKeys("123456");
			oPage.getRetypePassWord().sendKeys("123456");
			oPage.getCreateSubmitButton().click();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("123456");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getWelcomeWindow().click();
			Thread.sleep(3000);
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getCreateUser().click();
			Thread.sleep(3000);
			oPage.getFirstName().sendKeys("Demo3");
			oPage.getLastName().sendKeys("User3");
			oPage.getEmail().sendKeys("DemoUser3@gmail.com");
			oPage.getUserNameField().sendKeys("User3");
			oPage.getPassWord().sendKeys("1234567");
			oPage.getRetypePassWord().sendKeys("1234567");
			oPage.getCreateSubmitButton().click();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser3logout()
	{
		try
		{
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("1234567");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getWelcomeWindow().click();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifypasswordforuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("123456");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getModifyUser3().click();
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("123456");
			oPage.getRetypePassWord().sendKeys("123456");
			oPage.getSavechanges().click();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser3logoutagain()
	{
		try
		{
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("123456");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifypasswordforuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("12345");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getModifyUser2().click();
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("12345");
			oPage.getRetypePassWord().sendKeys("12345");
			oPage.getSavechanges().click();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser2logoutagain()
	{
		try
		{
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("12345");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifypasswordforuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getModifyUser1().click();
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("1234");
			oPage.getRetypePassWord().sendKeys("1234");
			oPage.getSavechanges().click();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser1logoutagain()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("12345");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getModifyUser3().click();
			Thread.sleep(3000); 
			oPage.getDeleteButton().click();
			Thread.sleep(3000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String str2=oAlert2.getText();
			System.out.println(str2);
			oAlert2.accept();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getDelete2().click();
			Thread.sleep(3000);
			oPage.getDeleteButton().click();
			Thread.sleep(3000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String str2=oAlert2.getText();
			System.out.println(str2);
			oAlert2.accept();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getUsers().click();
			Thread.sleep(3000);
			oPage.getDelete1().click();
			Thread.sleep(3000);
			oPage.getDeleteButton().click();
			Thread.sleep(3000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String str2=oAlert2.getText();
			System.out.println(str2);
			oAlert2.accept();
			Thread.sleep(3000);
			oPage.getLogout().click();
			Thread.sleep(3000);
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
