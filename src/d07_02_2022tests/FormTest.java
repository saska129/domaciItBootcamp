package d07_02_2022tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d07_02_2022pages.FormPage;
import p08_02_2022_pages.LoginPage1;

public class FormTest {

//	FormTest
//	Ucitava stranicu
//	Popunite formu proizvoljnim podacima
//	Submitujte formu 
//	Proverite da li su podaci uspesno sacuvani. (imate metodu iz page-a koja vam vraca da li je uspesno sacuvano, iskorisite je)
//	U AfterClass metodi zatvaramo stranicu

	
	private WebDriver driver;
	private FormPage fp;
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		fp = new FormPage (driver);
		driver.get("file:///C:/Users/sashka/Desktop/form.html");
		
	}
	
	
	@Test
	public void formTest() throws InterruptedException {
		
		driver.get("file:///C:/Users/sashka/Desktop/form.html");
		fp.getFullName().sendKeys("Pera Peric");
		Thread.sleep(2000);
		fp.getGenderRadioButton("male").click();
		Thread.sleep(2000);
		fp.getDateOfBirth().sendKeys("12.10.1993.");
		Thread.sleep(2000);
		fp.getEmail().sendKeys("peraperic@gmail.com");
		Thread.sleep(2000);
		fp.getRole().selectByValue("QA");	
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("comment")));
		Thread.sleep(2000);
	    fp.getCheckbox("read_books").click();
		Thread.sleep(2000);
		fp.getComment().sendKeys("Comment");
		Thread.sleep(2000);
		fp.getSubmitButton().click();
		Thread.sleep(2000);
		Assert.assertTrue(fp.jeSacuvano(), "Nije sacuvano");
		}
		
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	
}
