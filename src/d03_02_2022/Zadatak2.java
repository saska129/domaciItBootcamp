package d03_02_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2.Zadatak
//		Napisati program koji:
//			Ucitava stanicu https://www.wikipedia.org/
//			Sa stranice sakuplja sve linkove (jezike) i svaki link otvara u novom prozoru pretrazivaca
//			Svaki link potrebno je otvoriti u novom tabu.
//			Skripta: window.open(arguments[0]);


		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> linkovi = driver.findElements(By.xpath("//a[contains(@id, 'js-link-box')]"));
		
		
		for (int i = 0; i < linkovi.size(); i++) {
			js.executeScript("window.open(arguments[0])", linkovi.get(i).getAttribute("href"));	
		}
		driver.quit();
	}

}
