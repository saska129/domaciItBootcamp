package d31_01_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		1.Zad
//		Napisati program koji:
//		Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//		Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice
//		i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//		POMOC: Brisite elemente odozdo.
//		(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
		driver.manage().window().maximize();
		
		List<WebElement> listaX = driver.findElements(By.className("close"));
		for (int i = listaX.size()-1; i >= 0; i--) {
			listaX.get(i).click();
			System.out.println("Element " + (1+i) + " je obrisan");
			Thread.sleep(3000);	
		}
		


		
		
		driver.close();
		
	}

}
