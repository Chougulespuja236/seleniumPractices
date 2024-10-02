package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsSwiggy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("Title of current webpage is:"+driver.getTitle());
		System.out.println("Source of current webpage is:"+driver.getPageSource());
		
		WebElement Search= driver.findElement(By.linkText(("//span[text()='Search'")));
		Search.click();
		
		
	}

}
