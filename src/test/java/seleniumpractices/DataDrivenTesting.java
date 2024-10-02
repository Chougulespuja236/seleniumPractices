package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	@Test(dataProvider ="username")
	public void verifyloginprocess(String username,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
		String LoginMessage=driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();
		Assert.assertEquals(LoginMessage, "Login Successfully");
		driver.quit();
	}
	
	@DataProvider(name="username")
	public String[][] Dtaprovider(){
		String[][] user= {{"admin1","admin"},{"admin2","admin"},{"admin3","admin"}};
		return user;
		
		
	}

}
