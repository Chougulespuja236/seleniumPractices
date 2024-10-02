package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnoatationExample {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void VerifyURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/");
		System.out.println("VerifyURL");
	}

	@Test
	public void VerifyOrangeCheckbox() {
		WebElement orangecheckbox = driver.findElement(By.cssSelector("input[value='orange']"));
		Assert.assertEquals(orangecheckbox.isSelected(), true);
		System.out.println("VerifyOrangeCheckbox");

	}

	@Test
	public void VerifyBlueCheckbox() {
		WebElement bluecheckbox = driver.findElement(By.cssSelector("input[value='blue']"));
		bluecheckbox.click();
		Assert.assertEquals(bluecheckbox.isSelected(), true);
		System.out.println("VerifyBlueCheckbox");

	}

	@AfterMethod
	public void caterdown() {
		driver.quit();
	}
}
