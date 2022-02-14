package d07_02_2022pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KatalonProductPage {
	
	private WebDriver driver;
	
	
	
	public KatalonProductPage( WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getInputQuantity() {
		return	driver.findElement(By.xpath("//div[@class='quantity']/input"));
		}
	
	public void InputQuantity(String quantity) {
		getInputQuantity().click();
		getInputQuantity().clear();
		getInputQuantity().sendKeys(quantity);
	}
	
	public WebElement getAddBtn() {
		return driver.findElement(By.xpath("//*[@class='single_add_to_cart_button button alt']"));
	}
	
	public String getMessage() {
		  return driver.findElement(By.xpath("//*[@role='alert']")).getText();
	  }
	
	public WebElement getViewCartBtn() {
		  return driver.findElement(By.xpath("//*[@class='button wc-forward']"));
	  }
	
	
	
}
