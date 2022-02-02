package d28_01_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Zadatak
//		Napisati program koji vrsi dodavanje 5 reda u tabelu. 
//		Maksimizirati prozor
//		Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//		Dodati red podataka - jedan red u jednoj iteraciji 
//		Kliknite na dugme Add New
//		Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
//		Kliknite na zeleno Add dugme
//		Na kraju programa ugasite pretrazivac.


		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@type = 'button']")).click();
		driver.findElement(By.xpath("//input[last()][@name = 'name']")).sendKeys("Pera");
		driver.findElement(By.xpath("//input[last()][@name = 'department']")).sendKeys("HR");
		driver.findElement(By.xpath("//input[last()][@name = 'phone']")).sendKeys("123456");
		driver.findElement(By.xpath("//tr[last()]//a[@class = 'add']")).click();
//		driver.findElement(By.xpath("//*[@type = 'button']")).click();
//		driver.findElement(By.xpath("//input[last()][@name = 'name']")).sendKeys("Pera1");
//		driver.findElement(By.xpath("//input[last()][@name = 'department']")).sendKeys("HR1");
//		driver.findElement(By.xpath("//input[last()][@name = 'phone']")).sendKeys("123456");
//		driver.findElement(By.xpath("//tr[last()]//a[@class = 'add']")).click();
		driver.close();
		
		
		
	}

}
