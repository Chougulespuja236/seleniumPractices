package newtourspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservationPage {
	
	WebDriver driver;
	public ReservationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//webelements
	WebElement Flighfliderpagetitle;

	public WebElement getFlighfliderpagetitle() {
		setFlighfliderpagetitle();
		return Flighfliderpagetitle;
	}

	public void setFlighfliderpagetitle() {
		Flighfliderpagetitle = driver.findElement(By.partialLinkText("fter flight fi"));
	}
	
	//method for webelements
	
	public String verifyRegervationpageTitle() {
		return getFlighfliderpagetitle().getText();
		
	}
	

}
