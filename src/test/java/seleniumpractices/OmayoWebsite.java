package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoWebsite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriverMethod1
		//Load a new web page in the current browser window.
		driver.get("https:///omayo.blogspot.com");
		driver.manage().window().maximize();
		
		//Finding locator using locator strategies
		
	     //1.By Name=A By which locates elements by the value of the "name" attribute
		WebElement element=driver.findElement(By.name("gender"));
		element.click();
		
		//stops thread execution for 3000seconds
		Thread.sleep(3000);
		
		
		//2.by id attribute value=A By which locates elements by their tag name.
		driver.findElement(By.id("radio2")).click();
		List<WebElement> Linksonpage=driver.findElements(By.tagName("a"));
		
		System.out.println("Number of webelement="+Linksonpage.size());
		
		//3.By Tag Name=A By which locates elements by their tag name.
        List<WebElement> Linksonpage1=driver.findElements(By.tagName("img"));
		
		System.out.println("Number of images ="+Linksonpage1.size());
		
		//4.By LinkText = A By which locates A elements by the exact text it displays.	
		driver.findElement(By.linkText("Open a popup window")).click();
		
		WebElement PageOnlink=driver.findElement(By.linkText("Page One"));
		
		//find value of given attribute
		System.out.println("Value of given attribute is="+PageOnlink.getAttribute("href"));
		
		//5.By Partial LinkText = a By which locates elements that contain the given link text.
		WebElement SeleniumTutorial =driver.findElement(By.partialLinkText("niumTu"));
		System.out.println("Value of given attribute is="+SeleniumTutorial.getAttribute("href"));
	}

}
