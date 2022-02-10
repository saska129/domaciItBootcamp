package d07_02_2022pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
//	FormPage koja ima:
//	getere za sve inpute
//	geter za radio - //*[@name='gender'][@value='"+ radioValue +"'] - kao parametar prima value (male/female/middle) tog radio dugmeta
//	geter za checkbox inpute - //*[@type='checkbox'][@value='"+ checkboxValue +"']  - kao parametar prima value (read_books,
//	online_courses, opensource, tech_cons, tech_blogs, via_delivery - jednu od ovde navedenih) tog checkbox inputa
//	getter koji hvata dugme treba da ceka da element postane klikabilan pre nego sto vrati element. Koristite waiter za ovaj slucaj.
//	metodu koja vraca da li su podaci uspesno sacuvani, tako sto proverava da li element 
//	koji nosi poruku za atribut style ima vrednost "visibility: visible"

	private WebDriver driver;

	public FormPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFullName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getGenderRadioButton(String radioValue) {
		return driver.findElement(By.xpath("//*[@name='gender'][@value='" + radioValue + "']"));
	}

	public WebElement getDateOfBirth() {
		return driver.findElement(By.id("dob"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}

	public Select getRole() {
		Select selekt = new Select(driver.findElement(By.id("role")));
		return selekt;
	}

	public WebElement getCheckbox(String checkboxValue) {
		return driver.findElement(By.xpath("//*[@type='checkbox'][@value='" + checkboxValue + "']"));
	}

	public WebElement getComment() {
		return driver.findElement(By.id("comment"));
	}

	public WebElement getSubmitButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("submit"), "disabled"));

		return driver.findElement(By.id("submit"));
	}

	public boolean jeSacuvano() {
		boolean jeSacuvano = true;
		List<WebElement> lista = driver.findElements(By.xpath("//div[@style='visibility: visible']"));
		if (lista.size() == 0) {
			jeSacuvano = false;
		}
		return jeSacuvano;

	}
}
