package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		
		//scroll as per X and Y axis
		
		javascriptExecutor.executeScript("window.scrollBy(0,1500)","");
		
		Thread.sleep(2000);
		
        javascriptExecutor.executeScript("window.scrollBy(0,-2000)","");
		
		Thread.sleep(2000);
		
        javascriptExecutor.executeScript("window.scrollBy(100,0)","");
		
		Thread.sleep(2000);
		
        javascriptExecutor.executeScript("window.scrollBy(-150,0)","");
		
		Thread.sleep(2000);
		
        javascriptExecutor.executeScript("window.scrollBy(150,1000)","");
		
		Thread.sleep(2000);
		//scroll upto located element
		WebElement locateUsingClassTextBox = driver.findElement(By.cssSelector("form[name='form1']input[type='password']\""));

		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", locateUsingClassTextBox);

		locateUsingClassTextBox.sendKeys("Test scroll");
		
		//fully scroll from right and left
		
		javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,document.body.scrollHeight)");
		
		//scroll only width
		javascriptExecutor.executeScript("window.scrollBy(document.body.scrollWidth,0)");
		
		//scroll only height
		javascriptExecutor.executeScript("window.scrollBy(document.body.scrollHeight)");
		
		


	}

}
