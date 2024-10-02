package seleniumpractices;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Title of current webpage is:"+driver.getTitle());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Source of current webpage is:"+driver.getPageSource());
		
		
		WebElement Usenametextbox= driver.findElement(By.xpath("//form[@name='form1']/input[@type='text']"));
	    Usenametextbox.sendKeys("Codemind");
	    System.out.println("------------------------------------------------------------------------------------------------------------------------");
	  
	    List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("Numbers of radio button="+radiobuttons.size());
		System.out.println("Values for radiobutton attribute is as below");
		for(WebElement radiobtn:radiobuttons) {
			System.out.println(radiobtn.getAttribute("value"));
		}
		System.out.println("-------------------------------------------------------------------------------------------");
		
		List<WebElement> checkbox =driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("Number of checkbox="+checkbox.size());
		Iterator<WebElement>checkbx= checkbox.iterator();
		System.out.println("Values for checkbox attribute is as below");
		while(checkbx.hasNext()) {		
			System.out.println(checkbx.next().getAttribute("value"));			
		}
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.flipkart.com/");		
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		String WindowHandle=driver.getWindowHandle();
		System.out.println("Current Window Handle is ="+WindowHandle);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		Set<String>WindowHandles=driver.getWindowHandles();
		
		for(String windwhndl:WindowHandles) {
			System.out.println(windwhndl);			
		}
		System.out.println("-----------------------------------------------------------------------------------------------");
				
		driver.close();
		driver.quit();
		
		
		
	}

}
