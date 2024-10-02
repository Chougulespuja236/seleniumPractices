package seleniumpractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#alert1")).click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
			
		WebElement Password=driver.findElement(By.cssSelector("form[name='form1']input[type='password']"));
		Password.sendKeys("12345");
		Thread.sleep(5000);
		WebElement GetPrompt=driver.findElement(By.cssSelector("#prompt"));
		GetPrompt.click();
		Thread.sleep(5000);
		Alert alert1=driver.switchTo().alert();
		alert1.accept();

		Password.clear();
		Thread.sleep(5000);
		
	}

}
