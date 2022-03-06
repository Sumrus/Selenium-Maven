package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testcases.BaseClass;

public class LoginPage {
	
public void LoginFunction(String UserNameVal, String PasswordVal) {
	
	WebDriver driver = BaseClass.driver;
		
		WebDriverWait wait = new WebDriverWait(driver,50);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		wait.until(ExpectedConditions.elementToBeClickable(LoginLink));
		
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Rememberme = driver.findElement(By.className("rememberMe"));
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		
		
		
		
		UserName.sendKeys(UserNameVal);
		Password.sendKeys(PasswordVal);
		Rememberme.click();
		LoginBtn.click();
		
	}

}
