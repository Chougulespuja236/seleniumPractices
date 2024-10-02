package NewToursTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import newtourspages.HomePage;
import newtourspages.LoginSucessPage;

public class VerifyValidLogin extends BaseTest {

	HomePage homePage;
	LoginSucessPage loginSuccessPage;

	@Test
	public void verifyValidLogin() {
		homePage = new HomePage(driver);
		loginSuccessPage = new LoginSucessPage(driver);

		homePage.setUsername("admin1");
		homePage.setPassword("admin1");
		homePage.clickOnSubmitBtn();

		String loginSuccessMsg = loginSuccessPage.getLoginSuccessText();

		Assert.assertEquals(loginSuccessMsg, "Login Successfully");
	}

}
