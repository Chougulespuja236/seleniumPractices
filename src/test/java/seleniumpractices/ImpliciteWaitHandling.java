package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImpliciteWaitHandling {

	@Test
	public void verifyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");

		
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		  
		  driver.findElement(By.xpath("//input[@id='sachin']"));
		  
		  driver.findElement(By.xpath("//input[@id='bn']"));
		  
		  driver.findElement(By.xpath("//input[@id='n1']"));
		  
		  driver.findElement(By.xpath("//input[@id='oo']"));
		 

	}

}
