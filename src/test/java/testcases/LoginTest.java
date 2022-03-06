package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	public void LoginFailiureTest() {
		
		LoginPage login = new LoginPage();
		
		
		login.LoginFunction("xyz@abc.com","@854Sumit");
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		
		Assert.assertEquals(ActualMsg, ExpMsg);	
		
	}
	
	@Test
	public void LoginSuccessTest() {
		

		LoginPage login = new LoginPage();
		login.LoginFunction("sumit.rusia3@gmail.com", "@854Sumit#");
		
		
	}
	
	

}
