package seleniumpractices;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDatePicker {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		driver.findElement(By.cssSelector("input#datetimepicker1")).click();
		WebElement yearbox=driver.findElement(By.cssSelector("input[aria-label='Year']"));
		yearbox.clear();
		yearbox.sendKeys("1996");
		
		Select select=new Select(driver.findElement(By.cssSelector("select[aria-label='Month']")));
		select.selectByVisibleText("January");
		
		//List<WebElement> dates=driver.findElements(By.xpath("//div[@class='dayContainer'][1]//span[@class='flatpickr-day' and not (@nextMonthDay)]"));
		//		for(WebElement date:dates) {
		//			if(date.getText().equals("2")) {
		//				date.click();
		//			}
		//		}
				
		driver.findElement(By.xpath("//span[@aria-label='January 2, 1996']")).click();
		
		driver.findElement(By.xpath("//h1[text()='Date Picker']")).click();
		
		
		
	}

}
