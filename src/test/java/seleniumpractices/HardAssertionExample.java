package seleniumpractices;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertionExample {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");		
	}
	
	@Test
	public void VerifyTitle() {
		Assert.assertEquals(driver.getTitle(), "omayo(QAFox.com)","Title is not matcing with expected title");
		System.out.println("VerifyTitle");
		Assert.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/","URL is not matcing with expected url");
		System.out.println("VerifyURL");
		Assert.assertTrue(driver.findElement(By.cssSelector("button[id='but2']")).isDisplayed());
		System.out.println("Verifybutton2isEnabled");
	}
	
	@Test
	public void Verifybutton1isdisplayed() {
		Assert.assertFalse(driver.findElement(By.cssSelector("button[id='but1']")).isEnabled());
		System.out.println("Verifybutton1isEnabled");
	}	
	@AfterMethod
	public void caterdown() {
		driver.quit();
	}
	
	

	}


