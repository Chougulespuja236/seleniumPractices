package newtourspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements from home page
	WebElement userName;
	WebElement password;
	WebElement submitBtn;
	WebElement FlightFinderLink;


	// getters and setters for webelements
	public WebElement getUserName() {
		setUserName();
		return userName;
	}

	public void setUserName() {
		this.userName = driver.findElement(By.xpath("//input[@name='userName']"));
	}

	public WebElement getPassword() {
		setPassword();
		return password;
	}

	public void setPassword() {
		this.password = driver.findElement(By.xpath("//input[@name='password']"));
	}

	public WebElement getSubmitBtn() {
		setSubmitBtn();
		return submitBtn;
	}

	public void setSubmitBtn() {
		this.submitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
	}
	 public WebElement getFlightFinderLink() {
		 setFlightFinderLink();
			return FlightFinderLink;
		}

		public void setFlightFinderLink() {
			this.FlightFinderLink = driver.findElement(By.xpath("//a[text()='Flights']"));
		}
	
		//methods

	public void setUsername(String userName) {
		getUserName().clear();
		getUserName().sendKeys(userName);
	}

	public void setPassword(String password) {
		getPassword().clear();
		getPassword().sendKeys(password);
	}

	public void clickOnSubmitBtn() {
		getSubmitBtn().click();
	}
   
	public void clickOnFlightFinderLink() {
		getFlightFinderLink().click();
	}
	
	
}
