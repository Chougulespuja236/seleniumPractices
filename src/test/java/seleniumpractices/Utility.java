package seleniumpractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {

	static WebDriver driver;

	private Utility() throws IOException {
		if (driver == null) {

			if (getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				Utility.driver = new ChromeDriver();
			} else if (getProperty("browser").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				Utility.driver = new EdgeDriver();
			} else if (getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				Utility.driver = new FirefoxDriver();
			}
		}
	}
	public static WebDriver getDriver() throws IOException {
		new Utility();
		return driver;
	}

	public static String getProperty(String property) throws IOException {

		File file = new File("src/test/resources/b12.properties");
		FileInputStream fileInputStream = new FileInputStream(file);

		Properties properties = new Properties();
		properties.load(fileInputStream);

		String value = properties.getProperty(property);

		fileInputStream.close();

		return value;

	}

	public static ArrayList<String> getExcelData(String sheetname) throws IOException {
		ArrayList<String> userDetails = new ArrayList<String>();
		File file = new File("C:\\Users\\Satish\\Desktop\\Book1.xlsx");
		FileInputStream FileInputStream = new FileInputStream(file);

		XSSFWorkbook xssfworkbook = new XSSFWorkbook(FileInputStream);

		XSSFSheet xssfsheet = xssfworkbook.getSheet(sheetname);
		int lastRowNumber = xssfsheet.getLastRowNum();

		for (int i = 1; i <= lastRowNumber; i++) {
			XSSFRow row = xssfsheet.getRow(i);

			int lastCellNumber = row.getLastCellNum();

			for (int j = 0; j < lastCellNumber; j++) {

				userDetails.add(row.getCell(j).toString());

			}
		}
		FileInputStream.close();
		xssfworkbook.close();
		return userDetails;

	}
	
	public static void selectOptionFromDropDownComminUnderSelectTag(WebElement dropdown, String visibleText) {
		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}

	public static void takesScreenshot(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("src/test/resources/screenshots/" + fileName + ".png"));

	}


	
}
