package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oUsers;
	public WebElement getUsers()
	{
		return oUsers;
	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oCreateUser;
	public WebElement getCreateUser()
	{
		return oCreateUser;
	}
	//user1
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFirstName()
	{
		return userDataLightBox_firstNameField;
	}
	//last name
	private WebElement userDataLightBox_lastNameField;
	public WebElement getLastName()
	{
		return userDataLightBox_lastNameField;
	}
	//email
	private WebElement userDataLightBox_emailField;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}
	//loginusername field
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserNameField()
	{
		return userDataLightBox_usernameField;
	}
	//password field
	private WebElement userDataLightBox_passwordField;
	public WebElement getPassWord()
	{
		return userDataLightBox_passwordField;
	}
	//Retype PassWord
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getRetypePassWord()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oCreateSubmitButton;
	public WebElement getCreateSubmitButton()
	{
		return oCreateSubmitButton;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oUser1;
	public WebElement getUser1()
	{
		return oUser1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement oDeleteButton;
	public WebElement getDeleteButton()
	{
		return oDeleteButton;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oSavechanges;
	public WebElement getSavechanges()
	{
		return oSavechanges;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement oTasks;
	public WebElement getTasks()
	{
		return oTasks;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oAddTasks;
	public WebElement getAddTasks()
	{
		return oAddTasks;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oCustomer;
	public WebElement getCustomer()
	{
		return oCustomer;
	}
	//customer
	private WebElement customerLightBox_nameField;
	public WebElement getCustomername()
	{
		return customerLightBox_nameField;
	}
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement oclickoncretecustomer;
	public WebElement getclickoncretecustomer()
	{
		return oclickoncretecustomer;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oClickCustomer;
	public WebElement getlCickcustomer()
	{
		return oClickCustomer;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement oActions;
	public WebElement getActions()
	{
		return oActions;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement oDeleteCustomer;
	public WebElement getDeleteCustomer()
	{
		return oDeleteCustomer;
	}
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement oConfirmdeletecustomer;
	public WebElement getConfirmdeletecustomer()
	{
		return oConfirmdeletecustomer;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement oCustomernameModify;
	public WebElement getCustomernameModify()
	{
		return oCustomernameModify;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement oClearcustomername;
	public WebElement getClearcustomername()
	{
		return oClearcustomername;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oClickonnewcustomer;
	public WebElement getClickonnewcustomer()
	{
		return oClickonnewcustomer;
	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement oClickonTasksagain;
	public WebElement getClickonTasksagain()
	{
		return oClickonTasksagain;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectName()
	{
		return projectPopup_projectNameField;
	}
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement oProjectbutton;
	public WebElement getProjectButton()
	{
		return oProjectbutton;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oClickonprojectbutton;
	public WebElement getClickonprojectbutton()
	{
		return oClickonprojectbutton;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oProjectAction;
	public WebElement getProjectAction()
	{
		return oProjectAction;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement oProjectDelete;
	public WebElement getProjectDelete()
	{
		return oProjectDelete;
	}
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement oProjectDeletePermanently;
	public WebElement getProjectDeletePermanently()
	{
		return oProjectDeletePermanently;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement oProjectModify;
	public WebElement getProjectModify()
	{
		return oProjectModify;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement oProjectButton;
	public WebElement getProejectButton()
	{
		return oProjectButton;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[2]")
	private WebElement oProjectinput;
	public WebElement getProjectinput()
	{
		return oProjectinput;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement oCreateTask;
	public WebElement getCreateTask()
	{
		return oCreateTask;
	}
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement oAddontask;
	public WebElement getAddonTask()
	{
		return oAddontask;
	}
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement oTaskName;
	public WebElement getTaskName()
	{
		return oTaskName;
	}
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement oTaskCreateButton;
	public WebElement getTaskCreateButton()
	{
		return oTaskCreateButton;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div/div")
	private WebElement oClickonTakstodelete;
	public WebElement getClickonTakstodelete()
	{
		return oClickonTakstodelete;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]/span")
	private WebElement oDeleteTask;
	public WebElement getDeleteTask()
	{
		return oDeleteTask;
	}
	@FindBy(xpath="//*[@id=\'deleteTaskPopup_deleteConfirm_submitTitle\']")
	private WebElement oDeleteTaskButton;
	public WebElement getDeleteTaskButton()
	{
		return oDeleteTaskButton;
	}
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement oWelcomeWindow;
	public WebElement getWelcomeWindow()
	{
		return oWelcomeWindow;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oModifyUser1;
	public WebElement getModifyUser1()
	{
		return oModifyUser1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oSaveChanges;
	public WebElement getSaveChanges()
	{
		return oSaveChanges;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oModifyUser2;
	public WebElement getModifyUser2()
	{
		return oModifyUser2;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oModifyUser3;
	public WebElement getModifyUser3()
	{
		return oModifyUser3;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oDeleteUser2;
	public WebElement getDeleteUser2()
	{
		return oDeleteUser2;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oDeleteUser3;
	public WebElement getDeleteUser3()
	{
		return oDeleteUser3;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oDelete2;
	public WebElement getDelete2()
	{
		return oDelete2;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oDelete1;
	public WebElement getDelete1()
	{
		return oDelete1;
	}
}
