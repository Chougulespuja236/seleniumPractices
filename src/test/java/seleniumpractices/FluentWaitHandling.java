package seleniumpractices;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWaitHandling {

	public static void main(String[] args) {
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://omayo.blogspot.com/");

				WebElement invisibletext = driver.findElement(By.cssSelector("#delayedText"));
				
				FluentWait<WebDriver> fluentwait=new FluentWait<WebDriver>(driver);
				fluentwait.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(50))
				.ignoring(TimeoutException.class)
				.until(ExpectedConditions.visibilityOf(invisibletext));
				

				System.out.println(invisibletext.isDisplayed());

				WebElement mybutton = driver.findElement(By.cssSelector("#myBtn"));
				
				System.out.println(mybutton.isEnabled());
				
				WebElement tryitbutton = driver.findElement(By.xpath("//button[text()='Try it']"));
				
				tryitbutton.click();
				
				System.out.println(mybutton.isEnabled());
				
				System.out.println("Disabled attribute value before tryit button click ="+mybutton.getAttribute("disabled"));
				
				fluentwait.until(ExpectedConditions.attributeToBe(mybutton, "disabled", "true"));
				
				System.out.println("Disabled attribute value="+mybutton.getAttribute("disabled"));
				
				System.out.println(mybutton.isEnabled());

			}	

}
