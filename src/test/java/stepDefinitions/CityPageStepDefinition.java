package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.CityPage;
import pageObjects.ComparisonPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class CityPageStepDefinition {
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	LoginPage loginPage;
	ComparisonPage comparisonPage;
	CityPage cityPage;
	
	public CityPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
		this.loginPage =testContextSetup.pageObjectManager.getLoginPage();
		this.comparisonPage =testContextSetup.pageObjectManager.getComparisonPage();
		this.cityPage = testContextSetup.pageObjectManager.getCityPage();
		
	}
	
	@Then("^User added (.+) to product$")
	public void user_added_to_(Double Price) throws InterruptedException {
		cityPage.istBreadPrc(Price);
	    
	}
	
	

}
