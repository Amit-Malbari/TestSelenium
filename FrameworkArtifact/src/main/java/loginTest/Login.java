package loginTest;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import generalFunctionality.GeneralFunctionality;

public class Login extends GeneralFunctionality{
	public  String loginmethod(WebDriver driver, String UserName, String Password) throws InterruptedException 
	{
		String Welcome;
		try {
			driver.get(property().getProperty("URL"));
			Thread.sleep(7000);
			entertext(driver, "UserID", UserName);
			entertext(driver, "Password", Password);
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(5000);
			Welcome=driver.findElement(By.tagName("marquee")).getText();
		}
		catch (Exception e) {
			// TODO: handle exception
			Welcome="a";
			System.out.println(UserName+"  asfasfasf " + Password);
			driver.switchTo().alert().accept();
			
		}
		return Welcome;
		
	}
	
	
	public  void logout(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,7000)");
		 System.out.println("just before");
		 
		 WebDriverWait wait= new WebDriverWait(driver, 10000);
		 //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Log out"))));
		driver.findElement(By.linkText("Log out")).click();
		Alert alert= driver.switchTo().alert();
		alert.accept();	
		System.out.println("Pass");
	}

}
