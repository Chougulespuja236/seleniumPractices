package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		WebElement multiselecdropdown = driver.findElement(By.cssSelector("#multiselect1"));

		Select select = new Select(multiselecdropdown);
		// return all options of dropbutton
		List<WebElement> multidrpbtn = select.getOptions();

		for (WebElement drpbtn : multidrpbtn) {
			System.out.println(drpbtn.getText());
		}

		System.out.println("---------------------------------------------------------");
		// select option using methods
		select.selectByIndex(3);
		select.selectByValue("Hyundaix");
		select.selectByVisibleText("Swift");
		System.out.println("--------------------------------------------------------------");

		// return first selected option
		System.out.println("First selected option forgiven button is=" + select.getFirstSelectedOption().getText());
		System.out.println("--------------------------------------------------------------------");

		// check given drop down button is allowed to select multiple option
		System.out.println("Given dropdownbutton allowed multiple selection=" + select.isMultiple());
		System.out.println("--------------------------------------------------------------");

		// return onlyy selected options
		List<WebElement> multidrpbtn1 = select.getAllSelectedOptions();

		for (WebElement drpbtn1 : multidrpbtn1) {
			System.out.println(drpbtn1.getText());
		}
		System.out.println("-------------------------------------------------------------");
		// deselect all
		select.deselectAll();

		// select option using methods
		select.selectByIndex(2);
		select.selectByValue("volvox");
		select.selectByVisibleText("Audi");
		select.selectByVisibleText("Swift");

		// deslect option
		select.deselectByIndex(1);
		select.deselectByValue("volvox");
		select.deselectByVisibleText("Hyundai");

	}

}
