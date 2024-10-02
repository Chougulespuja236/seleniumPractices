package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://omayo.blogspot.com/");
	
	WebElement fileuploader=driver.findElement(By.cssSelector("#uploadfile"));
	
	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
	
	javascriptExecutor.executeScript("arguments[0].scrollIntoView();", fileuploader);
	
	fileuploader.sendKeys("C:\\Users\\Satish\\Documents\\ExceptionHandling.pdf");

	}

}
