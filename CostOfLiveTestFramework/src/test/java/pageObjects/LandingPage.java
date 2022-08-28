package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	//Locaters for first row and other rows are different
	
	By mainHeaderLogo = By.cssSelector(".main-header-logo");
	By homeBtn = By.linkText("HOME");
	By comparisonBtn = By.linkText("Comparison");
	By countriesBtn = By.linkText("Countries");
	By headerBlogBtn = By.cssSelector("//ul[2]/?/?/a[@innertext='Blog']");
	By loginBtn = By.linkText("Login");
	By currencyBtn = By.cssSelector(".main-header-menu-item-content");
	By search = By.cssSelector("input");
	By firstRowFirstCity = By.xpath("//section[1]/div/div[1]");
	By secondRowFirstCity = By.xpath("//div/div[5]");
	By firstBlogLink = By.xpath("//article[1]/?/?/a[@innertext='Read More on Blog']");
	By secondBlogLink = By.xpath("//article[2]/?/?/a[@innertext='Read More on Blog']");
	By thirdBlogLink = By.xpath("//article[3]/?/?/a[@innertext='Read More on Blog']");
	By firstPopComp = By.cssSelector("div:nth-of-type(1) > ._card_card-body__mOMEH > h3 > a");
	By secondPopComp = By.cssSelector("div:nth-of-type(2) > ._card_card-body__mOMEH > h3 > a");
	By thirdPopComp = By.cssSelector("div:nth-of-type(3) > ._card_card-body__mOMEH > h3 > a");
	By fourthPopComp = By.cssSelector("div:nth-of-type(4) > ._card_card-body__mOMEH > h3 > a");
	By fifthPopComp = By.cssSelector("div:nth-of-type(5) > ._card_card-body__mOMEH > h3 > a");
	By about = By.linkText("About");
	By footerBlogBtn = By.cssSelector(".main-footer [href='\\/blog']");
	By faq = By.linkText("Frequently Asked Questions");
	By footerPopComp = By.cssSelector("section:nth-of-type(1) > ul:nth-of-type(2) > li:nth-of-type(2) > a");
	By recAddedPrc = By.cssSelector("li:nth-of-type(2) > a > strong");
	By twitterBtn = By.cssSelector(".twitter-button");
	//this will replace
	By userAvatar = By.cssSelector(".user-avatar");
	
	public void mainHeaderLogo() {
		driver.findElement(mainHeaderLogo).click();
	}
	
	public void homeBtn() {
		driver.findElement(homeBtn).click();
	}
	
	public void comparisonBtn() {
		driver.findElement(comparisonBtn).click();
	}
	
	public void countriesBtn() {
		driver.findElement(countriesBtn).click();
	}
	
	public void headerBlogBtn() {
		driver.findElement(headerBlogBtn).click();
	}
	
	public void loginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void currencyBtn() {
		driver.findElement(currencyBtn).click();
	}
	
	public void search(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void firstRowFirstCity() {
		driver.findElement(firstRowFirstCity).click();
	}
	
	public void secondRowFirstCity() {
		driver.findElement(secondRowFirstCity);
	}	
	
	public void firstBlogLink() {
		driver.findElement(firstBlogLink).click();
	}
	
	public void secondBlogLink() {
		driver.findElement(secondBlogLink).click();
	}
	
	public void thirdBlogLink() {
		driver.findElement(thirdBlogLink).click();
	}
	
	public void firstPopComp() {
		driver.findElement(firstPopComp).click();
	}
	
	public void secindPopComp() {
		driver.findElement(secondPopComp).click();
	}
	
	public void thirdPopComp() {
		driver.findElement(thirdPopComp).click();
	}
	
	public void fourthPopComp() {
		driver.findElement(fourthPopComp).click();
	}
	
	public void fifthPopComp() {
		driver.findElement(fifthPopComp).click();
	}
	
	public void about() {
		driver.findElement(about).click();
	}
	
	public void footerBlogBtn() {
		driver.findElement(footerBlogBtn).click();
	}
	
	public void faq() {
		driver.findElement(faq).click();
	}
	public void footerPopComp() {
		driver.findElement(footerPopComp).click();
	}
	
	public void recAddedPrc() {
		driver.findElement(recAddedPrc).click();
	}
	
	public void twitterBtn() {
		driver.findElement(twitterBtn).click();
	}	
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
	public boolean userAvatar() {
		return driver.findElement(userAvatar).isDisplayed();
	}
	
}