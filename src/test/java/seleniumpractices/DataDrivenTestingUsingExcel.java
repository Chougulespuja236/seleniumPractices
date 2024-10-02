package seleniumpractices;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenTestingUsingExcel {
	
	@Test
	public void createnewuser() throws IOException {
		
		
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		  driver.get(Utility.getProperty("newtoulurl"));
		  ArrayList<String> userDetails= Utility.getExcelData("sheet1");
		  
		  driver.findElement(By.name("firstName")).sendKeys(userDetails.get(0));
		  driver.findElement(By.name("lastName")).sendKeys(userDetails.get(1));
		  driver.findElement(By.name("phone")).sendKeys(userDetails.get(2));
		  driver.findElement(By.name("userName")).sendKeys(userDetails.get(3));
		  driver.findElement(By.name("address1")).sendKeys(userDetails.get(4));
		  driver.findElement(By.name("city")).sendKeys(userDetails.get(5));
		  driver.findElement(By.name("state")).sendKeys(userDetails.get(6));
		  driver.findElement(By.name("postalCode")).sendKeys(userDetails.get(7));
		  
		 
		
	}

}
