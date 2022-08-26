package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Countries {
	public WebDriver driver;

	public Countries(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By allCountryBtn = By.linkText("All Countries");
	By firstCountry = By.cssSelector("._card_card__oFGNu._cities_cities-section-country-list__tM0Jw > li:nth-of-type(2) > a");
	//increase the number inside the curly brackets if you want to select different country
	
	
	public void allCountryBtn() {
		driver.findElement(allCountryBtn).click();
	}
	
	public void firstCountry() {
		driver.findElement(firstCountry).click();
	}


}
