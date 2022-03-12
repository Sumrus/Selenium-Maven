package testcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	public void LoginFailiureTest() {
		
		test = report.startTest("LoginFailiureTest");
		
		LoginPage login = new LoginPage();
		
		
		login.LoginFunction("xyz@abc.com","@854Sumit");
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		
		AssertJUnit.assertEquals(ActualMsg, ExpMsg);	
		
		report.endTest(test);
		
	}
	
	@Ignore
	@Test
	public void LoginSuccessTest() {
		

		LoginPage login = new LoginPage();
		login.LoginFunction("sumit.rusia3@gmail.com", "@854Sumit#");
		
		
	}
	
	@Ignore
	@Test
	@Parameters ({"Param1","Param2"})
	public void ParameterizedTest(String UserNameVal, String PasswordVal) {
		
		LoginPage login = new LoginPage();
		login.LoginFunction(UserNameVal,PasswordVal);
		
	}
	
	@Ignore
	@Test
	public void ExternalDataTes() {
		
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		
		LoginPage login = new LoginPage();
		login.LoginFunction(UserNameVal,PasswordVal);
	}
	
	

}
