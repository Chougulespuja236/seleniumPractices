package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceActiionProgrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("//textarea[@aria-owns=\"Alh6id\"]"))).build().perform();
		
		action.doubleClick(driver.findElement(By.xpath("//textarea[@aria-owns=\"Alh6id\"]"))).keyDown("i").keyDown("n").keyDown("d").keyDown("i").keyDown("a").build().perform();

		action.keyDown(Keys.SHIFT).keyDown("D").keyUp(Keys.SHIFT).keyUp("D").keyDown("o").build().perform();
		
		action.contextClick().perform();

		action.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Google apps']"))).build().perform();

		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		WebElement source = driver.findElement(By.cssSelector("#draggable"));

		WebElement target = driver.findElement(By.cssSelector("#droppable"));

		action.dragAndDrop(source, target).build().perform();


	}

}
