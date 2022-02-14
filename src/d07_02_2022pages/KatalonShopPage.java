package d07_02_2022pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KatalonShopPage {
	
	private WebDriver driver;
	
	public KatalonShopPage(WebDriver driver) {
		  this.driver=driver;
	  }
	
	public WebElement getFirst () {
		return driver.findElement(By.xpath("//li[contains(@class,'post-54')]/div/a[contains(@class,'woocommerce-loop-product__link')]"));
	}
	
}
