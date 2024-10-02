package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		WebElement invisibletext = driver.findElement(By.cssSelector("#delayedText"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(invisibletext));

		System.out.println(invisibletext.isDisplayed());

		WebElement mybutton = driver.findElement(By.cssSelector("#myBtn"));
		
		System.out.println(mybutton.isEnabled());
		
		WebElement tryitbutton = driver.findElement(By.xpath("//button[text()='Try it']"));
		
		tryitbutton.click();
		
		System.out.println(mybutton.isEnabled());
		
		System.out.println(mybutton.getAttribute("disabled"));
		
		wait.until(ExpectedConditions.attributeToBe(mybutton, "disabled", "true"));
		
		System.out.println("Disabled attribute value="+mybutton.getAttribute("disabled"));
		
		System.out.println(mybutton.isEnabled());

	}

}