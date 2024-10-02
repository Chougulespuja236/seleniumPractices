package newtourspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumpractices.Utility;

public class FlightFinderPage {
	WebDriver driver;
	 public FlightFinderPage(WebDriver driver) {
		 this.driver=driver;
	 }

	WebElement FlightTypeRadiBtn;
	WebElement PassengderDropBox;
	WebElement DepartingFromDropbox;
	WebElement DateSelectMonthDropbox;
	WebElement DateSelectDateDropbox;
	WebElement ArrivingInDropbox;
	WebElement ReturningInMonthDropbox;
	WebElement ReturningInDateDropbox;
	WebElement ServiceClassRadiobtn;
	WebElement AirlinDropbox;
	WebElement Continuebtn;
	
	//Getter and selectter for webelements
	
	public WebElement getFlightTypeRadiBtn() {
		selectFlightTypeRadiBtn();
		return FlightTypeRadiBtn;
	}
	public void selectFlightTypeRadiBtn() {
		this.FlightTypeRadiBtn = driver.findElement(By.cssSelector("input[value='oneway']"));
	}
	public WebElement getPassengderDropBox() {
		selectPassengderDropBox();
		return PassengderDropBox;
	}
	public void selectPassengderDropBox() {
		this.PassengderDropBox = driver.findElement(By.cssSelector("select[name='passCount']"));
	}
	public WebElement getDepartingFromDropbox() {
		selectDepartingFromDropbox();
		return DepartingFromDropbox;
	}
	public void selectDepartingFromDropbox() {
		this.DepartingFromDropbox = driver.findElement(By.cssSelector("select[name='fromPort']"));
	}
	public WebElement getSelectMonthDropbox() {
		selectSelectMonthDropbox();
		return DateSelectMonthDropbox;
	}
	public void selectSelectMonthDropbox() {
		this.DateSelectMonthDropbox = driver.findElement(By.className("select[name='fromMonth']"));
	}
	public WebElement getDateSelectDateDropbox() {
		selectDateSelectDateDropbox();
		return DateSelectDateDropbox;
	}
	public void selectDateSelectDateDropbox() {
		this.DateSelectDateDropbox = driver.findElement(By.className("select[name='fromDay']"));
	}
	public WebElement getArrivingInDropbox() {
		selectArrivingInDropbox();
		return ArrivingInDropbox;
	}
	public void selectArrivingInDropbox() {
		this.ArrivingInDropbox =  driver.findElement(By.className("select[name='toPort']"));
	}
	public WebElement getReturningInMonthDropbox() {
		selectReturningInMonthDropbox();
		return ReturningInMonthDropbox;
	}
	public void selectReturningInMonthDropbox() {
		this.ReturningInMonthDropbox =  driver.findElement(By.className("select[name='toMonth']"));
	}
	public WebElement getReturningInDateDropbox() {
		selectReturningInDateDropbox();
		return ReturningInDateDropbox;
	}
	public void selectReturningInDateDropbox() {
		this.ReturningInDateDropbox =  driver.findElement(By.className("select[name='toDay']"));
	}
	public WebElement getServiceClassRadiobtn() {
		selectServiceClassRadiobtn();
		return ServiceClassRadiobtn;
	}
	public void selectServiceClassRadiobtn() {
		this.ServiceClassRadiobtn =  driver.findElement(By.className("input[name='servClass']"));
	}
	public WebElement getAirlinDropbox() {
		selectAirlinDropbox();
		return AirlinDropbox;
	}
	public void selectAirlinDropbox() {
		this.AirlinDropbox =  driver.findElement(By.className("select[name='airline']"));
	}
		
	
	public WebElement getContinuebtn() {
		return Continuebtn;
	}
	public void selectContinuebtn(WebElement continuebtn) {
		Continuebtn = driver.findElement(By.className("select[name='findFlights']"));
	}
	
	
	//methods for all webelements
		public void selectFlightType() {
			getFlightTypeRadiBtn().click();
		}	
		
		public void selectPassentCount(String passengercount) {
			Utility.selectOptionFromDropDownComminUnderSelectTag(getPassengderDropBox(), passengercount);
			
		}
		public void selectDepartingplaceFromeDropbox(String departingplace) {
			Utility.selectOptionFromDropDownComminUnderSelectTag(getDepartingFromDropbox(), departingplace);
			
		}
		public void selectDepartingMonthfromDropBox(String departingmonth) {
			Utility.selectOptionFromDropDownComminUnderSelectTag(getSelectMonthDropbox(), departingmonth);
			
		}
		
		public void selectDepartingDatefromDropBox(String departingdate) {
			Utility.selectOptionFromDropDownComminUnderSelectTag(getDateSelectDateDropbox(), departingdate);
			
		}
		
		public void selectArrivingplaceInDropBox(String arrivingplace) {
			Utility.selectOptionFromDropDownComminUnderSelectTag(getArrivingInDropbox(), arrivingplace);
			
		}
		
		public void selectArrivingMonthfromDropBox(String arrivingmoth) {
			Utility.selectOptionFromDropDownComminUnderSelectTag(getReturningInMonthDropbox(), arrivingmoth);
			
		}
		
		public void selectArrivingDatefromDropBox(String arrivingdate) {
			Utility.selectOptionFromDropDownComminUnderSelectTag(getReturningInDateDropbox(), arrivingdate);
			
		}
		
		public void selectServiceClassRadioButton() {
			getServiceClassRadiobtn().click();
			
		}
		
		public void selectAirlineDropbox(String airline) {
			Utility.selectOptionFromDropDownComminUnderSelectTag(getAirlinDropbox(), airline);
		}
		
		public void clickonContinuebtn() {
			getContinuebtn().click();
		}
		
		

}
