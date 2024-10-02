package seleniumpractices;

     import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParallenTesting {
	WebDriver driver;
    SoftAssert verify;

@BeforeMethod(alwaysRun = true)
public void setup() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");		
}

@Test(groups = { "smoke" })
public void VerifyTitle() {
	verify=new SoftAssert();
	WebElement gettext=driver.findElement(By.cssSelector("p[id='pah']"));
	String str=gettext.getText();
	verify.assertEquals(str, "  PracticeAutomationHere");
	verify.assertAll();	
			
}
@Test(groups = { "smoke" })
public void VerifyURL() {
	verify=new SoftAssert();
	verify.assertEquals(driver.getCurrentUrl(), "https://omayo.blogspot.com/","URL is not matcing with expected url");
	verify.assertAll();
}
@Test(groups = { "sanity","smoke" })
public void Verifybutton2isEnabled() {
	verify=new SoftAssert();
	verify.assertTrue(driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());	
}
@Test(groups = { "regression" })
public void Verifybutton1isdisplayed() {
	verify=new SoftAssert();
	verify.assertFalse(driver.findElement(By.cssSelector("input[value='Laptop']")).isSelected());	
	verify.assertAll();
}
@Test(groups = { "sanity" })
public void VerifyMultiselectionDropdown() {
	verify=new SoftAssert();
	
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









