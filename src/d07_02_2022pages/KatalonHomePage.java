package d07_02_2022pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KatalonHomePage {
	
	private WebDriver driver;
	
	public KatalonHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getShopLink () {
		return driver.findElement(By.xpath("//li[contains(@class, 'page_item page-item-7')]//a"));
	}
}
