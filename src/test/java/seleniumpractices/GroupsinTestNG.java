package seleniumpractices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GroupsinTestNG {

	 WebDriver driver;
     SoftAssert verify;

@BeforeMethod(alwaysRun = true)
public void setup() throws IOException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Utility.getProperty("url"));	
	verify=new SoftAssert();
}

@Test(groups = { "regression" })
public void VerifyTitle() {
	WebElement gettext=driver.findElement(By.cssSelector("p[id='pah']"));
	String str=gettext.getText();
	verify.assertEquals(str, "PracticeAutomationHere");
	verify.assertAll();
			
}
@Test(groups = { "smoke" })
public void VerifyURL() {
	verify.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/","URL is not matcing with expected url");
	verify.assertAll();
}
@Test(groups = { "sanity","smoke" })
public void Verifybutton2isEnabled() {
	verify.assertTrue(driver.findElement(By.cssSelector("input[value='Bike']")).isEnabled());	
	verify.assertAll();
}
@Test(groups = { "regression" })
public void Verifybutton1isdisplayed() {
	verify.assertFalse(driver.findElement(By.cssSelector("input[value='Laptop']")).isSelected());	
	verify.assertAll();
}
@Test(groups = { "sanity" })
public void VerifyMultiselectionDropdown() {
	
	ArrayList<String> Expectedoption=new ArrayList<String>();
	Expectedoption.add("Volvo");
	Expectedoption.add("Swift");
	Expectedoption.add("Hyundai");
	Expectedoption.add("Audi");
	
	Select select=new Select(driver.findElement(By.cssSelector("select[id='multiselect1']")));
	List<WebElement>actualoptions=select.getOptions();
	ArrayList<String> dropdownoption=new ArrayList<String>();
	
	for(WebElement option:actualoptions) {
		System.out.println(dropdownoption.add(option.getText()));
	}
	verify.assertEquals(dropdownoption, Expectedoption, "Dropdown options are not matching");
	verify.assertAll();
}

     @AfterMethod(alwaysRun = true)
public void tearDown() {
	
	driver.quit();
}



}







