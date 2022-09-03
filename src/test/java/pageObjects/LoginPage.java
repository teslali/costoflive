package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By email = By.cssSelector("input[name='email']");
	By password = By.cssSelector("input[name='password']");
	By login = By.cssSelector("._button_button__aorpU.primary-button");
	By registerBtn = By.cssSelector("[href='\\/auth\\/signup']");
	
	public void emailEnter(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	
	public void password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void loginClick() {
		driver.findElement(login).click();
	}
			

}
