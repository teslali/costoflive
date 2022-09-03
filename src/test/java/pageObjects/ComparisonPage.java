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
	By compareBtn = By.xpath("//button");
	By firstLatestComp = By.cssSelector("li:nth-of-type(1) > ._card_card__oFGNu");

	public void compFirstCity(String FirstCity) throws InterruptedException {
		driver.findElement(compFirstCity).sendKeys(FirstCity);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".type-ahead-results-item")).click();
	}
	
	public void compSecondCity(String SecondCity) throws InterruptedException {
		driver.findElement(compSecondCity).sendKeys(SecondCity);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".type-ahead-results-item:nth-child(1) > small")).click();
		Thread.sleep(1000);
	}
	
	public void compareBtn() throws InterruptedException {
		driver.findElement(compareBtn).click();
		Thread.sleep(5000);
	}
	
	public void firstLatestComp() {
		driver.findElement(firstLatestComp).click();
	}

}
