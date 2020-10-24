package loginTest;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import generalFunctionality.GeneralFunctionality;

public class LoginTest extends GeneralFunctionality {
	
	WebDriver driver;
	String UserName;
	String Password;
	Login a;
	public LoginTest(String UserName,String Password) {
		this.UserName=UserName;
		this.Password=Password;
		Login a= new Login();
		this.a=a;
		System.out.println("Inside Constructior");
		System.out.println(this.UserName);
		System.out.println(this.Password);
	}
	

	@BeforeClass
	public void webdriverinitialize(ITestContext context) throws IOException 
	{
		
		context.setAttribute("username", this.UserName);
		this.driver=getDriver();
		System.out.println("Inside BeforeTest 2");
		
	}
	
	@Test(priority=0)
	public void login1(ITestContext context) throws InterruptedException 
	{	
		try {
			System.out.println("Inside login test methiod");
			context.setAttribute("username", this.UserName);
			String Welcome=a.loginmethod(driver,UserName,Password);
			Assert.assertEquals(Welcome, "Welcome To Manager's Page of Guru99 Bank");
			System.out.println("Inside Login Test yeyeyey");
		}
		catch (Exception e) {
			// TODO: handle exception
			Assert.fail("Incorrect Username and Password wirh username as "+this.UserName+" and password as "+this.Password);
		}
		
	}
	
	@Test(dependsOnMethods ={"login1"})
	public void logout(ITestContext context) throws InterruptedException 
	{	
		context.setAttribute("username", this.UserName);
		System.out.println(UserName+"  asasdakjllkfjsdklfjsdfldfasfasf " + Password);
			System.out.println("logout");
			a.logout(driver);
	}
	
	@AfterClass
	public void DriverClose(ITestContext context) 
	{
		context.setAttribute("username", this.UserName);
		System.out.println("asdasdasdas");
		driver.close();
		System.out.println("asdasdasdas");
	}
	

}
