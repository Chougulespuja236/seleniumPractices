package seleniumpractices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement PopupWindow= driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		PopupWindow.click();
		
		String Parentwindow=driver.getWindowHandle();
		
		Set<String> windowhandle= driver.getWindowHandles();
		for(String handle:windowhandle) {
			if(handle.equals(Parentwindow)) {
				continue;
			}else {
				driver.switchTo().window(handle);
			}
		}
		String windowhandletitle=driver.getTitle();
		System.out.println("Title of current window="+windowhandletitle);
		driver.close();
		System.out.println("-----------------------------------------------------------------------------");
		driver.switchTo().window(Parentwindow);
		WebElement bagcheckbox=driver.findElement(By.cssSelector("input[value='Bag']"));
		bagcheckbox.click();
		System.out.println("Attribute value for givem web element is="+bagcheckbox.getAttribute("type"));
		System.out.println("Attribute value for givem web element is="+bagcheckbox.getAttribute("value"));
		System.out.println("Attribute value for givem web element is="+bagcheckbox.getAttribute("name"));
		
		
	}

}
