package d07_02_2022tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d07_02_2022pages.KatalonCartPage;
import d07_02_2022pages.KatalonHomePage;
import d07_02_2022pages.KatalonProductPage;
import d07_02_2022pages.KatalonShopPage;

public class KatalonTest {
	
	private WebDriver driver;
		private KatalonHomePage hp;
		private KatalonShopPage sp;
		private KatalonProductPage pp;
		private KatalonCartPage cp;
		
		@BeforeMethod
		public void before() {
			System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
						
			hp = new KatalonHomePage(driver);
			sp = new KatalonShopPage(driver);
			pp = new KatalonProductPage(driver);
			cp = new KatalonCartPage(driver);

		}		
		
		@Test
		
		public void Shoping() throws InterruptedException {
			driver.get("http://cms.demo.katalon.com/");
			Thread.sleep(2000);
			hp.getShopLink().click();
			sp.getFirst().click();
			pp.InputQuantity("2");
			pp.getAddBtn().click();
			Thread.sleep(2000);
			Assert.assertTrue(pp.getMessage().contains("have been added to your cart"), "Product not added");
			pp.getViewCartBtn().click();
			Thread.sleep(2000);
			Assert.assertEquals(cp.numberOfProducts().size(), 1);
			Assert.assertEquals(cp.getQuantityInfo(), "2", "Quantity is not adequate");
			cp.getRemoveBtn().click();
			Thread.sleep(2000);
			Assert.assertEquals(cp.getRemoveMsg(), "Your cart is currently empty.", "Cart not empty");
		}	
		
		
		
}
