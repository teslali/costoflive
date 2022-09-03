package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CityPage {
	public WebDriver driver;

	public CityPage(WebDriver driver) {
		this.driver = driver;

	}
	
	By istBreadPrc = By.cssSelector(".collapse:nth-child(4) .table-body-row:nth-child(2) > .table-body-row-cell > .\\_button_button__aorpU");
	By barcWaterPrc = By.cssSelector("._city-prices_markets__TMyal .table-body-row:nth-of-type(5) [alt='Plus icon for add price']");
	By addPrc = By.cssSelector("input");
	By saveBtn = By.cssSelector("._button_primary-button__a10yE");
	
	public void istBreadPrc(Double Bread) throws InterruptedException {
		driver.findElement(istBreadPrc).click();
		driver.findElement(addPrc).sendKeys(String.valueOf(Bread));
		Thread.sleep(2000);
		driver.findElement(saveBtn).click();
		Thread.sleep(2000);
	}
	
	public void barcWaterPrc(Double Water) throws InterruptedException {
		driver.findElement(barcWaterPrc).click();
		driver.findElement(addPrc).sendKeys(String.valueOf(Water));
		Thread.sleep(2000);
		driver.findElement(saveBtn).click();
		Thread.sleep(2000);
	}

}
