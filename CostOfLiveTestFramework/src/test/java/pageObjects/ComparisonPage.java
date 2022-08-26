package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparisonPage {
	public WebDriver driver;

	public ComparisonPage(WebDriver driver) {
		this.driver = driver;

	}

	By compFirstCity = By.cssSelector(".intro-body .city-search-type-ahead:nth-child(2) [type]");
	By compSecondCity = By.cssSelector(".intro-body .city-search-type-ahead:nth-child(3) [type]");
	By compareBtn = By.xpath("///button[@innertext='Compare']");
	By firstLatestComp = By.cssSelector("li:nth-of-type(1) > ._card_card__oFGNu");

	public void compFirstCity(String FirstCity) {
		driver.findElement(compFirstCity).sendKeys(FirstCity);
		driver.findElement(By.linkText(FirstCity)).click();
	}
	
	public void compSecondCity(String SecondCity) {
		driver.findElement(compSecondCity).sendKeys(SecondCity);
		driver.findElement(By.linkText(SecondCity)).click();
	}
	
	public void compareBtn() {
		driver.findElement(compareBtn).click();
	}
	
	public void firstLatestComp() {
		driver.findElement(firstLatestComp).click();
	}

}
