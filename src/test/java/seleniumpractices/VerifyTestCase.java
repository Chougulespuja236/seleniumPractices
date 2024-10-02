package seleniumpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTestCase {

	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)", "Invalid Title");
	}
	}
