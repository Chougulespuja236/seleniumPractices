package seleniumpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSLCertificate {

	public static void main(String[] args) {
		
		
		ChromeOptions ChromeOptions=new ChromeOptions();
		ChromeOptions.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ChromeOptions);

		driver.manage().window().maximize();

		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
	}

}
