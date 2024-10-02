package newtourspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSucessPage {

	WebDriver driver;

	public LoginSucessPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements from home page
	WebElement LoginSuccessMsg;

	// getters and setters for webelements
	public WebElement getLoginSuccessMsg() {
		setLoginSuccessMsg();
		return LoginSuccessMsg;
	}

	public void setLoginSuccessMsg() {
		LoginSuccessMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	}

	public String getLoginSuccessText() {
		return getLoginSuccessMsg().getText();
	}

}
