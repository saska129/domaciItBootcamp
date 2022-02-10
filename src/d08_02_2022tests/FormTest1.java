package d08_02_2022tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import d07_02_2022pages.FormPage;
import d08_02_2022pages.FormPage1;
import p08_02_2022_pages.LoginPage1;

public class FormTest1 {

//	FormTest
//	Ucitava stranicu
//	Popunite formu proizvoljnim podacima
//	Submitujte formu 
//	Proverite da li su podaci uspesno sacuvani. (imate metodu iz page-a koja vam vraca da li je uspesno sacuvano, iskorisite je)
//	U AfterClass metodi zatvaramo stranicu

	
	private WebDriver driver;
	private FormPage1 fp;
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		fp = new FormPage1 (driver);
		driver.get("file:///C:/Users/sashka/Desktop/form.html");
		
	}
	
	
	@Test
	public void formTest() throws InterruptedException, IOException {
		SoftAssert softAssertion= new SoftAssert();
		File file = new File("data/FormData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("form");
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/sashka/Desktop/form.html");	
		
		for (int i = 1; i < 7; i++) {
			String fullName = sheet.getRow(i).getCell(0).getStringCellValue();	
			String gander = sheet.getRow(i).getCell(1).getStringCellValue();	
			Date date = sheet.getRow(i).getCell(2).getDateCellValue();
			String dateString = df.format(date);
			String email = sheet.getRow(i).getCell(3).getStringCellValue();	
			String role = sheet.getRow(i).getCell(4).getStringCellValue();
			String checkbox = sheet.getRow(i).getCell(5).getStringCellValue();
			String comment = sheet.getRow(i).getCell(6).getStringCellValue();
			fp.getFullName().sendKeys(fullName);
			fp.getGenderRadioButton(gander).click();
			fp.getDateOfBirth().sendKeys(dateString);
			fp.getEmail().sendKeys(email);
			fp.getRole().selectByValue(role);	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("comment")));
			Thread.sleep(2000);
		    fp.getCheckbox(checkbox).click();
			fp.getComment().sendKeys(comment);
			fp.getSubmitButton().click();
			
			softAssertion.assertTrue(fp.jeSacuvano(), "Nije sacuvano u iteraciji" +i);		
			
			fp.mozeDalje();
			driver.navigate().refresh();	
		}
				
		softAssertion.assertAll();

	
	
	}
		
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	
}
