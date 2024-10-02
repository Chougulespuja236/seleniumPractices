package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> tableheader=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		
		for(WebElement header:tableheader) {
			System.out.println(header.getText());
		}
		System.out.println("-----------------------------------------------------------------------------");
        List<WebElement> namecolumn=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		
		for(WebElement col1:namecolumn) {
			System.out.println(col1.getText());
		}
		System.out.println("-----------------------------------------------------------------------------");
        List<WebElement> tablebody=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		for(WebElement tbody:tablebody) {
			System.out.println(tbody.getText()+"\t");
		}
		System.out.println("-----------------------------------------------------------------------------");
        List<WebElement> thirdrow=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[3]/td"));
		
		for(WebElement row3:thirdrow) {
			System.out.print(row3.getText()+"\t");
		}
		
	
	
	
	
	
	}

}
