package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginPageStepDefinition {
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	LoginPage loginPage;
	
	public LoginPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
		this.loginPage =testContextSetup.pageObjectManager.getLoginPage();
	}
	
	@Then("^User entered (.+) and (.+)$")
	public void user_enter_email_and_password(String email, String password) throws InterruptedException {
		loginPage.emailEnter(email);
		loginPage.password(password);
		loginPage.loginClick();
		Thread.sleep(3000);
		
		Assert.assertEquals(landingPage.userAvatar(), true);
	    
	}
}
