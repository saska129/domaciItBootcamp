package d04_02_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak1 {

//		Umesto prvog za Udemy imamo kupujem prodajem.
//		Ucitajte stranicu (ako treba gasite onaj dijalog sto iskace)
//		Ukucajte za pretragu iphone
//		postavice za valutu eure
//		Sortirajte prema ceni da bude najjefinije prvo
//		Onda izvrsite proveru sortiranja kao sto je bilo za udemy
//		
//		Sortirajte rezultate pretrage prema rejtingu (Highest Rated)
//		Dohvatite rejting prvog rezultata pretrage
//		Dohvatite rejting zadnjeg rezultata pretrage (HELP: trebace vam getText metoda)
//			[HELP] Dohvatite rejting kao listu  pa iz liste izvucite prvi i zadnji element.
//			//*[@data-purpose=\"rating-number\"]
//		Proverite da li je reting prvog veci od rejtinga zadnjeg rezultata
//		pretvaranje stringa u double link ce vam trebati za ovaj zadatak

		WebDriver driver;
		
		@BeforeMethod
		public void before() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.kupujemprodajem.com/");
		driver.manage().window().maximize();
		}
		
		@Test
		public void sortTest() throws InterruptedException {
		driver.findElement(By.className("kpBoxCloseButton")).click();
		driver.findElement(By.id("searchKeywordsInput")).sendKeys("iphone");
		driver.findElement(By.id("searchKeywordsInput")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("priceSecondSelection")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='eur']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='priceSelection']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='searchButton secondarySearchButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='orderSecondSelection']//div[@class='choiceLabel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-value='price']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='searchButton secondarySearchButton']")).click();
		
		
		List<WebElement> cene = driver.findElements(By.xpath("//*[@class='adPrice ']"));
		
		String prvi = cene.get(0).getText();
		String prviIznos = prvi.split("\\s")[0];
		String prviValuta = prvi.split("\\s")[1];
//		System.out.println(prviIznos);
//		System.out.println(prviValuta);
		Double prviCena = Double.parseDouble(prviIznos);
		
		String poslednji = cene.get(cene.size()-1).getText();  
		String poslednjiIznos = poslednji.split("\\s")[0];
		String poslednjiValuta = poslednji.split("\\s")[1];
		Double poslednjiCena = Double.parseDouble(poslednjiIznos);
		
		
		if (prviValuta.equals("din")) {
			prviCena = prviCena/117.62;
		}
		
		if (poslednjiValuta.equals("din")) {
			poslednjiCena = poslednjiCena/117.62;
		}
		
		Assert.assertTrue(prviCena <= poslednjiCena, "Nije dobar redosled");
		}
		
		
	}


