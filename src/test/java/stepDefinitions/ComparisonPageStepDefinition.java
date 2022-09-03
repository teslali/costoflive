package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.ComparisonPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import utils.TestContextSetup;


public class ComparisonPageStepDefinition {
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	LoginPage loginPage;
	ComparisonPage comparisonPage;
	
	public ComparisonPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
		this.loginPage =testContextSetup.pageObjectManager.getLoginPage();
		this.comparisonPage =testContextSetup.pageObjectManager.getComparisonPage();
		
	}
	





@Then("^User compared (.+) and (.+)$")
	public void user_compared_istanbul_and_toronto(String CityOne, String CityTwo) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    comparisonPage.compFirstCity(CityOne);
	    Thread.sleep(500);
	    comparisonPage.compSecondCity(CityTwo);
	    comparisonPage.compareBtn();
}
	
	
	
	
	
	
}
