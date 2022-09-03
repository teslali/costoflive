package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	LoginPage loginPage;

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();

	}

	@Given("User is on landing page")
	public void user_is_on_landing_page() {
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("Cost of Live"));
	}

	@When("User clicked login button")
	public void user_clicked_login_button() {
		landingPage.loginBtn();

	}

	@When("User go to compare page")
	public void user_go_to_compare_page() throws InterruptedException {
		landingPage.comparisonBtn();
		Thread.sleep(3000);
	}

	@When("^User searched (.+)$")
	public void user_searched_istanbul(String City) throws InterruptedException {

		landingPage.mainHeaderLogo();
		Thread.sleep(2000);
		landingPage.search(City);
		Thread.sleep(2000);
		landingPage.clickIst();
		Thread.sleep(2000);
	}

}
