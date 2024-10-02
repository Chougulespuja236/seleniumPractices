package seleniumpractices;

import java.util.Iterator;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		System.out.println("-----------------------------------------------------------");

		WebElement Textarea = driver.findElement(By.cssSelector("textarea#ta1"));
		Textarea.sendKeys("Welcome to Codemind Technology");

		Thread.sleep(2000);

		Textarea.clear();
		System.out.println("-----------------------------------------------------------");
		System.out.println("Value of id attribue is=" + Textarea.getAttribute("id"));
		System.out.println("Value of rows attribue is=" + Textarea.getAttribute("rows"));
		System.out.println("Value of cols attribue is=" + Textarea.getAttribute("cols"));

		WebElement Textareafield = driver.findElement(By.xpath("//textarea[@cols='30']"));
		Textareafield.clear();
		Textareafield.sendKeys("Kids are enjoying in the park");
		System.out.println("-----------------------------------------------------------");
		WebElement dropdownbutton = driver.findElement(By.cssSelector("button.dropbtn"));

		System.out
				.println("Background colour of dropdown button is =" + dropdownbutton.getCssValue("background-color"));
		System.out.println("-----------------------------------------------------------");
		System.out.println("Tagname of dropdown button is =" + dropdownbutton.getTagName());
		System.out.println("-----------------------------------------------------------");
		System.out.println("visible text of dropdown button is =" + dropdownbutton.getText());
		System.out.println("-----------------------------------------------------------");

		List<WebElement> Button = driver.findElements(By.cssSelector("input[type='button']"));

		System.out.println("Number of button on webpage is=" + Button.size());
		System.out.println("---------------------------------------------------------------");
		System.out.println("valus of button is as mentioned below");
		for (WebElement btn : Button) {
			System.out.println(btn.getAttribute("value"));
		}
		System.out.println("----------------------------------------------------------------");
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

		System.out.println("Number of button on webpage is=" + hyperlinks.size());
		System.out.println("-------------------------------------------------------------");
		// System.out.println("value for href attribute in tage name 'a' is");
		Iterator<WebElement> hyprlinksIterator = hyperlinks.iterator();

		while (hyprlinksIterator.hasNext()) {
			System.out.println(hyprlinksIterator.next().getAttribute("href"));

		}
		System.out.println("-------------------------------------------------------------");

		// get text method
		System.out.println("Text for given webelement location is= "
				+ driver.findElement(By.cssSelector("#table1")).findElement(By.xpath("//tbody/tr/td[3]")).getText());
		
		System.out.println("Text for given webelement location is= "
				+ driver.findElement(By.cssSelector("#table1")).findElement(By.xpath("//tbody/tr[4]/td[2]")).getText());
		
		System.out.println("-------------------------------------------------------------");

		// .getHeight & .getwidth method
		WebElement button2 = driver.findElement(By.cssSelector("#but2"));
		
		System.out.println("Height of button2 is=" + button2.getSize().getHeight());
		
		System.out.println("width of button2 is=" + button2.getSize().getWidth());
		
		System.out.println("-------------------------------------------------------------");

		// Get screenshot method
		File screenshot = button2.getScreenshotAs(OutputType.FILE);
		
		System.out.println(screenshot.getAbsolutePath());
		 
		Files.copy(screenshot, new File("C:\\Users\\Satish\\Desktop\\Manual Testing\\Screenshots\\scr.pnj"));
		
		System.out.println("-------------------------------------------------------------");

		// .isDisplayed method
		System.out.println("button2 is displayed=" + button2.isDisplayed());

		WebElement hbutton = driver.findElement(By.cssSelector("#hbutton"));
		System.out.println("hbutton is displayed=" + hbutton.isDisplayed());
		System.out.println("-------------------------------------------------------------");

		// .isEnabled method

		WebElement MrOptioncheckbox = driver.findElement(By.cssSelector("#dte"));
		System.out.println("MrOptioncheckbox is Enabled=" + MrOptioncheckbox.isEnabled());

		WebElement DoubleclickHereButton = driver.findElement(By.cssSelector("button[ondblclick='dblclickAlert()']"));
		System.out.println("DoubleclickHereButton is Enabled=" + DoubleclickHereButton.isEnabled());
		System.out.println("-------------------------------------------------------------");

		// isSelected method
		WebElement BikeVehicleButton = driver.findElement(By.cssSelector("input[value='Bike']"));
		System.out.println("BikeVehicleButton is selected=" + BikeVehicleButton.isSelected());
		BikeVehicleButton.click();
		System.out.println("BikeVehicleButton is selected=" + BikeVehicleButton.isSelected());

		WebElement BicycleVehicleButton = driver.findElement(By.cssSelector("input[value='Bicycle']"));
		System.out.println("BicycleVehicleButton is selected=" + BicycleVehicleButton.isSelected());
		BicycleVehicleButton.click();
		System.out.println("BicycleVehicleButton is selected=" + BicycleVehicleButton.isSelected());

		System.out.println("-------------------------------------------------------------");

		// getLocation method
		WebElement HOME = driver.findElement(By.cssSelector("a[href='https://omayo.blogspot.com/']"));
		Point point = HOME.getLocation();
		System.out.println("length of X axis is=" + point.getX());
		System.out.println("length of y axis is=" + point.getY());

	}

}
