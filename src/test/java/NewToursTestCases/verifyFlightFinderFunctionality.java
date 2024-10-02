package NewToursTestCases;

import org.testng.annotations.Test;

import newtourspages.FlightFinderPage;
import newtourspages.HomePage;
import newtourspages.ReservationPage;

public class verifyFlightFinderFunctionality extends BaseTest {
	
	HomePage homepage;
	FlightFinderPage flightfinderpage;
	ReservationPage reservationpage;
	
	@Test
	public void verifyFlightfinderfunctionality() {
		homepage=new HomePage(driver);
		flightfinderpage=new FlightFinderPage(driver);
		reservationpage=new ReservationPage(driver);
		
		homepage.clickOnFlightFinderLink();
		flightfinderpage.getFlightTypeRadiBtn();
		flightfinderpage.selectPassentCount("4");
		flightfinderpage.selectDepartingplaceFromeDropbox("London");
		flightfinderpage.selectDepartingMonthfromDropBox("March");
		flightfinderpage.selectDepartingDatefromDropBox("15");
		flightfinderpage.selectArrivingplaceInDropBox("Frankfurt");
		flightfinderpage.selectArrivingMonthfromDropBox("December");
		flightfinderpage.selectArrivingDatefromDropBox("2");
		flightfinderpage.selectServiceClassRadioButton();
		flightfinderpage.selectAirlineDropbox("Pangea Airlines");
		flightfinderpage.clickonContinuebtn();
		
		
		
	}
	
	
	
	

}
