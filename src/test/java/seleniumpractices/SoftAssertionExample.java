package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
         WebDriver driver;
         SoftAssert verify;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		verify=new SoftAssert();
		
	}
	
	@Test
	public void VerifyTitle() {
		verify.assertEquals(driver.getTitle(), "omayo(QAFox.com)","Title is not matcing with expected title");
		System.out.println("VerifyTitle");
		verify.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/","URL is not matcing with expected url");
		System.out.println("VerifyURL");
		verify.assertTrue(driver.findElement(By.cssSelector("button[id='but2']")).isDisplayed());
		System.out.println("Verifybutton2isEnabled");
		verify.assertAll();
	}
	
	@Test
	public void Verifybutton1isdisplayed() {
		verify.assertFalse(driver.findElement(By.cssSelector("button[id='but1']")).isEnabled());
		System.out.println("Verifybutton1isEnabled");
		verify.assertAll();
	}	
	@AfterMethod
	public void caterdown() {
		driver.quit();
	}
	
}




