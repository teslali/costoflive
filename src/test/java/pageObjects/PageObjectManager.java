package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public WebDriver driver;
	public LoginPage loginPage;
	public ComparisonPage comparisonPage;
	public CityPage cityPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public LandingPage getLandingPage()
	{
	
	 landingPage= new LandingPage(driver);
	 return landingPage;
	}
	
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(driver);
		return loginPage;
	}
	
	public ComparisonPage getComparisonPage() {
		comparisonPage = new ComparisonPage(driver);
		return comparisonPage;
	}
	
	public CityPage getCityPage() {
		cityPage = new CityPage(driver);
		return cityPage;
	}
	
}
