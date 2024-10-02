package seleniumpractices;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement frame1=driver.findElement(By.cssSelector("iframe[id=\"navbar-iframe\"]"));
		driver.switchTo().frame(frame1);
		
		WebElement searchbox=driver.findElement(By.cssSelector("#b-query:nth-child(1)"));
		searchbox.sendKeys("Welcome to pune");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("#checkbox2")).click();
		
		driver.switchTo().frame(frame1);
		searchbox.clear();
		
	}

}
