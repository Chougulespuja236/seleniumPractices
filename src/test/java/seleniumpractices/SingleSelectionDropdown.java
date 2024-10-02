package seleniumpractices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		WebElement singledropdown=driver.findElement(By.cssSelector("#drop1"));
		
		Select select=new Select(singledropdown);
		//print all options
		List<WebElement> singledrpbtn=select.getOptions();
		Iterator<WebElement>it=singledrpbtn.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
		System.out.println("--------------------------------------------------------------");
		
		//return option which is alraedy selected
		System.out.println(select.getFirstSelectedOption().getText());
       System.out.println("--------------------------------------------------------------");
		
		//check given drop down button is allowed to select multiple option
       System.out.println("Given dropdownbutton allowed multiple selection="+select.isMultiple());
       System.out.println("--------------------------------------------------------------");
		
		//select particular action using different method
       select.selectByIndex(1);
       Thread.sleep(500);
       select.selectByValue("ghi");
       Thread.sleep(500);
       select.selectByVisibleText("doc 4");
       Thread.sleep(500);
       
       
	}

}
